package com.kodilla.good.patterns.srp;

public class ProductOrderProcessor {
    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductOrderRepository productOrderRepository;

    public ProductOrderProcessor(final InformationService informationService,
                                 final ProductOrderService productOrderService, final ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }

    public ProductOrderDto process(final ProductOrderRequest request) {
        boolean isSold = productOrderService.order(request.getUser(),
                request.getProduct(), request.getAmount(), request.getOrderDate());
        if (isSold) {
            informationService.inform(request.getUser(),request.getProduct(), request.getAmount(), request.getOrderDate());
            productOrderRepository.createOrder(request.getUser(), request.getProduct(), request.getAmount(), request.getOrderDate());
            return new ProductOrderDto(request.getUser(), request.getProduct(), request.getAmount(), request.getOrderDate(), true);
        } else {
            return new ProductOrderDto(request.getUser(), request.getProduct(), request.getAmount(), request.getOrderDate(), false);
        }
    }
}

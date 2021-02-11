package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.provider.ProviderService;

public class Food2DoorProcessor {
    private InformationService informationService;
    private ProviderService providerService;
    private RepositoryService repositoryService;

    public Food2DoorProcessor(InformationService informationService, ProviderService providerService, RepositoryService repositoryService) {
        this.informationService = informationService;
        this.providerService = providerService;
        this.repositoryService = repositoryService;
    }

    public OrderDto orderProcess(final OrderRequest request) {
        boolean isAvailable = providerService.process(request.getProduct(), request.getAmount());
        if (isAvailable) {
            informationService.inform(request.getProduct(), request.getAmount());
            repositoryService.CreateOrder(request.getProduct(), request.getAmount(), providerService.getName());
            return new OrderDto(request.getAmount(), request.getProduct(), true);
        } else {
            return new OrderDto(request.getAmount(), request.getProduct(), false);
        }
    }
}

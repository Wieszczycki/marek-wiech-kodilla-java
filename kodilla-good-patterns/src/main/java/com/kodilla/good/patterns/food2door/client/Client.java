package com.kodilla.good.patterns.food2door.client;

public class Client {
    private String clientName;

    public Client(String clientName) {
        this.clientName = clientName;
    }

    public String getClientName() {
        return clientName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        return clientName.equals(client.clientName);
    }

    @Override
    public int hashCode() {
        return clientName.hashCode();
    }
}

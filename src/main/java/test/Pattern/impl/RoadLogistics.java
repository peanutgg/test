package test.Pattern.impl;

public class RoadLogistics extends Logistics {
    void planDelivery() {

    }

    Transport createTransport() {

        return new Trunk();
    }
}

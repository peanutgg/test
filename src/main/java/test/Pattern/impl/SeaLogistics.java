package test.Pattern.impl;

public class SeaLogistics extends Logistics {

    void planDelivery() {

    }

    Transport createTransport() {

        return new Ship();
    }
}

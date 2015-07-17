package com.gulci;

public class JoyRide {

    private Car myCar;

    public void park(Car auto) {
        myCar = auto;
    }

    public Car whatsInTheGarage() {
        return myCar;
    }

    public void letsGo() {
        park(new Ragtop());
        whatsInTheGarage().drive();
    }
}

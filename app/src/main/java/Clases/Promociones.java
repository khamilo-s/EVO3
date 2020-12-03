package Clases;

public class Promociones {

    private int Pizzas_promo;
    private int Master_pizza;
    private int Pizza_max;

    public Promociones (){

        Pizzas_promo = 5990;
        Master_pizza = 12990;
        Pizza_max = 18500;
    }

    public double getPizzas_promo() {
        return Pizzas_promo;
    }

    public double getMaster_pizza() {
        return Master_pizza;
    }

    public double getPizza_max() {
        return Pizza_max;
    }
}

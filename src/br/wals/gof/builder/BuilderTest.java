package br.wals.gof.builder;

public class BuilderTest {

    public static void run() {
        Waiter waiter = new Waiter();
        PizzaBuilder pizzaBuilder;

        pizzaBuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder(pizzaBuilder);
        waiter.constructPizza();

        pizzaBuilder = new SpicyPizzaBuilder();
        waiter.setPizzaBuilder(pizzaBuilder);
        waiter.constructPizza();
    }
}

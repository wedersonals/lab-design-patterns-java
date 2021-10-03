package br.wals.gof.builder;

abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();

    public String getName() {
        return this.getClass().getSimpleName().replace("PizzaBuilder", "");
    }
}

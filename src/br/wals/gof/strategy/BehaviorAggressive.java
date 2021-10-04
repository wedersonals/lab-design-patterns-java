package br.wals.gof.strategy;

public class BehaviorAggressive implements Behavior {
    @Override
    public void move() {
        System.out.println("Moving aggressively...");
    }
}

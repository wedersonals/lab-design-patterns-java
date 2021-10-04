package br.wals.gof.strategy;

public class BehaviorDefensive implements Behavior {
    @Override
    public void move() {
        System.out.println("Moving defensively...");
    }
}

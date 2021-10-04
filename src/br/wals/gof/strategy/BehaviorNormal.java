package br.wals.gof.strategy;

public class BehaviorNormal implements Behavior {
    @Override
    public void move() {
        System.out.println("Moving normally...");
    }
}

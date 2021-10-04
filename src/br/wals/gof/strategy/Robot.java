package br.wals.gof.strategy;

public class Robot {
    private Behavior behavior;

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public void mover() {
        behavior.move();
    }

}

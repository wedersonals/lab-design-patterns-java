package br.wals.gof.strategy;

public class StrategyTest {

    public static void run() {
        System.out.println("\n> Strategy");
        Behavior normal = new BehaviorNormal();
        Behavior aggressive = new BehaviorAggressive();
        Behavior defensive = new BehaviorDefensive();

        Robot robot = new Robot();
        robot.setBehavior(normal);
        robot.mover();
        robot.mover();

        robot.setBehavior(defensive);
        robot.mover();
        robot.mover();

        robot.setBehavior(aggressive);
        robot.mover();
        robot.mover();
    }
}

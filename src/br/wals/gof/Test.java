package br.wals.gof;

import br.wals.gof.abstractfactory.AbstractFactoryTest;
import br.wals.gof.builder.BuilderTest;
import br.wals.gof.facade.FacadeTest;
import br.wals.gof.factory.FactoryTest;
import br.wals.gof.prototype.PrototypeTest;
import br.wals.gof.singleton.SingletonTest;
import br.wals.gof.strategy.StrategyTest;

public class Test {

    public static void main(String[] args) {
        FacadeTest.run();
        StrategyTest.run();

        runCreationalDesignPatterns();
    }

    private static void runCreationalDesignPatterns() {
        SingletonTest.run();
        FactoryTest.run();
        AbstractFactoryTest.run();
        BuilderTest.run();
        PrototypeTest.run();
    }
}

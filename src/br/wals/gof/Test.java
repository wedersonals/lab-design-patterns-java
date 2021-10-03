package br.wals.gof;

import br.wals.gof.abstractfactory.AbstractFactoryTest;
import br.wals.gof.adapter.AdapterTest;
import br.wals.gof.bridge.BridgeTest;
import br.wals.gof.builder.BuilderTest;
import br.wals.gof.decorator.DecoratorTest;
import br.wals.gof.facade.FacadeTest;
import br.wals.gof.factory.FactoryTest;
import br.wals.gof.prototype.PrototypeTest;
import br.wals.gof.singleton.SingletonTest;
import br.wals.gof.strategy.StrategyTest;

public class Test {

    public static void main(String[] args) {
        runBehavioralDesignPatterns();
        runCreationalDesignPatterns();
        runStructuralDesignPatterns();
    }

    private static void runBehavioralDesignPatterns() {
        StrategyTest.run();
    }

    private static void runStructuralDesignPatterns() {
        FacadeTest.run();
        AdapterTest.run();
        DecoratorTest.run();
        BridgeTest.run();
    }

    private static void runCreationalDesignPatterns() {
        SingletonTest.run();
        FactoryTest.run();
        AbstractFactoryTest.run();
        BuilderTest.run();
        PrototypeTest.run();
    }
}

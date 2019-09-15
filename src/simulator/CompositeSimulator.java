package simulator;

import composite.Flock;
import decorator.QuackThree;
import factory.DuckFactory;
import quack.Quackable;

public class CompositeSimulator extends Simulator {

    private DuckFactory factory;

    @Override
    public void setFactory(DuckFactory fac) {
        this.factory = fac;
    }

    @Override
    public void startSimulation() {

        Quackable redHeadDuck = factory.makeRedheadDuck();
        Quackable mallardDuck = factory.makeMallardDuck();
        Quackable rubbleDuck = factory.makeRubberDuck();
        Quackable duckCall = factory.makeDuckCall();
        Quackable goose = factory.makeGoose();
        Quackable pigeon = factory.makePigeon();

        Flock flock = new Flock();
        flock.add(new QuackThree(redHeadDuck));
        flock.add(mallardDuck);
        flock.add(rubbleDuck);
        flock.add(duckCall);
        flock.add(goose);
        flock.add(pigeon);

        flock.quack();
    }
}

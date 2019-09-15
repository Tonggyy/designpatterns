package decorator;

import ducks.Pigeon;
import quack.Quackable;

public class QuackTwo implements Quackable {

    private Pigeon pigeon;

    public QuackTwo(Pigeon pigeon){
        this.pigeon = pigeon;
    }

    public void call(){
        this.pigeon.coo();
    }

    @Override
    public void quack() {
        call();
        call();
        System.out.println();
    }
}

package decorator;

import quack.Quackable;

public class QuackThree implements Quackable {

    private Quackable one;

    public QuackThree(Quackable one){
        this.one = one;
    }

    @Override
    public void quack() {
        System.out.println("This duck is master.");
        this.one.quack();
        this.one.quack();
        this.one.quack();
        System.out.println(".....");
    }
}

package composite;

import quack.Quackable;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {

    private List<Quackable> flock = new ArrayList<>();

    @Override
    public void quack() {
        for (Quackable q:flock
             ) {
            q.quack();
        }
    }

    public void add(Quackable q){
        flock.add(q);
    }
}

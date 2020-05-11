package strategy.duck;

public class ModelDuck extends Duck {
    @Override
    void display() {
        System.out.println("I`m a model duck");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}

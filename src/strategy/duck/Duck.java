package strategy.duck;

public abstract class Duck {
    FlyBehavior flyBehavior; //Каждый объект Duck содержит ссылку на реализацию FlyBehavior и QuackBehavior
    QuackBehavior quackBehavior;

    void performQuack() {
        quackBehavior.quack(); //Duck объект делегирует поведение объекту , на который ссылается quackBehavior
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    void swim() {
        System.out.println("All ducks float!!");
    }

   abstract void display();

    void performFly(){
        flyBehavior.fly();
    }

    public Duck() {
    }
}

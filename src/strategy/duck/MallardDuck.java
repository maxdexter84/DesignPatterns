package strategy.duck;

public class MallardDuck extends Duck{
    public MallardDuck() {
        //Эти переменные наследуются от класса Duck
        quackBehavior = new Quack();//в качестве реализации поведения QuackBehavior используется класс Quack(крякающая утка)
        flyBehavior = new FlyWithWings();//в качестве реализации поведения FlyBehavior используется класс FlWithWings(летающая утка)
    }
    public void display(){
        System.out.println("I`m a real Mallard duck");
    }
}

package patos;

import quacks.QuackBehavior;
import voos.FlyBehavior;

public abstract class Duck {
	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;
	public Duck() {
		
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("Todos os patos boiam, até os falsos!");
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}

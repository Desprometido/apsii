package patos;

import quacks.*;
import voos.*;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("Eu sou um verdadeiro Pato Real!");
	}
}

package patos;

import quacks.*;
import voos.*;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	
	public void display() {
		System.out.println("Eu sou um pato de modelo!");
	}
}

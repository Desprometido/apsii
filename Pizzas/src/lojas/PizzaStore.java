package lojas;
import pizza.*;

public abstract class PizzaStore {
	public abstract Pizza createPizza(String item);
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("Fazendo Pizza...");
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}

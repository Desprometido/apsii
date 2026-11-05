package pizza;
import fabrica.*;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	public void prepare() {
		System.out.print("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}

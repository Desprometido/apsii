package chicago;
import toppings.*;
import fabrica.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
	
	public Dough createDough() {
		return new ThickCrustDough();
	}
	
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
	
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}
	
	public Veggies[] createVeggies() {
		Veggies veggies[] = {new Olives(), new Spinach(), new Eggplant()};
		return veggies;
	}
	
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	
	public Clam createClam() {
		return new FrozenClam();
	}
}

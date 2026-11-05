package lojas;
import pizza.*;
import fabrica.*;
import novaYork.*;

public class NYStylePizzaStore extends PizzaStore{
	public Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = 
				new NYPizzaIngredientFactory();
		
		if (item.equals("queijo")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Pizza de queijo no estilo de nova york");
		}
		
		else if (item.equals("marisco")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Pizza de mariscos no estilo de nova york");
		}
		
		return pizza;
	}
}

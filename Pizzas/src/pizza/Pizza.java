package pizza;
import toppings.*;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clam clam;
	
	public abstract void prepare();
	
	public void bake() {
		System.out.println("Assar por 25 minutos a 350º");
	}
	
	public void cut() {
		System.out.println("Cortar a pizza em fatias diagonais");
	}
	
	public void box() {
		System.out.println("Colocar a pizza na caixa oficial da pizzaria");
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// toString()
}

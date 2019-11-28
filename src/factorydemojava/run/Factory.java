package factorydemojava.run;

import factorydemojava.entity.Recipe;
import factorydemojava.factory.RecipeFactory;

public class Factory {

	public static void main(String[] args) {
		
		Recipe machineRecipe = RecipeFactory.buildRecipe("MACHINE", "Coffee machine recipe", 80, 30, null, 234523 );
		
		
		Recipe userRecipe = RecipeFactory.buildRecipe("USER", "My recipe", 80.0, 30.2, "123asd", 123 );
		
		System.out.println(machineRecipe.toString());
		
		System.out.println(userRecipe.toString());
	}

}

package factorydemojava.run;

import factorydemojava.entity.Recipe;
import factorydemojava.factory.RecipeFactory;

public class Factory {

	public static void main(String[] args) {
		
		//creating a machine recipe using the factory
		//5th parameter is the userId which is not needed when creating a machine recipe
		Recipe machineRecipe = RecipeFactory.buildRecipe("MACHINE", "Coffee machine recipe", 80, 30, null, 234523 );
		
		//creating an user recipe using the factory
		//6th parameter is the machineId which is not needed when creating a user recipe [I'm passing 123 to avoid syntax errors]
		Recipe userRecipe = RecipeFactory.buildRecipe("USER", "My recipe", 80.0, 30.2, "123asd", 123 );
		
		
		System.out.println(machineRecipe.toString());
		
		System.out.println(userRecipe.toString());
	}

}

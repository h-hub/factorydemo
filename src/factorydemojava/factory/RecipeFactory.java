package factorydemojava.factory;

import factorydemojava.entity.MachineRecipe;
import factorydemojava.entity.Recipe;
import factorydemojava.entity.UserRecipe;
import factorydemojava.exception.InvalidRecipeTypeException;

public class RecipeFactory {

	public static Recipe buildRecipe(String recipeType, String name, double temperature, double waterOutPut, String userId, double machineId ) {

		Recipe recipe = null;

		switch (recipeType) {
		case "USER":
			recipe = new UserRecipe(name, temperature, waterOutPut, userId);
			break;

		case "MACHINE":
			recipe = new MachineRecipe(name, temperature, waterOutPut, machineId);
			break;

		default:
			throw new InvalidRecipeTypeException();
		}

		return recipe;
	}

}

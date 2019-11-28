package factorydemojava.entity;

public class UserRecipe extends Recipe {
	
	private String userId;

	public UserRecipe(String name, double temperature, double waterOutPut, String userId) {
		super(name, temperature, waterOutPut);
		this.userId = userId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}

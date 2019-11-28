package factorydemojava.entity;

public abstract class Recipe {
	
	private String name;
	
	private double temperature;
	
	private double waterOutPut;

	public Recipe(String name, double temperature, double waterOutPut) {
		super();
		this.name = name;
		this.temperature = temperature;
		this.waterOutPut = waterOutPut;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getWaterOutPut() {
		return waterOutPut;
	}

	public void setWaterOutPut(double waterOutPut) {
		this.waterOutPut = waterOutPut;
	}

	@Override
	public String toString() {
		return "Recipe [name=" + name + ", temperature=" + temperature + ", waterOutPut=" + waterOutPut + "]";
	}
	
}

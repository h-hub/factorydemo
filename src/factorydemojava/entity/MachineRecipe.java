package factorydemojava.entity;

public class MachineRecipe extends Recipe {
	
	private double machineId;

	public MachineRecipe(String name, double temperature, double waterOutPut, double machineId) {
		super(name, temperature, waterOutPut);
		this.machineId = machineId;
	}

	public double getMachineId() {
		return machineId;
	}

	public void setMachineId(double machineId) {
		this.machineId = machineId;
	}

}

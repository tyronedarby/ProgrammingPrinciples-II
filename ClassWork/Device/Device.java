package Device;

public abstract class Device {
	
	private String name;
	private String type;
	private boolean power;

	protected Device() {
	}

	public abstract void powerOn();
	public abstract void powerOff();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
}

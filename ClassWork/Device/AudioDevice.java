package Device;

public abstract class AudioDevice extends Device {
	
	private double volume;

	protected AudioDevice() {
		setType("audio");
	}

	public abstract void powerOn();
	public abstract void powerOff();
	public abstract void mute();

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
}

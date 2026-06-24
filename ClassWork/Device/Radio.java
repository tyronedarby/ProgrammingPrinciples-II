package Device;

public class Radio extends AudioDevice {
	
	private String broadcastBand; // AM/FM
	private double frequency;

	public Radio() {
		setName("radio");
		setBroadcastBand("FM");
		setFrequency(107.5);
	}

	public void powerOn() {
		setPower(true);
		setBroadcastBand(this.getBroadcastBand());
		setFrequency(this.getFrequency());
	}

	public void powerOff() {
		setBroadcastBand(this.getBroadcastBand());
		setFrequency(this.getFrequency());
		setPower(false);
	}

	public void mute() {
		setVolume(0.0);
	}

	public String getBroadcastBand() {
		return broadcastBand;
	}

	public void setBroadcastBand(String broadcastBand) {
		this.broadcastBand = broadcastBand;
	}

	public double getFrequency() {
		return frequency;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
}

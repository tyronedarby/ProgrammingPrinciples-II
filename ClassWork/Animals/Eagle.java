public class Eagle extends Animal {
	public Eagle() { 
		super("Eagle");
	}
	
	@Override
	public String toString() {
		return super.toString() + this.getType();
	}
}

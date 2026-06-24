public class Dog extends Animal {
	public Dog() {
		super("Dog");
	}
	
	@Override
	public String toString() {
		return super.toString() + this.getType();
	}

}

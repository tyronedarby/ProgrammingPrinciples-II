public class Cat extends Animal {
	public Cat() {
		super("Cat");
	}
	
	@Override
	public String toString() {
		return super.toString() + this.getType();
	}
}

public class Bat extends Mammal{

	public Bat(int energyLevel) {
		super(300);
	}
	public void fly() {
		System.out.println("Hey I am a bat");
		energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("Eating humans");
		energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("I am attacking a town");
		energyLevel -= 100;
	}
	

}
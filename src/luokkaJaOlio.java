
public class luokkaJaOlio {

	public static void main(String[] args) {

	}

}

class Kiekko {
	protected String model;
	protected String plastic;
	protected int weight;
	protected int speed;
	protected int glide;
	protected int turn;
	protected int fade;
	
	public void fly()
	{
		System.out.println("Kiekko made of " + plastic + " flies at the speed of " + speed);
	}
	
	public void printInfo()
	{
		System.out.println(model);
		System.out.println(plastic);
		System.out.println(weight);
		System.out.println(speed);
		System.out.println(glide);
		System.out.println(turn);
		System.out.println(fade);
	}
}


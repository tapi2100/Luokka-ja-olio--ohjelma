
public class luokkaJaOlio {

	public static void main(String[] args) {

		Kiekko kiekko1 = new Kiekko();
		
		kiekko1.getModel();
		
		kiekko1.fly();
		
		kiekko1.printInfo();
		
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
	protected int durability;
	
	public Kiekko()
	{
		model = "Thunderbird";
		plastic = "Star";
		speed = 11;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public void hajoa()
	{
		if (durability <= 0)
			System.out.println("Kiekko has broken down");
	}
	
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


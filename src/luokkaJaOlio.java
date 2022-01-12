//importataan Scanneri
import java.util.Scanner;

public class luokkaJaOlio {

	public static void main(String[] args) {
		
		//kutsutaan Scanneri siss‰‰n
		Scanner in = new Scanner(System.in);
		
		Kiekko kiekko1 = new Kiekko();
		kiekko1.getModel();
		kiekko1.fly();
		kiekko1.printInfo();
		
		System.out.println("Model?");
		String model = in.nextLine();
		
		System.out.println("Model of your kiekko is " + model);
		
		Kiekko kiekko2 = new Kiekko("Mako3");
		kiekko2.printInfo();
		
		kiekko2.setPlastic("Champion");
		
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
	
	public Kiekko(String a)
	{
		model = a;
	}
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
	
	
	public void setPlastic(String plastic) {
		this.plastic = plastic;
	}

	
	//kiekko lent‰‰ ja kuluu siin‰ samassa, t‰h‰n vois lis‰t‰ 50% mahdollisuuden, ett‰ kiekko lent‰‰ suoraan puuhun jolloin
	//se kuluu nopeammin. Kiekko voi myˆs hukkua lennon aikana

	public void fly()
	{
		System.out.println("Kiekko made of " + plastic + " flies at the speed of " + speed);
		durability--;
			if (xyz)
			{
				System.out.println("Your Kiekko hit a tree and loses some durability");
				(durability - 2);
			}
			if (xxy)
			{
				System.out.println("Your Kiekko flew straight to the lampi. Tough luck.");
				System.out.println("Do you want to pay a local teenager a 20Ä finders fee to get your Kiekko back?");
			}
	}
	
	//kiekko kun kuluu tarpeeks niin se hajoaa
	public void hajoa()
	{
		if (durability <= 0)
			System.out.println("Kiekko has broken down");
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


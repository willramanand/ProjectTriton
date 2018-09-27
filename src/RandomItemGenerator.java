import java.util.Random;

public class RandomItemGenerator {
	
	public String randomItemGen() {
		int itemNumber = randomNumGen();
		
		return null;
	}
	
	public int randomNumGen()
	{
		int randomNumber;
		Random rand = new Random();
		
		randomNumber = rand.nextInt(11);
		
		return randomNumber;
	}

}

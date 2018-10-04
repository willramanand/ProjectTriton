import java.util.Random;

public class RandomItemGenerator {

	public void randomItemGen() {
		int itemNumber = randomNumGen();
		
		String newItem = setItem(itemNumber);
		
		Character ch = new Character();
		
		ch.setItem(newItem);

	}

	public int randomNumGen() {
		int randomNumber;
		Random rand = new Random();

		randomNumber = rand.nextInt(11);

		return randomNumber;
	}
	
	public String setItem(int itemNumber) {
		String itemName = "";
		
		switch(itemNumber) {
		
		case 0:
			itemName = "Nothing";
			break;
			
		case 1:
			itemName = "Sword";
			break;
			
		case 2:
			itemName = "Spear";
			break;
		
		case 3:
			itemName = "Mace";
			break;
		
		case 4:
			itemName = "Ninja Star";
			break;
			
		case 5:
			itemName = "Blade and Whip";
			break;
			
		case 6:
			itemName = "Staff";
			break;
			
		case 7:
			itemName = "Shield";
			break;
			
		case 8:
			itemName = "Musket";
			break;
			
		case 9:
			itemName = "Dagger";
			break;
			
		case 10:
			itemName = "GunBlade";
			break;
		}
		return itemName;
	}

}

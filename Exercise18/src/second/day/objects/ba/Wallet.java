package second.day.objects.ba;

import java.util.Arrays;

public class Wallet {
	public double currentWalletStatus;
	public CreditCard[] arrayOfCC;

	public Wallet(int numberOfAproovedCC) {
		this.arrayOfCC = new CreditCard[numberOfAproovedCC]; 
	}

	public void addMoney(double add) {
		currentWalletStatus += add;
	}

	public void removeMoney(double remove) {
		if (currentWalletStatus - remove < 0) {
			throw new UnsupportedOperationException("Error");
		}
		currentWalletStatus -= remove;
	}

	public boolean addCard(CreditCard addCard) {
		
		arrayOfCC = Arrays.copyOf(arrayOfCC, arrayOfCC.length+1);
		arrayOfCC[arrayOfCC.length - 1] = addCard; 
		return true;
	
	}
}

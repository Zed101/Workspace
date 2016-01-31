package second.day.objects.ba;

import java.util.Arrays;

public class RunCreditCard {

	public static void main(String[] args) {
		CreditCard card = new CreditCard(900);
		card.nameOfBank = "Sparkase";
		card.monthOfExpiration = 7;
		card.numberOfCreditCard = 123456789;
		card.yearOfExpitarion = 2017;
		
		card.addOnCard(100);
		//System.out.println(card.status());
		card.removeFromCard(50);
		//System.out.println(card.status());
		card.removeFromCard(900);
		//System.out.println(card.status() );
		
		CreditCard card1 = new CreditCard("Reifeisen", 198734592, 2030, 12);
		CreditCard newCard = new CreditCard("Banka", 7876765, 2000, 8);
		
		
		CreditCard[] arrayOfCC = new CreditCard[] {card1, card};
		
		Wallet wallet = new Wallet(2);
		wallet.arrayOfCC = arrayOfCC;
		wallet.addMoney(50);
		System.out.println(wallet.currentWalletStatus + " current status in wallet");
		wallet.removeMoney(30);
		System.out.println(wallet.currentWalletStatus + " Current status in wallet after remove");
		System.out.println(Arrays.toString(wallet.arrayOfCC));
		wallet.addCard(newCard);
		System.out.println(Arrays.toString(wallet.arrayOfCC) + " after adding");
		
		
		
	}

}

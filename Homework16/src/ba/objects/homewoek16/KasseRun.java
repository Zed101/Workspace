package ba.objects.homewoek16;

public class KasseRun {

public static void main(String[] args) {
	Kassa meineKasse = new Kassa("piggy");
	System.out.println(meineKasse.getNowIn() + " now in kasse");
	System.out.println(meineKasse.situationInKasse(meineKasse));
	meineKasse.addMoney(30);
	System.out.println(meineKasse.getNowIn() + " after adding");
	System.out.println(meineKasse.situationInKasse(meineKasse));
	meineKasse.addMoney(100);
	System.out.println(meineKasse.getNowIn());
	System.out.println(meineKasse.situationInKasse(meineKasse) + " add 100");
	meineKasse.takeMoneyAndRun();
	System.out.println(meineKasse.situationInKasse(meineKasse));
}
	
	
}

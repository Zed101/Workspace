package ba.objects.homewoek16;

public class Kassa {
	private String meineKasse;
	private int nowIn;
	
	public Kassa(String name){
		this.meineKasse = name;
	}
	public void addMoney (int toAdd){
		nowIn += toAdd;
	}
	public int takeMoneyAndRun (){
		int money = nowIn;
		nowIn = 0;
		return money;
	}
	public  int getNowIn(){
		return nowIn;
	}
	public String situationInKasse (Kassa nowIn){
		if(nowIn.getNowIn() == 0){
			return "It is empty...";
		}else if (nowIn.getNowIn() > 1 && nowIn.getNowIn() < 20){
			return "There’s some, but not much.";
		}else if(nowIn.getNowIn() > 21 && nowIn.getNowIn() <= 100){
			return "There’s some.";
		}else if (nowIn.getNowIn() > 101){
			return "There’s a lot.";
		}
		return "E";
		
	}
}

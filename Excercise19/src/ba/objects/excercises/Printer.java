package ba.objects.excercises;

public class Printer {
	private String name;
	private int quantityOfPaper;
	private double quantityOfInk;
	private int sumOfPrintedPages;
	private static int totalPrintedPages = 0;

	public Printer() {
		name = "Default Printer";
		quantityOfPaper = 0;
		quantityOfInk = 0.0;
		sumOfPrintedPages = 0;
	}

	public Printer(String name) {
		this.name = name;
		quantityOfPaper = 0;
		quantityOfInk = 0.0;
		sumOfPrintedPages = 0;
	}

	public boolean statusOfInk() {
		if (quantityOfInk == 0.0) {
			return false;
		}
		return true;
	}

	public boolean statusOfPaper() {
		if (quantityOfPaper == 0) {
			return false;
		}
		return true;
	}

	public int numberOfPrintedPages() {
		return sumOfPrintedPages;
	}

	public void putPaperInPrinter(int toAddPaper){
		if( (quantityOfPaper + toAddPaper) == 100){
			throw new UnsupportedOperationException("Cant't add that much paper");
		}
		quantityOfPaper += toAddPaper;
		
	}
	public void fillInk(){
		quantityOfInk = 100.0;
	}
	public void printPages(int numberOfPagesToPrint){
		
		for (int i = 1; i <= numberOfPagesToPrint; i++) {
			if(quantityOfPaper > 0 && quantityOfInk > 0){
			quantityOfPaper -= 1;
			quantityOfInk -= 0.3;
			sumOfPrintedPages += 1;
			totalPrintedPages++;
			}else{
				throw new UnsupportedOperationException(" There is no Paper or Ink to print");
			}
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantityOfPaper() {
		return quantityOfPaper;
	}

	public void setQuantityOfPaper(int quantityOfPaper) {
		this.quantityOfPaper = quantityOfPaper;
	}

	public double getQuantityOfInk() {
		return quantityOfInk;
	}

	public void setQuantityOfInk(double quantityOfInk) {
		this.quantityOfInk = quantityOfInk;
	}

	public int getSumOfPrintedPages() {
		return sumOfPrintedPages;
	}

	public void setSumOfPrintedPages(int sumOfPrintedPages) {
		this.sumOfPrintedPages = sumOfPrintedPages;
	}
	
	public int getTotalPrintedPages(){
		return totalPrintedPages;
	}
	//Stanje može biti „Ready“, „No ink“, „No paper“, „No ink nor paper“
	@Override
	public String toString() {
		
		
		if(quantityOfPaper > 0 && quantityOfInk > 0){
			return  name + " Ready" ;
		}
		if(quantityOfInk <= 0){
			return " NO INK!";
		}else if(quantityOfPaper == 0){
			return " There is NO PAPER!";
		}
		return "Error";
		
	}
}

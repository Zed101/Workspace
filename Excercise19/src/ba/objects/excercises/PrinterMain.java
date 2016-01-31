package ba.objects.excercises;

public class PrinterMain {

	public static void main(String[] args) {
		Printer newPrinter = new Printer("Epson");
		newPrinter.fillInk();
		newPrinter.putPaperInPrinter(50);
		System.out.println(newPrinter.getQuantityOfPaper() + " stanje papira");
		System.out.println(newPrinter.getQuantityOfInk() + " stanje tinte");
		newPrinter.printPages(20);
		System.out.println(newPrinter.getSumOfPrintedPages());
		System.out.println(newPrinter.getQuantityOfPaper() + " stanje papira nakon printanja");
		System.out.println(newPrinter.getQuantityOfInk() + " stanje tinte nakon printanja");
		System.out.println(newPrinter.toString() + " to String metoda");
		newPrinter.printPages(20);
		System.out.println(newPrinter.toString() + " to String metoda");
		System.out.println();
		System.out.println(newPrinter.getSumOfPrintedPages() + " suma isprintanih");
		System.out.println(newPrinter.toString() + " to String metoda nakon isprintanih 20 str");

		System.out.println(newPrinter.getQuantityOfPaper() + " stanje papira nakon printanja");
		System.out.println(newPrinter.getQuantityOfInk() + " stanje tinte nakon printanja");
		
		//newPrinter.printPages(11);
		System.out.println(newPrinter.toString() + " to String metoda");
		System.out.println();
		System.out.println(newPrinter.getSumOfPrintedPages() + " suma isprintanih");
		System.out.println(newPrinter.getQuantityOfPaper() + " stanje papira nakon printanja");
		System.out.println(newPrinter.getQuantityOfInk() + " stanje tinte nakon printanja");
		
		System.out.println(newPrinter.toString() + " to String metoda");
		
		System.out.println(newPrinter.getTotalPrintedPages() + " static varijabla Total printed");
		
		Printer p2 = new Printer("Cannon");
		p2.fillInk();
		p2.putPaperInPrinter(90);
		p2.printPages(20);
		System.out.println(p2.getTotalPrintedPages() + " static varijabla Total printed oba printera");
	}

}

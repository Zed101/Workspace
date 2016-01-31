package ba.vjezbe.vjezbe;

public class GreaterNumber {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 10;
		// System.out.println(getMax(n1, n2));
		String extension = "zeljka.png";
		// System.out.println(getExtension(extension));

		String n3 = "001010";
		// System.out.println(canBeBinary(n3));
		int number1 = 5;
		int number2 = 10;
		// System.out.println(getRandomNumber(number1, number2));

		System.out.println(getType("b"));
		//System.out.println(getSentence("Ja poso u skolu."));
	}

	private static String getSentence(String string) {
		String s = String.valueOf(string.charAt(0));
		s = s.toUpperCase();
		s += string.substring(1);
		if (string.charAt(string.length() - 1) == '.') {
			return s;
		}
		s += '.';
		return s;

	}

	private static int getMax(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		} else {
			return n2;
		}
	}

	private static String getExtension(String extension) {
		int chara = extension.indexOf('.');
		if (extension.indexOf('.') == -1) {
			return null;
		}
		return extension.substring(chara);

	}

	private static boolean canBeBinary(String n3) {

		try {
			Integer.parseInt(n3, 2);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	private static int getRandomNumber(int number1, int number2) {
		int random = 0;

		random = (int) (Math.random() * (number2 - number1 + 1)) + number1;
		return random;

	}

	private static String getType(String s) {
		try {
			Integer.parseInt(s);
			return "int";
		} catch (Exception e) {
			try {
				Double.parseDouble(s);
				return "double";
			} catch (Exception e2) {

				if ("true".equals(s) || "false".equals(s)) {
					return "boolean";
				}

				if (s.length() == 1) {
					return "char";
				}

			}
		}
		return "String";
	}

	@SuppressWarnings("static-access")
	public static boolean myFirstProgram(String sentence, String fileName, String s, int num) {

		String fixedSentence = getSentence(sentence);
		if (getExtension(fileName) == null) {
			fileName += ".txt";
		}

		if ("boolean".equals(getType(s))) {
			TextIO writer = new TextIO();
			writer.writeFile(fileName);
			if (canBeBinary(String.valueOf(num))) {
				writer.putln(num);
			} else {
				writer.putln(getRandomNumber(num / 2, num));
			}
		} else if ("int".equals(getType(s))) {
			TextIO writer = new TextIO();
			writer.writeFile(fileName);
			if (canBeBinary(String.valueOf(num))) {
				writer.putln(num);
			} else {
				writer.putln(getMax(num, Integer.parseInt(s)));
			}

		}else if("String".equals(getType(s))){
			TextIO writer = new TextIO();
			writer.writeFile(fileName);
			int p = getRandomNumber(1, num);
			for (int i = 0; i < p; i++) {
				writer.putln(s);
			}
			writer.writeFile(s + ".txt");
			writer.putln(fixedSentence);
		}

		return true;
	}

}

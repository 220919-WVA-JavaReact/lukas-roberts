public class HelloWorld {
	public static void main (String[] args) {
		System.out.println("Hello World!");
		int number = 10;
		byte smaller = 50;
		boolean value = true;
		System.out.println(number);
		System.out.println(smaller);
		System.out.println(value);
		byte tiny = 8;
		short small = 10000;
		int normal = 1000000;
		long bigger = 1000000000000L;
		System.out.println(tiny);
		System.out.println(small);
		System.out.println(normal);
		System.out.println(bigger);
		float decimal = 10.9f;
		System.out.println(decimal);
		char letter = 'a';
		System.out.println(letter);
		String greeting = "Hello World!";
		System.out.println(greeting);
		if (5 > 7) {
			System.out.println("This statement is true");
		} else {
			System.out.println("This statement is false");
		}

		int num = 9;
		if (num > 0) {
			System.out.println("Positive");
		} else if (num < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}

		int counter = 0;
		while (counter < 10) {
			System.out.println(counter);
			counter++;
		}

		int a = 2;
		int b = 3;
		add(a,b);
		System.out.println(add(a,b));
	}

	public static int add (int num1, int num2) {
		return num1 + num2;
	}
}
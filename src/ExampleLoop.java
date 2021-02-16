// Create a program that prints 1-10 with for, while and do-while

public class ExampleLoop {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);			
		}
		
		int counter = 0;
		while (counter < 10) {
			System.out.println(counter + 1);
			counter++;			
		}
		
		int j = 0;
		do {
			System.out.println(j + 1);
			j++;			
		} while (j < 10);
	}
}

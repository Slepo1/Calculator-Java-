import java.util.Scanner;

public class CalculatorCons {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int num1 = getNum();
		int num2 = getNum();
		char op = operation();
		int a = calc(num1, num2, op);
		System.out.println(a);
	}

	public static int getNum() {
		System.out.println("input number");
		int num = scanner.nextInt();
		return num;
	}

	public static char operation() {
		System.out.println("1. +;\n" + "2. -;\n" + "3. *;\n" + "4. /;\n");
		int val = scanner.nextInt();
		if (val == 1) {
			return '+';
		}
		else if (val == 2) {
			return '-';
		}
		else if (val == 3) {
			return '*';
		}
		else if (val == 4) {
			return '/';
		}
		else {
			return 0;
		}

	}
	public static int calc(int num1, int num2, char op) {
		int result = 0;
		switch(op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		}
		return result;
	}
}
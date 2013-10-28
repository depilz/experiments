package experiments;

public class Fibonnaci {


	public long getFibonnaci(int num) {
		int fib = 1;
		int num2 = 1;
		int num3 = 1;
		for (int c = 1; c < num; c++) {
			fib = num2 + num3;
			num3 = num2;
			num2 = fib;
			}

		return fib;
	}

	public int getFibonnaci2(int num) {
		int a = 1;
		int b = 1;
		int fib = 1;
		for(int i = 2;  i <= num; i ++) {
			fib = a + b;
			a = b;
			b = fib;
		}
		return fib;
	}



}

public class Assignment3 {

	public static void main(String[] args) {
		System.out.println(factorial(4));
	}

	public static int factorial(int n) {
		if(n==1) return 1;
		return n*factorial(--n);
	}
}
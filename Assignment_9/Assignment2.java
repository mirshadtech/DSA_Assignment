public class Assignment2 {
	
	public static void main(String[] args) {
		System.out.println(findSum(5));
	}
	
	public static int findSum(int n) {
		if(n==1) return 1;
		return n+findSum(--n);
	}
}
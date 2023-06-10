public class Assignment1 {

	public static void main(String[] args) {
		System.out.println(powerOfTwo(256));
	}

	public static boolean powerOfTwo(int n) {
		if(n==1) return true;
		if(n%2!=0||n==0) return false;
		
		return powerOfTwo(n/2);
	}
}

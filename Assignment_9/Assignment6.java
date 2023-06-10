public class Assignment6 {
	static int a=5;
	public static void main(String[] args) {
		System.out.println(arithmeticProgression(2, 10));
	}
	
	public static int arithmeticProgression(int d, int n) {
		if(n==1) return a;
		return d+arithmeticProgression(d, --n);
	}

}
public class Assignment4 {
	
	public static void main(String[] args) {
	
		System.out.println(findPower(0, 10));
	}
	
	public static int findPower(int n,int p)
    {
		if(p==0) return 1;
		return n*findPower(n, --p);
    }
}
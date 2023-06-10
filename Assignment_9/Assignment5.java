
public class Assignment5 {
	public static void main(String[] args) {
		int[] arr =  {1, 4, 45, 6, 10, -8};
		System.out.println(maxArray(arr, arr.length-1));
	}
	
	public static int maxArray(int[] arr, int n) {
		if(n==0) return arr[0];
		int max=maxArray(arr,n-1);
		return arr[n]>max?arr[n]:max;
	}


}
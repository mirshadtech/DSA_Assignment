public class Assignment8 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(productOfArray(arr, arr.length-1));
	}
	
	public static int productOfArray(int[] arr,int n) {
		if(n==0) return arr[0];
		return arr[n]*productOfArray(arr, --n);
	}
}
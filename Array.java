import java.util.Scanner;
class Array{
	public static void main(String args[]){
		System.out.println("Enter the length of the array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[10];
		System.out.println("Enter the array element");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			
		}
		//print(n,arr);
		del(){
			System.out.println("Enter the position where u want to del");
		int k=sc.nextInt();
		};
		
	}
	public static void print(int k,int[] a ){
		for(int i=0;i<k;i++){
			System.out.println(a[i]);
		}
	}
	
}
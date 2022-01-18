package day7;
import java.util.Random;
public class SameNum2 {
public static void main(String[] args) {
	Random ran = new Random();
	int[] check = new int[10];
	int[] arr=new int[5];
	int i=0, n=0;
	
	while(true) {
		n=ran.nextInt(9)+1;
		
		if(check[n-1]==0) {
			check[n-1]=1;
			arr[i]=n;
			i++;
		}
		else {continue;}
		if(i==5) {
			break;
		}	
		
		
	}
	for(int j=0; j<5; j++) {
		System.out.print(arr[j]+" ");
		}
	
	
	
	
}
}

package DSA;
import java.util.*;
public class Array_Inser_End {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[6];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		int size=5;
		int value=6;
		System.out.println(Arrays.toString(arr));
		arr[size]=value;
		size++;
		System.out.println(Arrays.toString(arr));


	}

}

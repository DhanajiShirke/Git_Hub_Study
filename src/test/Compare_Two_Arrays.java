package test;

import java.util.Arrays;

public class Compare_Two_Arrays {

	public static void main(String[] args) 
	{
		
		int arr1[] = {1,2,3};
		int arr2[] = {4,5,6};
		int arr3[] = {1,2,3};
		
		System.out.println(Arrays.equals(arr1,arr2));
		
		System.out.println(Arrays.equals(arr1,arr3));
	}

}

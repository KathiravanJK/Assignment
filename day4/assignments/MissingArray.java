package day4.assignments;

import java.util.Arrays;

public class MissingArray {
	public static void main(String[] args) {
		int[] num = {-3,-4,0,-1,1,3,5,4,2};
		
		Arrays.sort(num);
		
		
		for (int i = num[0]; i < num.length;i++)
	
			if(i!=num[i-num[0]]) {
				System.out.println(i);
				break;
			}	
			
				
			}
		
		
			
			
			
		
		
	}


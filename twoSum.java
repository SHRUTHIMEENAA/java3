package leetprblms;
import java.util.*;
public class twoSum {
	 public static int[] twosum(int[] nums, int target) {
	        int[] arr=new int[2];
	        for(int i=0;i<nums.length;i++){
	           for(int j=i+1;j<nums.length;j++){
	                if(nums[i]+nums[j]==target){
	                    arr[0]=i; 
	                    arr[1]=j;
	                } 
	            }
	        }
	       return arr;  
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		System.out.print(Arrays.toString(twosum(nums,target)));
		
		

	}
	
}

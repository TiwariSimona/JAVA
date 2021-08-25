//Seema is a teacher.She has got the job to arrange N number of papers in ascending order by there marks. There are T number of sections. Help her do the work.

import java.util.*;
public class D30Q33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of sections: ");
        int sec=sc.nextInt();
        for(int i=0;i<sec;i++){        
            System.out.println("Enter the number of elements: ");
            int num=sc.nextInt();
            int arr[]=new int[num];
            System.out.print("Enter the elements: ");
            for(int j=0;j<num;j++){
                arr[j]=sc.nextInt();
            }
            for(int j=0;j<num;j++){
                System.out.print(arr[j]+" ");
                
            }
            check(arr,num);
            System.out.println();
           
            
        }
    }
    public static void check(int arr[],int num) {
    	int t=0;
    	System.out.print("  And after sorting: ");
    	for(int i=0;i<num;i++) {
    		for(int j=0;j<num-i-1;j++) {
    			if(arr[j]>arr[j+1]) {
        			t=arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=t;
    		}		
    		} 		 		
    	}
    	
    	for(int i=0;i<num;i++) {
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println();
    }
}

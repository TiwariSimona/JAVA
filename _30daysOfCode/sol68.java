import java.util.*; 
import java.lang.*; 
class Ques68 { 
    public static void splitingArray(int array[], int a, int b) 
    { 
        for (int i = 0; i < b; i++) { 
  
            int x = array[0]; 
            for (int j = 0; j < a - 1; ++j) 
                array[j] = array[j + 1]; 
            array[a- 1] = x; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        int array[] = { 12, 10, 5, 6, 52, 36 }; 
        int a = array.length; 
        int position = 2; 
  
        splitingArray(array, 6, position); 
  
        for (int i = 0; i < a; ++i) 
            System.out.print(array[i] + " "); 
    } 
} 

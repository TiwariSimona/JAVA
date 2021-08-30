class CheckTheCommonElement 
{ 
   
    void CheckTheCommonElement(int array1[], int array2[], int array3[]) 
    { 
        int a = 0; 
        int b = 0;
        int c= 0; 
  
       
        while (a < array1.length && b < array2.length && c < array3.length) 
        { 
            
             if (array1[a] == array2[b] && array2[b] == array3[c]) 
             {   System.out.print(array1[a]+" ");   a++; b++; c++; } 
  
             
             else if (array1[a] < array2[b]) 
                 a++; 
  
             
             else if (array2[b] < array3[c]) 
                 b++; 
  
             
             else
                 c++; 
        } 
    } 
  
    
    public static void main(String args[]) 
    { 
    	CheckTheCommonElement ob = new CheckTheCommonElement(); 
  
        int array1[] = {1, 5, 10, 20, 40, 80}; 
        int array2[] = {6, 7, 20, 80, 100}; 
        int array3[] = {3, 4, 15, 20, 30, 70, 80, 120}; 
  
        System.out.print("Common elements are "); 
        ob.CheckTheCommonElement(array1, array2, array3); 
    } 
} 

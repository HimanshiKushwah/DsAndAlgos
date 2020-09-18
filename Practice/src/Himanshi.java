public class Himanshi { 
    // Function that convert Decimal to binary 
    public static void decToBinary(int n) 
    { 
        // Size of an integer is assumed to be 32 bits 
        for (int i = n-1; i >= 0; i--) { 
            int k = n >> i; 
            if ((k & 1) > 0) 
                System.out.print("1"); 
            else
                System.out.print("0"); 
        } 
    } 
    public static void main(String[] args) 
    { 
         
        int n = 5; 
       decToBinary(n); 
    } 
} 

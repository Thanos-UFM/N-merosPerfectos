import java.util.ArrayList;
import java.util.Scanner;
public class NumeroPerfecto {
	public static void main(String[] args) {
        Scanner input;        
        Long num;
        ArrayList<Integer> perfect=new ArrayList<Integer>();

        try {
            System.out.println("Ingrese un numero: ");
            input = new Scanner(System.in);
            num = input.nextLong();

            double point = Math.floor(num/10);

            System.out.print("[");
            for (int i = 1; i <= num; i++){                
                if (isPerfect(i) == true){
                    perfect.add(i);
                    System.out.print(".");                    
                };
                if (i%point == 0){
                    System.out.print(".");
                }
            }
            System.out.println("]");

            System.out.print("Numeros perfectos: ");
            System.out.println(perfect);
            input.close();
        } catch (Exception e) {
            System.out.print("ERROR: ");
            System.out.println(e);
        }        
    }

    public static Boolean isPerfect(long num){
        long i;
        long sum = 0;
        double res;
        
        for(i = 1 ; i < num ; i++) {            
            res = num % i;
			if(res == 0)  {
				sum = sum + i;
            }
        }
        if (sum == num) {
            return true;
        }
        else {
            return false;
        }
    }
}
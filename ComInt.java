import java.util.Scanner;
public class ComInt {
     public static void main(String[] args) {
        Scanner scanNum = new Scanner(System.in);
                double principal;  
                int years = 5; 
                int compoundingPeriods = 12; 
                System.out.println("Enter the principal amount :");
                principal =scanNum.nextDouble();
                double rate;  
                System.out.println("Enter the annauly interest :");
                rate =scanNum.nextDouble();    
                System.out.println("Enter the annauly interest :");
                years =scanNum.nextInt(); 
                       
                double rateInDec;
                rateInDec = rate/100;  
        
                double amount = principal * Math.pow(1 + (rateInDec / compoundingPeriods), compoundingPeriods * years);
                
                System.out.println("Compound Interest after " + years + " years: " + amount);
            
        
     }
}

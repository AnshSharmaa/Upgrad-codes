// this code needs a bit tweaking its not accurate



import java.util.Scanner;
class Source {
    
    public static void main(String args[]) {
         Scanner scan = new Scanner(System.in);
        // Enter annual income
        double income = scan.nextDouble();
        // Enter age
        int age = scan.nextInt();
        
        double tax = 0.0;
        
        if(income<=250000){
            tax=0;
        }
        else if(income>=250001 && income<=300000){
            if(age>= 60 & age<80){tax=0;}
            else if(age>=80){tax=0;}
            else{tax=tax+ 0.10 * (income- 250000);}
            
        }
        else if(income>=300001 && income<=500000){
            if( age>=80){tax=0;}
            else if(age>= 60 & age<80){tax=tax+ 0.10 * (income- 300000);}
            else{tax=tax+ 0.10 * (income- 250000);}
        }
        else if(income>=500001 && income<=1000000){
            if( age>=80){tax=tax + 0.2 * (income - 500000);}
            else if(age>= 60 & age<80){tax=tax+ 0.2 * (income - 500000) + 0.10 * (500000-300000);}
            else{tax=tax+ 0.2 * (income - 500000) + 0.10 * (500000-300000);}
        }
        else if(income>1000000){
            if( age>=80){tax=tax+ 0.3*(income-1000000)+ 0.2 * (1000000 - 500000);}
            else if(age>= 60 & age<80){tax=tax+ 0.3*(income-1000000)+ 0.2 * (1000000 - 500000) + 0.10 * (500000-300000);}
            else{tax=tax+ 0.3*(income-1000000)+ 0.2 * (income - 500000) + 0.10 * (500000-300000);}
        }
        
        System.out.print(tax);
        scan.close();
    }
}
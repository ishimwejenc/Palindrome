import java.util.*;
import java.io.*;

public class Palindrome{    

    public static void main(String args[]){   
        int number; 
        Scanner jd=new Scanner(System.in);
        System.out.println("type in the number you want!");
        number = jd.nextInt();

        IsPalindrome ip = new IsPalindrome();

        ip.setNum(number);

        System.out.println("Decimal of " + number + " is: " + ip.getBinary());   

        Boolean pal = ip.isPal(); 
 
        if(pal){
            System.out.println("Binary " + ip.getBinary() + " is a palindrome!");
        }else {
            System.out.println("Binary " + ip.getBinary() + " is not a palindrome!" );
        }
    }

}     

class IsPalindrome { 
    public int num;
    String binary;  
    Boolean decision;    

    public void setNum(int n){
        this.num = n;
    }

    public String getBinary(){
        this.binary = Integer.toBinaryString(this.num);
        return binary;
    } 

    public Boolean isPal() {
        StringBuffer bs =new StringBuffer(this.binary);

        String revBin = bs.reverse().toString();

        if(this.binary.equals(revBin)) {
            this.decision = true;
        } else{
            this.decision = false;
        }

        return this.decision;
    }
}
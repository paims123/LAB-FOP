// Task 4: Define the Fraction class and a Tester class
package lab8q4;

class Fraction{
    private int numerator;
    private int denominator;
    
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    
    public void setDenominator(int denominator){
        if(denominator != 0){
            this.denominator = denominator;
        }else{
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
    }
    
    public int getNumerator(){
        return numerator;
    }
    
    public int getDenominator(){
        return denominator;
    }
    
    public void reduce(){
        int gcd=findGCD(numerator,denominator);
        numerator/=gcd;
        denominator/=gcd;
    }
    
    private int findGCD(int a, int b){
        if(b==0){
            return a;
        }
        return findGCD(b, a%b);
    }
    
    public void display(){
        System.out.println("Fraction: " + numerator + "/" + denominator);
    }
}

public class LAB8Q4 {

    public static void main(String[] args) {
        Fraction fraction = new Fraction();
        fraction.setNumerator(8);
        fraction.setDenominator(12);
        System.out.println("Before Reduction:");
        fraction.display();
        fraction.reduce();
        System.out.println("After Reduction:");
        fraction.display();
    }
    
}

// Task 3: Define the WeightCalculator class and a Tester class
package lab8q3;

class WeightCalculator {
    private int age;
    private double height;
    
    public void input (int age, double height){
        this.age = age;
        this.height = height;
    }
    
    public double calculatedRecommendedWeight(){
        return (height - 100 + age / 10.0)* 0.9;
    }
    
    public void displayDetails(){
        System.out.println("Age:" + age);
        System.out.println("Height: "+ height);
        System.out.println("Recommended Weight: "+ calculatedRecommendedWeight());
    }
}

public class LAB8Q3 {

    public static void main(String[] args) {
        WeightCalculator wc = new WeightCalculator();
        wc.input(25,170);
        wc.displayDetails();
    }
    
}

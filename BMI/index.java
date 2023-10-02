import java.util.*;

public class Main {

    public static void bmi(float w, int l){
        float lm = (float) l/100;
        float x = (float) (w/(lm*lm));
        System.out.printf("BMI= " + "%.2f", x);
        System.out.println("");
        if(x<18.5){
            System.out.println("Underweight: It indicates lower weight relative to height, potentially leading to nutrient deficiencies and weakened immunity, necessitating attention to healthy weight gain.");
        }
        else if (18.5<=x && x<25) {
            System.out.println("Normal: Itdenotes a balanced weight-height ratio, often associated with reduced risk of weight-related health issues.");
        }
        else if (25<=x && x<30) {
            System.out.println("Overweight: It signals excess weight for height, increasing the risk of heart disease, diabetes, and high blood pressure.");
        }
        else if (30<=x && x<35) {
            System.out.println("Obese (Class 1): It suggests significant excess weight, elevating the risk of cardiovascular disease, certain cancers, and other health concerns.");
        }
        else if (35<=x && x<40) {
            System.out.println("Obese (Class 2) It indicates severe obesity, further intensifying health risks, necessitating comprehensive intervention.");
        }
        else if (x>=40) {
            System.out.println("Obese (Class 3) It signifies morbid obesity, greatly heightening health threats, requiring urgent medical attention and lifestyle changes.");
        }        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Weight(in Kg) = ");
        float weight = sc.nextFloat();
        System.out.print("Length(in cm) = ");
        int length = sc.nextInt();
        bmi(weight, length);

    }
}

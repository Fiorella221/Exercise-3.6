import java.util.Scanner;

public class ComputeandInterpretBMI {
  public static void main(String[] args) {
    
  Scanner input = new Scanner(System.in);
  System.out.println("Enter your weight in pounds: ");
  double weight = input.nextDouble();
  System.out.println("Enter your height feet: ");
  int heightFeet= input.nextInt();
  System.out.println("Enter your height inches: ");
  int heightInches = input.nextInt();
  input.close();

  double height = heightFeet * 12 + heightInches;
  double bmi = weight / (height * height) * 703;
  System.out.println("Your BMI is " + bmi);
    if (bmi < 18.5) {
      System.out.println("Underweight");
    } else if (bmi >= 18.5 && bmi < 24.9) {
      System.out.println("Normal");
    } else if (bmi >= 25.0 && bmi <= 29.9) {
      System.out.println("Overweight");
    } else if (bmi >= 30.0) {
      System.out.println("Obese");
    }
    
  }
} 
    
    
  
    
    
    
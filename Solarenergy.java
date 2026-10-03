import java.util.Scanner;
class Solarenergy {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter energy genegrated in KWh");
double energy = input.nextdouble();
if (energy >= 10) {
System.out.println("good energy generation");
} else {
System.out.println("low energy generation"); }
input.close();
   }
}
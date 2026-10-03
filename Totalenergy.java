import java.util.Scanner;

public class Totalenergy {
static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
return morningEnergy + eveningEnergy;
    }
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 double morningEnergy = sc.nextDouble();
double eveningEnergy = sc.nextDouble();
double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);
System.out.println(totalEnergy);
    }
}
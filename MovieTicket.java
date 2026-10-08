import java.util.Scanner;

public class MovieTicket {
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    public double calculateDiscount() {
        return numberOfTickets >= 5 ? calculateTotal() * 0.10 : 0.0;
    }

    public double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    public void displayBill() {
        System.out.println("\n--- Cinema Booking Bill ---");
        System.out.println("Movie: " + movieName);
        System.out.printf("Ticket price: %.2f%n", ticketPrice);
        System.out.println("Number of tickets: " + numberOfTickets);
        System.out.printf("Discount: %.2f%n", calculateDiscount());
        System.out.printf("Final amount: %.2f%n", calculateFinalAmount());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter ticket price: ");
        double ticketPrice = scanner.nextDouble();

        System.out.print("Enter number of tickets: ");
        int numberOfTickets = scanner.nextInt();

        MovieTicket boimport java.util.Scanner;

public class MovieTicket {
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    public double calculateDiscount() {
        return numberOfTickets >= 5 ? calculateTotal() * 0.10 : 0.0;
    }

    public double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    public void displayBill() {
        System.out.println("\n--- Cinema Booking Bill ---");
        System.out.println("Movie: " + movieName);
        System.out.printf("Ticket price: %.2f%n", ticketPrice);
        System.out.println("Number of tickets: " + numberOfTickets);
        System.out.printf("Discount: %.2f%n", calculateDiscount());
        System.out.printf("Final amount: %.2f%n", calculateFinalAmount());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter ticket price: ");
        double ticketPrice = scanner.nextDouble();

        System.out.print("Enter number of tickets: ");
        int numberOfTickets = scanner.nextInt();

        MovieTicket booking = new MovieTicket(movieName, ticketPrice, numberOfTickets);
        booking.calculateTotal();
        booking.calculateDiscount();
        booking.calculateFinalAmount();
        booking.displayBill();

        scanner.close();
    }
}



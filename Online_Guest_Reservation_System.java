import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Reservation {
    private final int id;
    private final String name;
    private final String date;
    private final int numberOfGuests;

    public Reservation(int id, String name, String date, int numberOfGuests) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.numberOfGuests = numberOfGuests;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }
}


class ReservationSystem {
    private final List<Reservation> reservations = new ArrayList<>();
    private int nextId = 1;

    public Reservation makeReservation(String name, String date, int numberOfGuests) {
        Reservation reservation = new Reservation(nextId++, name, date, numberOfGuests);
        reservations.add(reservation);
        return reservation;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public Reservation getReservationById(int id) {
        for (Reservation reservation : reservations) {
            if (reservation.getId() == id) {
                return reservation;
            }
        }
        return null;
    }

    public boolean cancelReservation(int id) {
        Reservation reservation = getReservationById(id);
        if (reservation != null) {
            reservations.remove(reservation);
            return true;
        }
        return false;
    }
}


class ReservationSystemUI {
    private final ReservationSystem reservationSystem = new ReservationSystem();

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Make a reservation");
            System.out.println("2. View all reservations");
            System.out.println("3. Cancel a reservation");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice : ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Date: ");
                    String date = scanner.nextLine();
                    System.out.print("Number of guests: ");
                    int numberOfGuests = scanner.nextInt();
                    scanner.nextLine();

                    Reservation reservation = reservationSystem.makeReservation(name, date, numberOfGuests);
                    System.out.println("Reservation made with ID " + reservation.getId());
                    break;
                case 2:
                    System.out.println("Reservations:");
                    for (Reservation r : reservationSystem.getReservations()) {
                        System.out.println("Reservation ID : " + r.getId() + "\n" + "Name : " + r.getName() + "\n" + "Date : " + r.getDate() + "\n" + "Number of Guests : " + r.getNumberOfGuests());
                    }
                    break;
                case 3:
                    System.out.print("Reservation ID to cancel: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    if (reservationSystem.cancelReservation(id)) {
                        System.out.println("Reservation canceled");
                    } else {
                        System.out.println("Reservation not found");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        ReservationSystemUI obj = new ReservationSystemUI();
        obj.start();
    }
}


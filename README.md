# Online_Guest_Reservation_System
This is a simple Online Reservation System built in Java. The system allows users to make, view, and cancel reservations. It features a command-line interface for user interaction and stores reservation data in memory.

1. Features :
    1) Make a Reservation: Users can create a new reservation by providing their name, the date of reservation, and the number of guests.
    2) View All Reservations: Users can view all the current reservations with details like Reservation ID, Name, Date, and Number of Guests.
    3) Cancel a Reservation: Users can cancel an existing reservation by providing the Reservation ID.
    4) Exit: Users can exit the application.

2. Technologies Used :
    1) Java: The primary programming language used for the application.
    2) Scanner: Used for taking user inputs from the command line.

3. File Structure :
    1) Reservation.java: This file contains the Reservation class, representing a reservation with properties like ID, name, date, and number of guests.
    2) ReservationSystem.java: This file contains the ReservationSystem class, managing the list of reservations and providing methods to add, retrieve, and cancel reservations.
    3) ReservationSystemUI.java: This file contains the ReservationSystemUI class, providing a command-line interface for users to interact with the reservation system.

4. Code Overview :
    1) Reservation
         Constructor: Initializes the reservation with an ID, name, date, and number of guests.
         Getters: Methods to retrieve the reservation's ID, name, date, and number of guests.
    2) ReservationSystem
        makeReservation: Creates a new reservation and adds it to the list.
        getReservations: Returns the list of all reservations.
        getReservationById: Retrieves a reservation by its ID.
        cancelReservation: Cancels a reservation by its ID.
    3) ReservationSystemUI
        start: Starts the command-line interface, providing options to make, view, and cancel reservations.
       main: The main method to run the application.

5. User Interface :
    The ReservationSystemUI class provides a simple command-line interface with the following options:

    1) Make a reservation: Prompts the user to enter their name, date of reservation, and number of guests.
    2) View all reservations: Displays all current reservations.
    3) Cancel a reservation: Prompts the user to enter the Reservation ID to cancel.
    4) Exit: Exits the application.

6. License :
     This project is licensed under the MIT License.         

package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
       /* String sdepart = "2023-03-12";
        LocalDate depart = LocalDate.parse(sdepart);
        String sreturn = "2023-03-14";
        LocalDate returnDate = LocalDate.parse(sreturn);
        String random = "FOF"+Math.random();
        String substring = random.substring(random.length()-4);
        String TripSource = "NANJING LUKOU INTERNATIONAL AIRPORT ";
        String DestinationAirport = "OULU AIRPORT";
        FlightBooking fb = new FlightBooking("John Doe", depart, returnDate, 1, 3);
        int expResult = 4;
        fb.setTotalPassengers(1,3);
        int result = fb.getTotalPassengers();
        fb.setPassengerFullName("John Doe");
        fb.setTicketNumber();
        fb = new FlightBooking(null, null, null, 0, 0);
        fb.setTripSource("NANJING") ;
        fb.setTripDestination("OULU"," Helsinki");
        fb.setFlightCompany("Flights-of-Fancy");
        fb.setDepartureDate(LocalDate.parse("2023-03-12"));
        fb.setReturnDate(LocalDate.parse("2023-03-14"));


        System.out.println("Dear " + fb.getPassengerFullName() + ". Thank you for booking your flight with " +
                fb.getFlightCompany() + "." +" \n " +
                "Following are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + fb.getTicketNumber() + "\n" +
                "From " + fb.getTripSource() + " to " + fb.getTripDestination() + "\n" +
                "Date of departure: " + fb.getDepartureDate() + "\n" +
                "Date of return: " + fb.getReturnDate() + "\n" +
                "Total passengers: " + fb.getTotalPassengers() + "\n" +
                "Total ticket price in Euros: " + fb.getTotalTicketPrice());*/

        FlightBooking fb = new FlightBooking(null, null, null, 0, 0);

        FlightBooking.TripSource source = FlightBooking.TripSource.NANJING;
        FlightBooking.TripDestination destination = FlightBooking.TripDestination.BEIJING;

        FlightBooking.TripType type = FlightBooking.TripType.ONE_WAY;

        FlightBooking.BookingClass bookClass = FlightBooking.BookingClass.FIRST;

        fb.setTripSource("1");
        fb.setTripDestination("1", "2");

        fb.setTripType("1");
        fb.setBookingClass("1");

        String expectedTicketNumber = "11FASDFDOM";

        String expectedSubstring1 = expectedTicketNumber.substring(0,2);
        String expectedSubstring2 = expectedTicketNumber.substring(7, 9);

        String ticketNumber = fb.getTicketNumber();

        /*String returnedSubstring1 = ticketNumber.substring(0, 2);

        String returnedSubstring2 = ticketNumber.substring(7, 9);*/
        System.out.println(ticketNumber);
        
    }
}

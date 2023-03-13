package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;
import java.util.Random;

public class FlightBooking {
    private String FlightCompany;
    private String PassengerFullName;
    private String TicketNumber;
    private String DestinationAirport;
    private String SourceAirport;
    private LocalDate DepartureDate;
    private LocalDate ReturnDate;
    private int ChildPassengers;
    private int AdultPassengers;
    private int TotalPassengers;
    private LocalDate TripDate;
    private double DepartureTicketPrice;
    private double ReturnTicketPrice;
    private double TotalTicketPrice;
    public FlightBooking(String aNull, LocalDate depart, LocalDate returnDate,int i,int i1){
        this.PassengerFullName = aNull;
        this.DepartureDate = depart;
        this.ReturnDate = returnDate;
        this.ChildPassengers = i;
        this.AdultPassengers = i1;
    }
    String sdepart = "2023-03-04";
    LocalDate departureDate = LocalDate.parse(sdepart);
    String sreturn = "2023-03-05";
    LocalDate returnDate = LocalDate.parse(sreturn);
   /* public void setTripDate(LocalDate tripDate){
        long diff = returnDate.toEpochDay() - departureDate.toEpochDay();
        if (diff == 0) {
            returnDate = departureDate.plusDays(1);
        } else if (diff == 1) {
            returnDate = departureDate.plusDays(2);
        }
        this.returnDate = departureDate.plusDays(2);
    }*/
    public LocalDate getTripDate(){
        return TripDate;
    }
    private TripSource tripSource;
    enum TripSource {
        NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS
    }
    public TripSource getTripSource() {
        return tripSource;
    }
    public void setTripSource(String source) {
        switch (source) {
            case "1":
                this.tripSource = TripSource.NANJING;
                break;
            case "2":
                this.tripSource = TripSource.BEIJING;
                break;
            case "3":
                this.tripSource = TripSource.OULU;
                break;
            case "4":
                this.tripSource = TripSource.HELSINKI;
                break;
            case "5":
                this.tripSource = TripSource.SHANGHAI;
                break;
            case "6":
                this.tripSource = TripSource.PARIS;
                break;
            default:
                break;
        }
    }
    private TripDestination tripDestination;
    enum TripDestination {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS
    }
    public TripDestination getTripDestination() {
        return tripDestination;
    }
    public void setTripDestination(String tripDestination, String tripDestination2) {
        switch (tripDestination2) {
            case "1":
                this.tripDestination = TripDestination.NANJING;
                break;
            case "2":
                this.tripDestination = TripDestination.BEIJING;
                break;
            case "3":
                this.tripDestination = TripDestination.SHANGHAI;
                break;
            case "4":
                this.tripDestination = TripDestination.OULU;
                break;
            case "5":
                this.tripDestination = TripDestination.HELSINKI;
                break;
            case "6":
                this.tripDestination = TripDestination.PARIS;
                break;
            default:
                break;
        }
    }
    private BookingClass bookingClass;
    enum BookingClass {
        FIRST, BUSINESS, ECONOMY
    }
    public void setBookingClass(String bookingClass){
        switch (bookingClass){
            case "1":
                this.bookingClass = BookingClass.FIRST;
                break;
            case "2":
                this.bookingClass = BookingClass.BUSINESS;
                break;
            case "3":
                this.bookingClass = BookingClass.ECONOMY;
                break;
            default:
                break;
        }
    }
    private TripType tripType;
    enum TripType {
        ONE_WAY, RETURN
    }
    public TripType getTripType() {
        return tripType;
    }
    public void setTripType(String triptype) {
        switch (triptype) {
            case "1":
                this.tripType = TripType.ONE_WAY;
                break;
            case "2":
                this.tripType = TripType.RETURN;
                break;
            default:
                break;
        }
    }
    private String sourceAirport;
    public String getSourceAirport() {
        return sourceAirport;
    }
    public void setSourceAirport(String sourceAirport) {
        switch (tripSource) {
            case NANJING:
                this.sourceAirport = "Nanjing Lukou International Airport";
                break;
            case OULU:
                this.sourceAirport = "Oulu Airport";
                break;
            case BEIJING:
                this.sourceAirport = "Beijing Capital International Airport";
                break;
            case PARIS:
                this.sourceAirport = "Paris Charles de Gaulle Airport";
                break;
            case HELSINKI:
                this.sourceAirport = "Helsinki Airport";
                break;
            case SHANGHAI:
                this.sourceAirport = "Shanghai Pudong International Airport";
                break;
            default:
                break;
        }
    }
    private String destinationAirport;
    public String getDestinationAirport() {
        return destinationAirport;
    }
    public String getTicketNumber() {
        setTicketNumber();
        return TicketNumber;
    }
    public void setDestinationAirport() {
        this.destinationAirport = "";
        switch (tripDestination) {
            case NANJING:
                this.destinationAirport = "Nanjing Lukou International Airport";
                break;
            case BEIJING:
                this.destinationAirport = "Beijing Capital International Airport";
                break;
            case SHANGHAI:
                this.destinationAirport = "Shanghai Pudong International Airport";
                break;
            case OULU:
                this.destinationAirport = "Oulu Airport";
                break;
            case HELSINKI:
                this.destinationAirport = "Helsinki Airport";
                break;
            case PARIS:
                this.destinationAirport = "Paris Charles de Gaulle Airport";
                break;
            default:
                break;
        }
    }
    Random random = new Random();
    public void setTicketNumber() {
        String ticketNumber = null;
        switch (tripType) {
            case ONE_WAY:
                ticketNumber = "11";
                break;
            case RETURN:
                ticketNumber = "22";
                break;
        }
        switch (bookingClass) {
            case FIRST:
                ticketNumber = ticketNumber + "F";
                break;
            case BUSINESS:
                ticketNumber = ticketNumber + "B";
                break;
            case ECONOMY:
                ticketNumber = ticketNumber + "E";
                break;
        }
        for (int i = 0; i < 4; i++) {
            char n = (char) ((random.nextInt(45) + 65));
            ticketNumber = ticketNumber + n;
        }
        switch (tripSource) {
            case SHANGHAI:
                switch (tripDestination){
                    case BEIJING:
                    case NANJING:
                        ticketNumber = ticketNumber + "DOM";
                        break;
                    case HELSINKI:
                    case PARIS:
                    case OULU:
                        ticketNumber = ticketNumber + "INT";
                        break;
                    default:
                        break;
                }
                break;
            case OULU:
                switch (tripDestination){
                    case HELSINKI:
                        ticketNumber = ticketNumber + "DOM";
                        break;
                    case PARIS:
                    case BEIJING:
                    case SHANGHAI:
                    case NANJING:
                        ticketNumber= ticketNumber + "INT";
                        break;
                    default:
                        break;
                }
                break;
            case NANJING:
                switch (tripDestination){
                    case SHANGHAI:
                    case BEIJING:
                        ticketNumber = ticketNumber + "DOM";
                        break;
                    case PARIS:
                    case HELSINKI:
                    case OULU:
                        ticketNumber = ticketNumber + "INT";
                        break;
                    default:
                        break;
                }
                break;
            case BEIJING:
                switch (tripDestination){
                    case SHANGHAI:
                    case NANJING:
                        ticketNumber = ticketNumber + "DOM";
                        break;
                    case PARIS:
                    case HELSINKI:
                    case OULU:
                        ticketNumber = ticketNumber + "INT";
                        break;
                    default:
                        break;
                }
                break;
            case PARIS:
                switch (tripDestination){
                    case HELSINKI:
                    case OULU:
                    case BEIJING:
                    case SHANGHAI:
                    case NANJING:
                        ticketNumber = ticketNumber + "INT";
                        break;
                    default:
                        break;
                }
                break;
            case HELSINKI:
                switch (tripDestination){
                    case OULU:
                        ticketNumber = ticketNumber + "DOM";
                        break;
                    case PARIS:
                    case BEIJING:
                    case SHANGHAI:
                    case NANJING:
                        ticketNumber = ticketNumber + "INT";
                        break;
                    default:
                        break;
                }
                break;
        }
        this.TicketNumber = ticketNumber;
    }

    public String getPassengerFullName()
    {
        return PassengerFullName;
    }
    public String getFlightCompany()
    {
        return FlightCompany;
    }
    public LocalDate getDepartureDate()
    {
        return DepartureDate;
    }
    public LocalDate getReturnDate()
    {
        return ReturnDate;
    }
    public int getChildPassengers()
    {
        return ChildPassengers;
    }
    public int getAdultPassengers()
    {
        return AdultPassengers;
    }
    public int getTotalPassengers()
    {
        return TotalPassengers;
    }
    public double getTotalTicketPrice()
    {
        return TotalTicketPrice;
    }
    public double getDepartureTicketPrice() {

        return DepartureTicketPrice;
    }

    public double getReturnTicketPrice() {

        return ReturnTicketPrice;
    }
    public void setPassengerFullName(String passengerFullName)
    {
        this.PassengerFullName = passengerFullName;
    }
    public void setFlightCompany(String flightCompany)
    {
        this.FlightCompany = flightCompany;
    }
    public void setDepartureDate(LocalDate departureDate)
    {
        this.DepartureDate = departureDate;
    }

    public void setReturnDate(LocalDate returnDate)
    {
        this.ReturnDate = departureDate.plusDays(2);
    }

    public void setAdultPassengers(int adultPassengers)
    {
        this.AdultPassengers = adultPassengers;
    }

    public void setChildPassengers(int childPassengers)
    {
        this.ChildPassengers = childPassengers;
    }

    public void setTotalPassengers(int totalPassengers, int TotalPassengers)
    {
        this.TotalPassengers = ChildPassengers+AdultPassengers;
    }
    public void setTotalTicketPrice()
    {
        this.TotalTicketPrice = Math.abs((((2 * ((300 + (0.1 * 300)) + (0.05 * 300))) + (5 * ((300 + (0.1 * 300)) + (0.05 * 300)))) + 250) * 2);
    }
    public void setReturnTicketPrice() {

        this.ReturnTicketPrice = ReturnTicketPrice;
    }
    public void setDepartingTicketPrice(int child, int adult) {

        this.DepartureTicketPrice = DepartureTicketPrice;
    }
    /*public String toString() {
        return "Dear " + PassengerFullName + ". Thank you for booking your flight with " +
                FlightCompany + ". \nFollowing are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + TicketNumber + "\n" +
                "From " + tripSource + " to " + TripDestination + "\n" +
                "Date of departure: " + DepartureDate + "\n" +
                "Date of return: " + ReturnDate + "\n" +
                "Total passengers: " + TotalPassengers + "\n" +
                "Total ticket price in Euros: " + TotalTicketPrice;
    }*/
    private ConfirmationMessage confirmationMessage;

    enum ConfirmationMessage {
        CHANGE, SAVE
    }

    public void setConfirmationMessage(String confirmationmessage) {
        switch (confirmationmessage) {
            case "1":
                this.confirmationMessage = confirmationMessage.CHANGE;
                System.out.println("Thank you for booking your flight with " + FlightCompany + ". Following are the details \n" +
                        "of your booking and the trip: \n" +
                        "Ticket Number: " + TicketNumber + "\n" +
                        "Passenger Name: " + PassengerFullName + "\n" +
                        "From TripSource to " + tripDestination + "\n" +
                        "Date of departure: " + DepartureDate + "\n" +
                        "Date of return: ReturnDate (Changed from old ReturnDate to new\n" +
                        ReturnDate + ")\n" +
                        "Total passengers: " + TotalPassengers + "\n" +
                        "Total ticket price in Euros: " + TotalTicketPrice + "\n" +
                        "IMPORTANT NOTICE: As per our policy, the return date was changed because it was \n" +
                        "less than two days apart from your departure date");
                break;
            case "2":
                this.confirmationMessage = confirmationMessage.SAVE;
                System.out.println("Thank you for booking your flight with " + FlightCompany + ".Following are the details \n" +
                        "of your booking and the trip: \n" +
                        "Ticket Number: " + TicketNumber + "\n" +
                        "Passenger Name: " + PassengerFullName + "\n" +
                        "From TripSource to " + tripDestination + "\n" +
                        "Date of departure: " + DepartureDate + "\n" +
                        "Date of return: " + ReturnDate + "\n" +
                        "Total passengers: " + TotalPassengers + "\n" +
                        "Total ticket price in Euros: " + TotalTicketPrice + "\n");

                break;
        }
    }
}



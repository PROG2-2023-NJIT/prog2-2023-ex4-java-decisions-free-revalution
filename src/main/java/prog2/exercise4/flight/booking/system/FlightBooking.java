package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Scanner;
import java.util.Random;
public class FlightBooking {
    private FlightBooking.BookingClass bookingClass;
    private FlightBooking.TripType tripType;
    private String passengerFullName;
    private String flightCompany;
    private String flightID;
    //private String passengerFullName;
    private FlightBooking.TripSource tripSource;
    private FlightBooking.SourceAirport sourceAirport;
    private FlightBooking.TripDestination tripDestination ;
    private FlightBooking.DestinationAirport destinationAirport;
    private  LocalDate departureDate;
    private LocalDate returnDate;
    private int childPassengers;
    private int adultPassengers;
    private int totalPassengers;
    private double departingTicketPrice;
    private double returnTicketPrice;
    private double  totalTicketPrice;
    private String ticketNumber;

    public FlightBooking() {

    }

    public FlightBooking(String passengerFullName, LocalDate departureDate, LocalDate returnDate,int childPassengers, int adultPassengers)
    {
        this.passengerFullName=passengerFullName;
        this.departureDate=departureDate;
        this.returnDate=returnDate;
        this.childPassengers=childPassengers;
        this.adultPassengers=adultPassengers;
    }

    //1
    public void setFlightCompany(String flightCompany) {
        this.flightCompany = flightCompany;
    }

    public String getFlightCompany(){
        return flightCompany;
    }

    //2
    public void setFlightID(String flightID) {
        String str1 = "FOF";
        String number = "0345";
        String str2 = "IN";
        this.flightID = String.join(str1, number, str2);
    }
    public String getFlightID() {
        return flightID;
    }

    //3

    public void setPassengerFullName(String passengerFullName) {
        this.passengerFullName = passengerFullName;}

    public String getPassengerFullName(){
        return passengerFullName;
    }

    enum TripSource {
          NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS66
    }
    //4
    public void setTripSource(String number) {
        String[] trip_Destination = {"Nanjing", "Beijing", "Shanghai", "Oulu", "Helsinki", "Paris"};

        switch (number){
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
            default:
                System.out.println("Error!");
        }

    }

    public FlightBooking.TripSource getTripSource() {
        return tripSource;
    }

    //5
    enum SourceAirport{
        Nanjing_Lukou_International_Airport, Beijing_Capital_International_Airport, Shanghai_Pudong_International_Airport, Oulu_Airport, Helsinki_Airport, Paris_Charles_de_Gaulle_Airport
    }
    public void setSourceAirport(String number) {
        String[] source_Airport = {"Nanjing Lukou International Airport",
                "Beijing Capital International Airport",
                "Shanghai Pudong International Airport",
                "Oulu Airport",
                "Helsinki Airport",
                "Paris Charles de Gaulle Airport"};
        switch (number){
            case "1":
                this.sourceAirport = SourceAirport.Nanjing_Lukou_International_Airport;
                break;
            case "2":
                this.sourceAirport = SourceAirport.Beijing_Capital_International_Airport;
                break;
            case "3":
                this.sourceAirport = SourceAirport.Oulu_Airport;
                break;
            case "4":
                this.sourceAirport = SourceAirport. Helsinki_Airport;
                break;
            default:
                System.out.println("Error!");
        }
    }

    public FlightBooking.SourceAirport getSourceAirport(){
        return sourceAirport;
    }

    //6
    enum TripDestination {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS66
    }
    public void setTripDestination(String number_01, String number_02) {
        String[] trip_Destination = {"Nanjing", "Beijing", "Shanghai", "Oulu", "Helsinki", "Paris"};
        if(number_01 == number_02){
            System.out.println("Something is wrong!");
        }else{
            switch (number_02){
                case "1":
                    this.tripDestination = TripDestination.NANJING;
                    break;
                case "2":
                    this.tripDestination = TripDestination.BEIJING;
                    break;
                case "3":
                    this.tripDestination = TripDestination.OULU;
                    break;
                case "4":
                    this.tripDestination = TripDestination.HELSINKI;
                    break;
                default:
                    System.out.println("Error!");
            }
        }



    }

    public FlightBooking.TripDestination getTripDestination() {
        return tripDestination;
    }

    //7
    enum DestinationAirport{
        Nanjing_Lukou_International_Airport, Beijing_Capital_International_Airport, Shanghai_Pudong_International_Airport, Oulu_Airport, Helsinki_Airport, Paris_Charles_de_Gaulle_Airport
    }
    public void setDestinationAirport(String number) {
        String[] destination_Airport = {"Nanjing Lukou International Airport",
                "Beijing Capital International Airport",
                "Shanghai Pudong International Airport",
                "Oulu Airport",
                "Helsinki Airport",
                "Paris Charles de Gaulle Airport"};
        switch (number){
            case "1":
                this.destinationAirport = DestinationAirport.Nanjing_Lukou_International_Airport;
                break;
            case "2":
                this.destinationAirport = DestinationAirport.Beijing_Capital_International_Airport;
                break;
            case "3":
                this.destinationAirport = DestinationAirport.Oulu_Airport;
                break;
            case "4":
                this.destinationAirport = DestinationAirport. Helsinki_Airport;
                break;
            default:
                System.out.println("Error!");
        }
        }


    public FlightBooking.DestinationAirport getDestinationAirport(){
        return destinationAirport;
    }

    //8
    public void setDepartureDate(LocalDate departureDate) {
        String sdepart = "2023-03-04";
        this.departureDate = LocalDate.parse(sdepart);

    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    //9
    public void setReturnDate(LocalDate returnDate) {
        String sreturn = "2023-03-05";
        this.returnDate  = departureDate.plusDays(2);
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }
    //10
    public void setChildPassengers(int childPassengers) {
        this.childPassengers = childPassengers;
    }

    public int getChildPassengers() {
        return childPassengers;
    }

    //11
    public void setAdultPassengers(int adultPassengers) {
        this.adultPassengers = adultPassengers;
    }

    public int getAdultPassengers() {
        return adultPassengers;
    }

    //12
    public void setTotalPassengers( int childPassengers, int adultPassengers){this.totalPassengers = childPassengers+adultPassengers;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }

    //13
    public void setDepartingTicketPrice() {
        this.departingTicketPrice = departingTicketPrice;

    }

    public double getDepartingTicketPrice(){
        return departingTicketPrice;
    }

    //14
    public void setReturnTicketPrice() {
        this.returnTicketPrice = returnTicketPrice;

    }

    public double getReturnTicketPrice() {
        return returnTicketPrice;
    }

    //15
    public void setTotalTicketPrice() {
        this.totalTicketPrice = Math.abs((((2 *((300 + (0.1*300)) + (0.05*300))) + (5*((300 + (0.1*300)) + (0.05*300)))) + 250)*2);;
    }

    public double getTotalTicketPrice() {
        return Math.abs((((2 *((300 + (0.1*300)) + (0.05*300))) + (5*((300 + (0.1*300)) + (0.05*300)))) + 250)*2);
    }

    //16
    public void setTicketNumber(String traveltype, String seatnumber, String TripSource1, String TripDestination1 ) {
        if(traveltype == "1"){
            if(seatnumber == "1"){
                if(TripSource1 == "1" && TripDestination1 =="2" || TripSource1 == "3" && TripDestination1 =="4" || TripSource1 == "2" && TripDestination1 =="1" || TripSource1 == "4" && TripDestination1 =="3" ){
                    this.ticketNumber = "11F####DOM";
                }else if(TripSource1 == "1" && TripDestination1 =="3" || TripSource1 == "1" && TripDestination1 =="4" || TripSource1 == "2" && TripDestination1 =="3" || TripSource1 == "2" && TripDestination1 =="4" ){
                    this.ticketNumber = "11F####INT";
                }else if(TripSource1 == "3" && TripDestination1 =="1" || TripSource1 == "4" && TripDestination1 =="1" || TripSource1 == "3" && TripDestination1 =="2" || TripSource1 == "4" && TripDestination1 =="2"){
                    this.ticketNumber = "11F####INT";
                }else{
                    System.out.println("Wrong!");
                }
            }else if(seatnumber == "2"){
                if(TripSource1 == "1" && TripDestination1 =="2" || TripSource1 == "3" && TripDestination1 =="4" || TripSource1 == "2" && TripDestination1 =="1" || TripSource1 == "4" && TripDestination1 =="3" ){
                    this.ticketNumber = "11B####DOM";
                }else if(TripSource1 == "1" && TripDestination1 =="3" || TripSource1 == "1" && TripDestination1 =="4" || TripSource1 == "2" && TripDestination1 =="3" || TripSource1 == "2" && TripDestination1 =="4" ){
                    this.ticketNumber = "11B####INT";
                }else if(TripSource1 == "3" && TripDestination1 =="1" || TripSource1 == "4" && TripDestination1 =="1" || TripSource1 == "3" && TripDestination1 =="2" || TripSource1 == "4" && TripDestination1 =="2"){
                    this.ticketNumber = "11B####INT";
                }else{
                    System.out.println("Wrong!");
                }

            }else if(seatnumber == "3"){
                if(TripSource1 == "1" && TripDestination1 =="2" || TripSource1 == "3" && TripDestination1 =="4" || TripSource1 == "2" && TripDestination1 =="1" || TripSource1 == "4" && TripDestination1 =="3" ){
                    this.ticketNumber = "11E####DOM";
                }else if(TripSource1 == "1" && TripDestination1 =="3" || TripSource1 == "1" && TripDestination1 =="4" || TripSource1 == "2" && TripDestination1 =="3" || TripSource1 == "2" && TripDestination1 =="4" ){
                    this.ticketNumber = "11E####INT";
                }else if(TripSource1 == "3" && TripDestination1 =="1" || TripSource1 == "4" && TripDestination1 =="1" || TripSource1 == "3" && TripDestination1 =="2" || TripSource1 == "4" && TripDestination1 =="2"){
                    this.ticketNumber = "11E####INT";
                }else{
                    System.out.println("Wrong!");
                }
            }
        }else if(traveltype == "2"){
            if(seatnumber == "1"){
                if(TripSource1 == "1" && TripDestination1 =="2" || TripSource1 == "3" && TripDestination1 =="4" || TripSource1 == "2" && TripDestination1 =="1" || TripSource1 == "4" && TripDestination1 =="3" ){
                    this.ticketNumber = "22F####DOM";
                }else if(TripSource1 == "1" && TripDestination1 =="3" || TripSource1 == "1" && TripDestination1 =="4" || TripSource1 == "2" && TripDestination1 =="3" || TripSource1 == "2" && TripDestination1 =="4" ){
                    this.ticketNumber = "22F####INT";
                }else if(TripSource1 == "3" && TripDestination1 =="1" || TripSource1 == "4" && TripDestination1 =="1" || TripSource1 == "3" && TripDestination1 =="2" || TripSource1 == "4" && TripDestination1 =="2"){
                    this.ticketNumber = "22F####INT";
                }else{
                    System.out.println("Wrong!");
                }
            }else if(seatnumber == "2"){
                if(TripSource1 == "1" && TripDestination1 =="2" || TripSource1 == "3" && TripDestination1 =="4" || TripSource1 == "2" && TripDestination1 =="1" || TripSource1 == "4" && TripDestination1 =="3" ){
                    this.ticketNumber = "22B####DOM";
                }else if(TripSource1 == "1" && TripDestination1 =="3" || TripSource1 == "1" && TripDestination1 =="4" || TripSource1 == "2" && TripDestination1 =="3" || TripSource1 == "2" && TripDestination1 =="4" ){
                    this.ticketNumber = "22B####INT";
                }else if(TripSource1 == "3" && TripDestination1 =="1" || TripSource1 == "4" && TripDestination1 =="1" || TripSource1 == "3" && TripDestination1 =="2" || TripSource1 == "4" && TripDestination1 =="2"){
                    this.ticketNumber = "22B####INT";
                }else{
                    System.out.println("Wrong!");
                }

            }else if(seatnumber == "3"){
                if(TripSource1 == "1" && TripDestination1 =="2" || TripSource1 == "3" && TripDestination1 =="4" || TripSource1 == "2" && TripDestination1 =="1" || TripSource1 == "4" && TripDestination1 =="3" ){
                    this.ticketNumber = "22E####DOM";
                }else if(TripSource1 == "1" && TripDestination1 =="3" || TripSource1 == "1" && TripDestination1 =="4" || TripSource1 == "2" && TripDestination1 =="3" || TripSource1 == "2" && TripDestination1 =="4" ){
                    this.ticketNumber = "22E####INT";
                }else if(TripSource1 == "3" && TripDestination1 =="1" || TripSource1 == "4" && TripDestination1 =="1" || TripSource1 == "3" && TripDestination1 =="2" || TripSource1 == "4" && TripDestination1 =="2"){
                    this.ticketNumber = "22E####INT";
                }else{
                    System.out.println("Wrong!");
                }
            }

        }else{
            System.out.println("Wrong!");
        }

    }

    public String getTicketNumber(){
        return ticketNumber;
    }
    //17
    enum BookingClass{
        FIRST, BUSINESS, ECONOMY
    }
    public void setBookingClass(String number){
        switch (number){
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
                System.out.println("Error!");
        }
    }
    public FlightBooking.BookingClass getBookingClass(){
        return bookingClass;
    }
    //18
    enum TripType{
        ONE_WAY, RETURN
    }
    public void setTripType(String number){
        switch (number){
            case "1":
                this.tripType = TripType.ONE_WAY;
                break;
            case "2":
                this.tripType = TripType. RETURN;
                break;
            default:
                System.out.println("Error!");
        }

    }
    public FlightBooking.TripType getTripType(){
        return tripType;
    }
    public void show1(){
        System.out.println("flightCompany:" + flightCompany);
        System.out.println("flightID:" + flightID);
    }
    public void show2(){
        System.out.println("tripSource:" + tripSource);
        System.out.println("sourceAirport:" + sourceAirport);
        System.out.println("tripDestination:" + tripDestination);
        System.out.println("destinationAirport:" + destinationAirport);
    }
    public void show3(){

        System.out.println("departingTicketPrice:" + departingTicketPrice);
        System.out.println("returnTicketPrice:" + returnTicketPrice);
        totalTicketPrice = departingTicketPrice + returnTicketPrice;
        System.out.println("totalTicketPrice:" + totalTicketPrice);
        System.out.println("ticketNumber:" + ticketNumber);
    }


    public String toString(){
        return "Dear " + passengerFullName + ". Thank you for booking your flight with " +
                flightCompany + "." + "\n" +
                "Following are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + ticketNumber + "\n" +
                "From " + tripSource + " to " + tripDestination + "\n" +
                "Date of departure: " + departureDate + "\n" +
                "Date of return: " + returnDate + "\n" +
                "Total passengers: " + totalPassengers + "\n" +
                "Total ticket price in Euros: " + totalTicketPrice;
    }

}



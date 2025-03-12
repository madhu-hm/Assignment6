package assignment6;

import java.time.LocalDateTime;

public class FlightDTO {
	private String flightID;
	private String flightNo;
	private String airlineName;
	private String departure;
	private String arrival;
	private LocalDateTime departureTime;
	private LocalDateTime arrivalTime;
	private int totalSeats;
	private int availableSeats;
	private double ticketPrice;
	private static int totalFlights=0;
	
	public FlightDTO(String flightID,String flightNo,String airlineName,String departure,String arrival,LocalDateTime departureTime,LocalDateTime arrivalTime,int totalSeats,int availableSeats,double ticketPrice) {
		this.setFlightID(flightID);
		this.setFlightNo(flightNo);
		this.setAirlineName(airlineName);
		this.setDeparture(departure);
		this.setArrival(arrival);
		this.setDepartureTime(departureTime);
		this.setArrivalTime(arrivalTime);
		this.setTotalSeats(totalSeats);
		this.setAvailableSeats(availableSeats);
		this.setTicketPrice(ticketPrice);
		setTotalFlights(getTotalFlights() + 1);
	}
	public static void main(String[] args) {
		FlightDTO flight = new FlightDTO("F101", "AA123", "Indigo", 
                "Delhi", "Chennai", LocalDateTime.of(2025, 03, 12, 14, 30), 
                LocalDateTime.of(2025, 03, 14, 17, 0), 
                200, 200, 250.0);
		System.out.println(flight.getAirlineName());
		System.out.println(flight.getFlightID());
		System.out.println(flight.getFlightNo());
		System.out.println(flight.getDeparture());
		System.out.println(flight.getArrival());
		System.out.println(flight.getDepartureTime());
		System.out.println(flight.getArrivalTime());
		System.out.println(flight.getTotalFlights());
	}
	
	public String getFlightID() {
		return flightID;
	}
	public void setFlightID(String flightID) {
		this.flightID = flightID;
	}
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public static int getTotalFlights() {
		return totalFlights;
	}
	public static void setTotalFlights(int totalFlights) {
		FlightDTO.totalFlights = totalFlights;
	}
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}
	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

}

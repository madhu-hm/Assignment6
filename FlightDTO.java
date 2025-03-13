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
	
	public static void main(String[] args) {
		FlightDTO flight = new FlightDTO();
		flight.setAirlineName("Indigo");
		flight.setFlightID("F101");
		flight.setFlightNo("AA123");
		flight.setTicketPrice(250.0);
		flight.setTotalSeats(200);
		flight.setAvailableSeats(200);
		flight.setArrival("Delhi");
		flight.setDeparture("Chennai");
		flight.setArrivalTime(LocalDateTime.of(2025,03,12,14,30));
		flight.setDepartureTime(LocalDateTime.of(2025,03,14,17,0));
		FlightDTO.totalFlights++;
		System.out.println(flight.getAirlineName());
		System.out.println(flight.getFlightID());
		System.out.println(flight.getFlightNo());
		System.out.println(flight.getDeparture());
		System.out.println(flight.getArrival());
		System.out.println(flight.getDepartureTime());
		System.out.println(flight.getArrivalTime());
		System.out.println(getTotalFlights());
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

package assignment6;

public class MovieDTO {
	private String movieName;
	private String releasedYear;
	private String Director;
	private String genre;
	
	public static void main(String[] args) {
		MovieDTO movie=new MovieDTO();
		movie.setMovieName("OKKanmani");
		movie.setDirector("Manirathnam");
		movie.setReleasedYear("2015");
		movie.setGenre("Romantic Drama");
		System.out.println("Movie Name:"+movie.getMovieName());
		System.out.println("Directed By:"+movie.getDirector());
		System.out.println("Released in:"+movie.getReleasedYear());
		System.out.println("Movie Genre:"+movie.getGenre());
		System.out.println();
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getReleasedYear() {
		return releasedYear;
	}

	public void setReleasedYear(String releasedYear) {
		this.releasedYear = releasedYear;
	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}

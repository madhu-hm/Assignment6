package assignment6;

public class Songs {
	private String songName;
    private String singer;
    private String duration;

    public Songs(String songName, String singer, String duration) {
        this.songName = songName;
        this.singer = singer;
        this.duration = duration;
    }

    public void displaySongDetails() {
        System.out.println("Song Name: " + songName);
        System.out.println("Singer: " + singer);
        System.out.println("Duration: " + duration);
        System.out.println("-----------------------------");
    }
}

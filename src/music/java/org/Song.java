package music.java.org;

public class Song {
	
	private String title;
	private double duration;
	
	public Song(String title, double duration) {
		
	}
	
	public String getTitle() {
		return title;
	}
	public Double getDuration() {
		return duration;
	}
	
	@Override
	public String toString() {
		return " Song {" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
		
		//return "Song{" + "title='" + title + '\''+ ", duration=" +duration + '}';
	}
}

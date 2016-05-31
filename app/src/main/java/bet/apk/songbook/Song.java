package bet.apk.songbook;

import java.io.Serializable;

public class Song implements Serializable{
	private static final long serialVersionUID = 4184807539065162810L;
	private String title;
	private String author;
	private String melody;
	private String text;
	private String note;
	
	public Song(String title, String melody, String author, String text, String note){
		this.title = title;
		this.author = author;
		this.melody = melody;
		this.text = text;
		this.note = note;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getMelody() {
		return melody;
	}

	public void setMelody(String melody) {
		this.melody = melody;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String toString(){
		return title;
	}
	
	@Override 
	public boolean equals(Object other) {
		if(other instanceof Song){
			return ((Song)other).text.equals(text);
		}
		return false;
	}
}

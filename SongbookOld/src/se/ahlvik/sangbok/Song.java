package se.ahlvik.sangbok;

import java.io.Serializable;

public class Song implements Serializable{
	private static final long serialVersionUID = 4184807539065162810L;
	public String title;
	public String author;
	public String melody;
	public String text;
	public String note;
	
	public Song( String title, String melody, String author, String text, String note){
		this.title = title;
		this.author = author;
		this.melody = melody;
		this.text = text;
		this.note = note;
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

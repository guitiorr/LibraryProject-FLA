package model.computerfile;

import model.author.Author;

public class Pdf{
	
	private double fileSize;
	
	public Pdf(double fileSize) {
		super();
		this.fileSize = fileSize;
	}
	public double getFileSize() {
		return fileSize;
	}
	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}

	
	
}

package cristopher.marrasquin.dam.mp09.uf03.a01.domain;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 1L;

	private String title;
	private String author;

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

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
}

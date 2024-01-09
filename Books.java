public class Books
{
	private String isbn;
	private String title;
	private String author;
	private String series;
	private boolean available;

	public Books(String isbn, String title, String author, String series, boolean available) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.series = series;
		this.available = available;
	}

	public String getISBN() {
		return isbn;
	}

	public void setISBN(String isbn) {
		this.isbn = isbn;
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

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public boolean getAvailable() {
		return available;
	}

	public void setAuthor(boolean available) {
		this.available = available;
	}
}
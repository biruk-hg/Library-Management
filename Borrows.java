public class Borrows
{
	private int bookID;
	private int lenderID;
	private int librarianID;
	private String returnOrBorrow;

	public Borrows(int bookID, int lenderID, int librarianID, String returnOrBorrow) {
		this.bookID = bookID;
		this.lenderID = lenderID;
		this.librarianID = librarianID;
		this.returnOrBorrow = returnOrBorrow;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	
	public int getLenderID() {
		return lenderID;
	}

	public void setLenderID(int lenderID) {
		this.lenderID = lenderID;
	}

	public int getLibrarianID() {
		return librarianID;
	}

	public void setLibrarianID(int librarianID) {
		this.librarianID = librarianID;
	}

	public String getReturnOrBorrow() {
		return returnOrBorrow;
	}

	public void setReturnOrBorrow(String returnOrBorrow) {
		this.returnOrBorrow = returnOrBorrow;
	}
}
import java.io.*;
import java.util.*;

public class LibraryManagement
{
    private static ArrayList<Books> books;
    private static ArrayList<Borrowers> borrowers;
    private static ArrayList<Librarians> librarians;
    private static ArrayList<Borrows> borrows;

    public static void main(String[] args) {
        // Instantiate FileReader to read data from text files
        FileReader fileReader = new FileReader();

        // Retrieve data for books, borrowers, librarians, and borrows
        books = fileReader.getBooks();
        borrowers = fileReader.getBorrowers();
        librarians = fileReader.getLibrarians();
        borrows = fileReader.getBorrows();

        // Display information for books, borrowers, librarians, and borrows
        printBooks();
        printBorrowers();
        printLibrarians();
        printBorrows();

        // Count the number of times a borrower with ID 1 has borrowed books
        int count = count(borrows, 1);
        System.out.println("Borrower with ID 1 borrowed books " + count + " times.");
    }

    // Display information for all books
    public static void printBooks() {
        System.out.println("Here is the list of books:");
        for(Books book: books)
        {
            System.out.println(book.getISBN() + "," + book.getTitle() + "," + book.getAuthor() + "," + book.getSeries() + "," + book.getAvailable());
        }
        System.out.println();
    }

    // Display information for all borrowers
    public static void printBorrowers() {
        System.out.println("Here is the list of borrowers:");
        for(Borrowers borrower: borrowers)
        {
            System.out.println(borrower.getID() + "," + borrower.getName() + "," + borrower.getEmail() + "," + borrower.getPhone());
        }
        System.out.println();
    }

    // Display information for all librarians
    public static void printLibrarians() {
        System.out.println("Here is the list of librarians:");
        for(Librarians librarian: librarians)
        {
            System.out.println(librarian.getID() + "," + librarian.getName() + "," + librarian.getEmail() + "," + librarian.getPhone());
        }
        System.out.println();
    }

    // Display information for all borrows
    public static void printBorrows() {
        System.out.println("Here is the list of borrows:");
        for(Borrows borrow: borrows)
        {
            System.out.println(borrow.getBookID() + "," + borrow.getLenderID() + "," + borrow.getLibrarianID() + "," + borrow.getReturnOrBorrow());
        }
        System.out.println();
    }

    // Count the number of times a borrower has borrowed books
    public static int count(ArrayList<Borrows> borrows, int borrowerID) {
        int count = 0;
        for(Borrows borrow: borrows)
        {
            if (borrow.getLenderID() == borrowerID)
            {
                count++;
            }
        }
        return count;
    }
}

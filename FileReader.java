import java.io.*;
import java.util.*;

public class FileReader
{
    Scanner input;

    // Method to read and retrieve book data from 'books.txt'
    public ArrayList<Books> getBooks() {
        ArrayList<Books> books = new ArrayList<Books>();
        try {
            File file = new File("books.txt");
            input = new Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                if (line.startsWith("#"))
                    continue;

                String[] data = line.split(",");
                if (data[0].equals("create")) {
                    //isbn,title,author,series,available
                    String isbn = data[1];
                    String title = data[2];
                    String author = data[3];
                    String series = data[4];
                    boolean available = Boolean.parseBoolean(data[5]);
                    Books book = new Books(isbn, title, author, series, available);
                    books.add(book);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return books;
    }

    // Method to read and retrieve borrower data from 'borrowers.txt'
    public ArrayList<Borrowers> getBorrowers() {
        ArrayList<Borrowers> borrowers = new ArrayList<Borrowers>();
        try {
            File file = new File("borrowers.txt");
            input = new Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                if (line.startsWith("#"))
                    continue;

                String[] data = line.split(",");
                if (data[0].equals("create")) {
                    //id,name,email,phone
                    int id = Integer.parseInt(data[1]);
                    String name = data[2];
                    String email = data[3];
                    String phone = data[4];
                    Borrowers borrower = new Borrowers(id, name, email, phone);
                    borrowers.add(borrower);
                } else {
                    int id = Integer.parseInt(data[1]);
                    for (Borrowers borrower : borrowers) {
                        if (borrower.getID() == id) {
                            if (data[2].equals("name"))
                                borrower.setName(data[3]);
                            else if (data[2].equals("email"))
                                borrower.setEmail(data[3]);
                            else if (data[2].equals("phone"))
                                borrower.setPhone(data[3]);
                        }
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return borrowers;
    }

    // Method to read and retrieve librarian data from 'librarians.txt'
    public ArrayList<Librarians> getLibrarians() {
        ArrayList<Librarians> librarians = new ArrayList<Librarians>();
        try {
            File file = new File("librarians.txt");
            input = new Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                if (line.startsWith("#"))
                    continue;

                String[] data = line.split(",");
                if (data[0].equals("create")) {
                    //id,name,email,phone
                    int id = Integer.parseInt(data[1]);
                    String name = data[2];
                    String email = data[3];
                    String phone = data[4];
                    Librarians librarian = new Librarians(id, name, email, phone);
                    librarians.add(librarian);
                } else {
                    int id = Integer.parseInt(data[1]);
                    for (Librarians librarian : librarians) {
                        if (librarian.getID() == id) {
                            if (data[2].equals("name"))
                                librarian.setName(data[3]);
                            else if (data[2].equals("email"))
                                librarian.setEmail(data[3]);
                            else if (data[2].equals("phone"))
                                librarian.setPhone(data[3]);
                        }
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return librarians;
    }

    // Method to read and retrieve borrow data from 'borrows.txt'
    public ArrayList<Borrows> getBorrows() {
        ArrayList<Borrows> borrows = new ArrayList<Borrows>();
        try {
            File file = new File("borrows.txt");
            input = new Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                if (line.startsWith("#"))
                    continue;

                String[] data = line.split(",");
                if (data[0].equals("create")) {
                    //bookID, lenderID, librarianID, return/borrow
                    int bookID = Integer.parseInt(data[1]);
                    int lenderID = Integer.parseInt(data[2]);
                    int librarianID = Integer.parseInt(data[3]);
                    String returnOrBorrow = data[4];
                    Borrows borrow = new Borrows(bookID, lenderID, librarianID, returnOrBorrow);
                    borrows.add(borrow);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return borrows;
    }
}
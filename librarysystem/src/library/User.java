package librarysystem.src.library;

import java.util.ArrayList;
import java.util.List;

public class User implements BookAvailabilityListener {
    private final Integer userId;
    private String userName;
    private List<Book> borrowedBooks = new ArrayList<>();
    private List<Book> subscribedBooks = new ArrayList<>();

    public User(Integer userId, String userName) {
        if (userId == null || userName == null || userName.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.userId = userId;
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName == null) {
            throw new IllegalArgumentException("userId cannot be null!");
        }
        if (userName.trim().isEmpty()) {
            throw new IllegalArgumentException("userName cannot be empty!");
        }
        this.userName = userName;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public List<Book> getSubscribedBooks() {
        return subscribedBooks;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }

    public void borrowBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("book cannot be null!");
        }
        if (book.getStatus() == BookStatus.AVAILABLE) {
            if (subscribedBooks.contains(book)) {
                book.removeAvailabilityListener(this);
            }
            book.checkout();
            borrowedBooks.add(book);
            System.out.println("Book \"" + book.getTitle() + "\" has been successfully borrowed!");
        } else {
            System.out.println("Book \"" + book.getTitle() + "\" is not available for borrowing!");
        }
    }

    // Method to return a book
    public void returnBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("book cannot be null!");
        }
        if (subscribedBooks.contains(book)) {  // unsubscribe from the book if the user owns it.
            book.removeAvailabilityListener(this);
        }
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println("Book \"" + book.getTitle() + "\" has been successfully returned.");
        } else {
            System.out.println("You have not borrowed this book!");
        }
    }

    // Method to subscribe as a listener for a specific book
    public void subscribeToBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("book cannot be null!");
        }
        if (borrowedBooks.contains(book)) {
            System.out.println("Can't subscribe to this book, you already borrowed it!");
        } else {
            book.addAvailabilityListener(this);
            subscribedBooks.add(book);
            System.out.println("Subscribed to  \"" + book.getTitle() + "\" successfully!");
        }
    }

    // Method to unsubscribe as a listener for a specific book
    public void unsubscribeFromBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("book cannot be null!");
        }
        book.removeAvailabilityListener(this);
        subscribedBooks.remove(book);
        System.out.println("Unsubscribed to  \"" + book.getTitle() + "\" successfully!");
    }

    @Override
    public void onBookAvailable(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("book cannot be null!");
        }
        System.out.println("For user: " + this);
        System.out.println("Book \"" + book.getTitle() + "\" is now available for borrowing.");
    }
}

package mk.ukim.finki.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Book;
import mk.ukim.finki.wp.lab.model.BookReservation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Book> books = new ArrayList<>();
    public static List<BookReservation> reservations = new ArrayList<>();

    @PostConstruct
    public void init() {
        books.add(new Book("It ends with us", "Romance",4.5));
        books.add(new Book("1984", "Dystopian",4.8));
        books.add(new Book("Pride and Prejudice", "Romantic fiction",4.7));
        books.add(new Book("The Catcher in the Rye", "Novel",4.1));
        books.add(new Book("Tuesdays with Morrie", "Memoir",4.4));
        books.add(new Book("The Alchemist", "Novel",4.6));
        books.add(new Book("Inferno", "Thriller",4.6));
        books.add(new Book("The 5 AM Club", "Fiction/self-help",4.3));
        books.add(new Book("The Godfather", "Crime",4.5));
        books.add(new Book("Thinking, Fast and Slow", "Science",4.6));
    }
}


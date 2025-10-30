package mk.ukim.finki.wp.lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@AllArgsConstructor
public class BookReservation {
    private String bookTitle;
    private String readerName;
    private String readerAddress;
    private int numberOfCopies;
}
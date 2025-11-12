package mk.ukim.finki.wp.lab.repository;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab.model.Author;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@DependsOn("dataHolder")
public class AuthorRepository {
    public static List<Author> authors = new ArrayList<>();

    @PostConstruct
    public void init(){
        authors.add((new Author("Colleen", "Hoover","country1","Colleen Hoover's bio")));
        authors.add((new Author("George", "Orwell","country2","George Orwell's bio")));
        authors.add((new Author("Jane", "Austen","country3","Jane Austen's bio")));
        authors.add((new Author("J.D.", "Salinger","country4","J.D. Salinger's bio")));
        authors.add((new Author("Mitch", "Albom","country5","Mitch Albom's bio")));
        authors.add((new Author("Paulo", "Coelho","country6","Paulo Coelho's bio")));
        authors.add((new Author("Dan", "Brown","country7","Dan Brown's bio")));
        authors.add((new Author("Robin", "Sharma","country8","Robin Sharma's bio")));
        authors.add((new Author("Mario", "Puzo","country9","Mario Puzo's bio")));
        authors.add((new Author("Daniel", "Kahneman","country10","Daniel Kahneman's bio")));

        for (int i=0; i<authors.size(); i++){
            authors.get(i).setId((long) i);
            DataHolder.books.get(i).setAuthor(authors.get(i));
        }
    }
    public List<Author> findAll(){
        return authors;
    }
    public Author findById(Long id){
        return authors.stream().filter(a -> a.getId().equals(id)).findFirst().orElse(null);
    }
}

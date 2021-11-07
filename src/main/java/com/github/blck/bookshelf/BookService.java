package com.github.blck.bookshelf;

import com.github.javafaker.Faker;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.IntStream;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BookService {

  final Faker faker = Faker.instance();

  public Book getOne() {

    return createBook();
  }

  public List<Book> getBooks() {
    Author author =
        new Author(faker.dragonBall().character(), faker.number().randomDigit());
    return IntStream.range(0, 10)
        .mapToObj(i -> createBook(author))
        .toList();
  }

  private Book createBook() {
    Author author =
        new Author(faker.dragonBall().character(), faker.number().randomDigit());
    return createBook(author);
  }

  private Book createBook(Author author) {
    return new Book(
        faker.programmingLanguage().name(),
        faker.programmingLanguage().creator(),
        LocalDate.now(),
        faker.number().randomDigit(),
        author,
        faker.princessBride().character());
  }
}

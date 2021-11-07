package com.github.blck.bookshelf;

import com.github.blck.htmling.util.HtmlingUtil;
import java.util.List;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/books")
@Produces(MediaType.TEXT_HTML)
public class BookshelfResource {

  private final BookService bookService;

  @Inject
  public BookshelfResource(BookService bookService) {
    this.bookService = bookService;
  }

  @GET
  public String getBooks() {
    List<Book> books = bookService.getBooks();
    return books.stream()
        .map(HtmlingUtil::htmling)
        .collect(Collectors.joining());
  }

  @GET
  @Path("/one")
  public String getBook() {
    Book book = bookService.getOne();
    return HtmlingUtil.htmling(book);
  }
}

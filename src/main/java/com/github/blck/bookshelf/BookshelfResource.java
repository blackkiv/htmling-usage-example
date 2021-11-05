package com.github.blck.bookshelf;

import com.github.blck.htmling.util.HtmlingUtil;
import java.time.LocalDate;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/books")
public class BookshelfResource {

  @GET
  @Produces(MediaType.TEXT_HTML)
  public String getBook() {
    Book book = new Book("title", "description", LocalDate.now(), 80, "secret!");
    return HtmlingUtil.htmling(book);
  }
}
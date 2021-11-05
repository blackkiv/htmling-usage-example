package com.github.blck.bookshelf;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import com.github.blck.htmling.util.HtmlingUtil;
import io.quarkus.test.junit.QuarkusTest;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

@QuarkusTest
class BookshelfResourceTest {

  @Test
  void testHelloEndpoint() {
    Book book = new Book("title", "description", LocalDate.now(), 80, "secret!");
    String expectedResult = HtmlingUtil.htmling(book);
    given()
        .when().get("/books")
        .then()
        .statusCode(200)
        .body(is(expectedResult));
  }

}
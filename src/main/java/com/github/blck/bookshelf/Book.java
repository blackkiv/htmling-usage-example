package com.github.blck.bookshelf;

import com.github.blck.htmling.annotation.Htmling;
import com.github.blck.htmling.annotation.Ignore;
import com.github.blck.htmling.annotation.Property;
import com.github.blck.htmling.annotation.Style;
import java.time.LocalDate;

@Htmling(getterPrefix = "", styles = {
    @Style(name = "background-color", value = "red"),
    @Style(name = "border", value = "medium dashed blue"),
    @Style(name = "font-style", value = "italic")
})
public record Book(
    @Property(styles = {@Style(name = "background-color", value = "orange")})
    String title,
    @Property(styles = {@Style(name = "background-color", value = "yellow")})
    String description,
    @Property(styles = {@Style(name = "background-color", value = "green")})
    LocalDate releasedAt,
    @Property(styles = {@Style(name = "background-color", value = "cyan")})
    int pages,
    @Ignore String secretInfo
) {

}

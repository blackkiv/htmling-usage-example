package com.github.blck.bookshelf;

import com.github.blck.htmling.annotation.Htmling;
import com.github.blck.htmling.annotation.Ignore;
import com.github.blck.htmling.annotation.Style;
import com.github.blck.htmling.annotation.Styles;
import java.time.LocalDate;

@Styles({
    @Style(name = "background-color", value = "red"),
    @Style(name = "border", value = "medium dashed blue"),
    @Style(name = "font-style", value = "italic")
})
@Htmling(getterPrefix = "")
public record Book(
    @Style(name = "background-color", value = "orange")
    String title,
    @Style(name = "background-color", value = "yellow")
    String description,
    @Style(name = "background-color", value = "green")
    LocalDate releasedAt,
    @Style(name = "background-color", value = "cyan")
    int pages,
    @Ignore String secretInfo
) {

}

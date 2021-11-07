package com.github.blck.bookshelf;

import com.github.blck.htmling.annotation.Htmling;
import com.github.blck.htmling.annotation.Ignore;
import com.github.blck.htmling.annotation.Property;
import com.github.blck.htmling.annotation.Style;
import com.github.blck.htmling.enums.CSSProperty;
import com.github.blck.htmling.enums.HTMLTag;
import java.time.LocalDate;

@Htmling(getterPrefix = "", tag = HTMLTag.UL,
    title = @Property(value = "Book:", tag = HTMLTag.LI),
    styles = @Style(property = CSSProperty.BACKGROUND_COLOR, value = "red"))
public record Book(
    @Property(tag = HTMLTag.LI,
        styles = @Style(property = CSSProperty.BACKGROUND_COLOR, value = "orange"))
    String title,
    @Property(tag = HTMLTag.LI,
        styles = @Style(property = CSSProperty.BACKGROUND_COLOR, value = "yellow"))
    String description,
    @Property(tag = HTMLTag.LI,
        styles = @Style(property = CSSProperty.BACKGROUND_COLOR, value = "green"))
    LocalDate releasedAt,
    @Property(tag = HTMLTag.LI,
        styles = @Style(property = CSSProperty.BACKGROUND_COLOR, value = "cyan"))
    int pages,
    @Property(tag = HTMLTag.LI,
        styles = @Style(property = CSSProperty.BACKGROUND_COLOR, value = "blue"))
    Author author,
    @Ignore String secretInfo
) {

}

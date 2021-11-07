package com.github.blck.bookshelf;

import com.github.blck.htmling.annotation.Htmling;
import com.github.blck.htmling.annotation.Property;
import com.github.blck.htmling.annotation.Style;
import com.github.blck.htmling.enums.CSSProperty;
import com.github.blck.htmling.enums.HTMLTag;

@Htmling(getterPrefix = "", tag = HTMLTag.UL,
    styles = @Style(property = CSSProperty.COLOR, value = "white"))
public record Author(
    @Property(tag = HTMLTag.LI,
        styles = @Style(property = CSSProperty.FONT_STYLE, value = "italic"))
    String name,
    @Property(tag = HTMLTag.LI)
    int age
) {

}

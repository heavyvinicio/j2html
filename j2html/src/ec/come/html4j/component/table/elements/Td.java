package ec.come.html4j.component.table.elements;

import static ec.com.html4j.util.Constants.ALIGN;
import static ec.com.html4j.util.Constants.CLASS;
import static ec.com.html4j.util.Constants.COLSPAN;
import static ec.com.html4j.util.Constants.DIR;
import static ec.com.html4j.util.Constants.ID;
import static ec.com.html4j.util.Constants.LANG;
import static ec.com.html4j.util.Constants.ROWSPAN;
import static ec.com.html4j.util.Constants.STYLE;
import static ec.com.html4j.util.Constants.TITLE;
import static ec.com.html4j.util.Constants.VALIGN;

import ec.com.html4j.util.tag.TableTag;
import ec.com.html4j.validator.util.ConversorUtil;

public class Td extends GenericCell {

	private static final long serialVersionUID = 1154551568555696910L;
	protected int colSpan = 1;
	protected int rowSpan = 1;

	public Td withColSpan(int colSpan) {

		this.colSpan = colSpan;
		return this;
	}

	public Td withRowSpan(int rowSpan) {

		this.rowSpan = rowSpan;
		return this;
	}

	@Override
	public String build() {
		StringBuilder builder = new StringBuilder();
		builder.append("<").append(TableTag.TD_TAG + " ");
		builder.append(ConversorUtil.parseItemToHtmlAttribute(ID, id));
		builder.append(ConversorUtil.parseItemToHtmlAttribute(COLSPAN, this.colSpan));
		builder.append(ConversorUtil.parseItemToHtmlAttribute(ROWSPAN, this.rowSpan));
		builder.append(ConversorUtil.parseItemToHtmlAttribute(CLASS, this.styleClass));
		builder.append(ConversorUtil.parseItemToHtmlAttribute(STYLE, this.styles));
		builder.append(ConversorUtil.parseItemToHtmlAttribute(DIR, this.dir));
		builder.append(ConversorUtil.parseItemToHtmlAttribute(LANG, this.lang));
		builder.append(ConversorUtil.parseItemToHtmlAttribute(TITLE, this.title));
		builder.append(ConversorUtil.parseItemToHtmlAttribute(VALIGN, this.valign));
		builder.append(ConversorUtil.parseItemToHtmlAttribute(ALIGN, this.align));
		builder.append(">").append(value).append("</").append(TableTag.TD_TAG).append(">");
		return builder.toString();
	}

}

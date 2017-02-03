package ec.come.html4j.component.table.elements;

import static ec.com.html4j.util.Constants.ALIGN;
import static ec.com.html4j.util.Constants.CLASS;
import static ec.com.html4j.util.Constants.DIR;
import static ec.com.html4j.util.Constants.ID;
import static ec.com.html4j.util.Constants.LANG;
import static ec.com.html4j.util.Constants.STYLE;
import static ec.com.html4j.util.Constants.TITLE;
import static ec.com.html4j.util.Constants.VALIGN;

import ec.com.html4j.generic.HTMLComponent;
import ec.com.html4j.util.tag.TableTag;
import ec.com.html4j.validator.util.ConversorUtil;

public class TFoot extends GenericTable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 359621340663801115L;

	@Override
	public String build() {
		StringBuilder builder = new StringBuilder();
		builder.append("<").append(TableTag.TFOOT_TAG + " ");
		builder.append(ConversorUtil.parseItemToHtmlAttribute(ID, this.id));
		builder.append(ConversorUtil.parseItemToHtmlAttribute(CLASS, this.styleClass));
		builder.append(ConversorUtil.parseItemToHtmlAttribute(STYLE, this.styles));
		builder.append(ConversorUtil.parseItemToHtmlAttribute(DIR, this.dir));
		builder.append(ConversorUtil.parseItemToHtmlAttribute(LANG, this.lang));
		builder.append(ConversorUtil.parseItemToHtmlAttribute(TITLE, this.title));
		builder.append(ConversorUtil.parseItemToHtmlAttribute(VALIGN, this.valign));
		builder.append(ConversorUtil.parseItemToHtmlAttribute(ALIGN, this.align));
		builder.append(">");
		for (HTMLComponent td : getRows())
			builder.append(td.build());
		builder.append("</").append(TableTag.TFOOT_TAG).append(">");
		return builder.toString();
	}
}

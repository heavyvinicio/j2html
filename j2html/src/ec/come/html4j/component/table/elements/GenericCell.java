package ec.come.html4j.component.table.elements;

import ec.com.html4j.generic.HTMLAttribute;
import ec.com.html4j.generic.HTMLComponent;
import ec.com.html4j.generic.HTMLTableElementAttribute;

public abstract class GenericCell implements HTMLTableElementAttribute {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6218592824286339342L;
	protected String[] styleClass;
	protected String[] styles;
	protected String value;

	protected String id;
	protected String title;
	protected String lang;
	protected String dir;
	protected String align;
	protected String valign;

	@Override
	public HTMLAttribute withStyleClass(String... styleClass) {

		this.styleClass = styleClass;
		return this;
	}

	@Override
	public HTMLAttribute withStyle(String... styles) {

		this.styles = styles;
		return this;
	}

	@Override
	public HTMLComponent withValue(String value) {
		this.value = value;
		return this;
	}

	@Override
	public String build() {
		return "";
	}

	public static void main(String[] args) {
		HTMLComponent columna = new Th().withColSpan(2).withRowSpan(2).withStyle("width:100px;")
				.withStyleClass("clase1", "clase2", "clas23").withValue("hola mundo");
		HTMLComponent columna2 = new Th().withColSpan(2).withRowSpan(2).withStyle("width:100px;")
				.withStyleClass("clase1", "clase2", "clas23").withValue("hola mundo");
		HTMLComponent columna3 = new Td().withColSpan(2).withRowSpan(2).withStyle("width:100px;")
				.withStyleClass("clase1", "clase2", "clas23").withValue("hola mundo");
		HTMLComponent columna4 = new Td().withColSpan(2).withRowSpan(2).withStyle("width:100px;")
				.withStyleClass("clase1", "clase2", "clas23").withValue("hola mundo");

		HTMLComponent row1 = new Tr().addColumns(columna, columna2).withAlign("left").withValign("middle");
		HTMLComponent thead = new THead().addRow(row1);

		HTMLComponent row2 = new Tr().addColumns(columna3, columna4).withAlign("left").withValign("middle");

		HTMLComponent row3 = new Tr().addColumns(columna, columna2, columna3, columna4).withAlign("left")
				.withValign("middle");
		HTMLComponent row4 = new Tr().addColumns(columna, columna2, columna3, columna4).withAlign("left")
				.withValign("middle");
		HTMLComponent tbody = new TBody().addRows(row2, row3, row4);
		HTMLComponent row5 = new Tr().addColumns(columna, columna2).withAlign("left").withValign("middle");
		HTMLComponent tfoot = new TFoot().addRow(row5);

		System.out.println(new Table().addRows(thead, tbody, tfoot).build());

	}

	@Override
	public HTMLAttribute withId(String id) {
		this.id = id;
		return this;
	}

	@Override
	public HTMLAttribute withTitle(String title) {
		this.title = title;
		return this;
	}

	@Override
	public HTMLAttribute withLang(String lang) {
		this.lang = lang;
		return this;
	}

	@Override
	public HTMLAttribute withDir(String dir) {
		this.dir = dir;
		return this;
	}

	@Override
	public HTMLTableElementAttribute withAlign(String align) {
		this.align = align;
		return this;
	}

	@Override
	public HTMLTableElementAttribute withValign(String valign) {
		this.valign = valign;
		return this;
	}
}

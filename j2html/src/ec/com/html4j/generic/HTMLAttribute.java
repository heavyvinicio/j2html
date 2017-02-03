package ec.com.html4j.generic;

public interface HTMLAttribute extends HTMLComponent {
	HTMLAttribute withStyleClass(final String... styleClass);

	HTMLAttribute withStyle(final String... styles);

	HTMLAttribute withId(final String id);

	HTMLAttribute withTitle(final String title);

	HTMLAttribute withLang(final String lang);

	HTMLAttribute withDir(final String dir);

}

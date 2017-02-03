package ec.com.html4j.generic;

import java.io.Serializable;

public interface HTMLComponent extends Serializable {
	HTMLComponent withValue(final String value);

	String build();
}

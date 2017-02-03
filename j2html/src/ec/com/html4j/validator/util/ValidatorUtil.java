package ec.com.html4j.validator.util;

import java.io.Serializable;

public final class ValidatorUtil implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6692615917258489889L;

	private ValidatorUtil() {
		super();
	}

	public static final boolean isArrayEmptyOrNull(String... obj) {
		return obj == null || obj.length <= 0;
	}
	public static final boolean isStringEmptyOrNull(String obj) {
		return obj == null || obj.trim().isEmpty();
	}
}

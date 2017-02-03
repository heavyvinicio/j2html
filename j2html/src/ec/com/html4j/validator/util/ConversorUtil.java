package ec.com.html4j.validator.util;

import java.util.Arrays;

public final class ConversorUtil {

	private ConversorUtil() {
		super();
	}

	public static String getArrayToString(final String... obj) {
		return Arrays.asList(obj).stream().reduce((t, u) -> t + "," + u).get();

	}

	public static String parseItemToHtmlAttribute(final String attribute, final String value) {
		if (!ValidatorUtil.isStringEmptyOrNull(value))
			return attribute + "=\"" + value + "\" ";
		return "";
	}

	public static String parseItemToHtmlAttribute(final String attribute, final String... values) {
		if (!ValidatorUtil.isArrayEmptyOrNull(values))
			return attribute + "=\"" + getArrayToString(values) + "\" ";
		return "";
	}

	public static String parseItemToHtmlAttribute(final String attribute, final int value) {

		if ((attribute.equals("colspan") || attribute.equals("rowspan")) && value > 0)
			return attribute + "=\"" + String.valueOf(value) + "\" ";
		return "";
	}
}

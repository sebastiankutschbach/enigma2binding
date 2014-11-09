package org.openhab.binding.enigma2.internal.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class XmlUtils {

	private static final Logger logger = LoggerFactory
			.getLogger(XmlUtils.class);

	private XmlUtils() {
		// hide constructor
	}

	public static String getContentOfElement(String content, String element) {

		final String beginTag = "<" + element + ">";
		final String endTag = "</" + element + ">";

		final int startIndex = content.indexOf(beginTag) + beginTag.length();
		final int endIndex = content.indexOf(endTag);

		return content.substring(startIndex, endIndex);
	}
}

package org.openbakery.util

/**
 * Created by rene on 14.09.16.
 */
class StringHelper {

	static String removeBrackets(String text) {
		String result = text.trim()
		if (result.length() > 0 && result.charAt(0) == '(') {
			result = result.drop(1)
		}
		if (result.length() > 0 && result.charAt(result.length()-1) == ')') {
			result = result[0..-2]
		}
		return result
	}


}

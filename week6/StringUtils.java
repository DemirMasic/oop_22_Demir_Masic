package week6;

public class StringUtils {
	public static boolean included(String word, String searched) {
		word = word.trim();
		word = word.toUpperCase();
		searched = searched.trim();
		searched = searched.toUpperCase();
		if (word.contains(searched)) {
			return true;
		}else {
			return false;
		}
	}
}

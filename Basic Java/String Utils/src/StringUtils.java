public class StringUtils {
    public static void main(String[] args) {

        String originalString = "abc ABC AAA BBb CcC   ";
        String lower = originalString.toLowerCase();
        String upper = originalString.toUpperCase();
        String trimmed  = originalString.trim();

        // Substrings cuts the string from x to y (not inclusive) and returns it
        String subs1 = originalString.substring(0,1);
        String subs2 = originalString.substring(1); // Has no end index, so it will pick from index 1 until the end

        // Replaces a char in the string to the other char parameter
        String replaced = originalString.replace('A', '|');
        // Or replaces a substring in the original string
        String replacedSubs = originalString.replace("ABC", "GOKU SSJ");


        System.out.println(replacedSubs);
    }
}

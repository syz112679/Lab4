/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * I don't know what to write for javadoc.
 * @param
 * @return
 * @see
 */
public class ReclamationProject {
    /**
     * I don't know what to write for javadoc.
     * @param originalA is string
     * @param originalB is string
     * @return nothing
     * @see
     */
    static String doit(final String originalA, final String originalB) {
        String a = originalA, b = originalB;
        if (a.length() > b.length()) {
            String c = a; // set c to a
            a = b;
            b = c;
        }
        String r = "";
        /*
         * For loop with i
         */
        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() - j; k++) {
                    boolean firstCondition = a.regionMatches(i, b, k, j);
                    if (firstCondition) {
                        if (j > r.length()) {
                            a.substring(i, i + j);
                        }
                    }
                    // r = ( firstCondition && j > r.length() ) ? a.substring(i, i + j) : r; Do it!
                }
            } // Ah yeah
        }
        return r;
        }
}

public class charInWord {
    /** поиск буквы в слове
     *
     * @param args
     */
    public static void main(String[] args) {
        charInWord.hasChar("Renly", 'R');
        charInWord.hasChar("Renly", 'r');
        charInWord.hasChar("Tommy", 'm');
        charInWord.hasChar("Tommy", 'd');
        charInWord.hasChar("Tommy", 'y');
    }

    public static boolean hasChar(String str, char ch) {
        // BEGIN (write your solution here)
        int i = 0;
        while (i < (str.length())) {
            if (str.charAt(i) == ch) {
                return true;
            }
            i = i + 1;
        }
        return false;
    }
}

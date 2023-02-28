public class EncryptWord {
    public static void main(String[] args) {
        EncryptWord.encrypt("attack");
        EncryptWord.encrypt("go!");
    }

    public static String encrypt(String str) {
        // BEGIN
        var result = "";
        for (var i = 0; i < str.length(); i += 2) {
            var nextSymbol = (i + 2 > str.length()) ? "" : str.charAt(i + 1);
            result = result + nextSymbol + str.charAt(i);
        }

        return result;
        // END
    }
}
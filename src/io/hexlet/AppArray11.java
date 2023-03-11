package io.hexlet;
//import org.apache.commons.lang3.ArrayUtils;
//после импорта можно все раскоментировать
public class AppArray11 {
    public static void main(String[] args) {
        var text1 = "When you play the game of thrones, you win or you die";
        String[] stopWords1 = {"die", "play"};
        var result1 = AppArray11.makeCensored(text1, stopWords1);
        System.out.println(result1);
// => "When you $#%! the game of thrones, you win or you $#%!"

        var text2 = "chicken chicken? chicken! chicken";
        String[] stopWords2 = {"?", "chicken"};
        var result2 = AppArray11.makeCensored(text2, stopWords2);
        System.out.println(result2);
// => "$#%! chicken? chicken! $#%!"
    }

        // BEGIN
        public static String makeCensored(String text, String[] stopWords) {
            var words = text.split(" ");

            var wordsCount = words.length;
            var censoredWords = new String[wordsCount];

            for (var i = 0; i < wordsCount; i++) {
                var word = words[i];
//                var newWord = ArrayUtils.contains(stopWords, word) ? "$#%!" : word;
//                censoredWords[i] = newWord;
            }

            return String.join(" ", censoredWords);
        }
        // END
    }

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    private static String trasform(String word) {
        if (word.equals("coverage")) {
            return "covfefe";
        }
        return word;
    }
    
    public static String covfefe(String tweet) {
        String[] words = tweet.split(" ");
        if(tweet.contains("coverage")){
            return Arrays.asList(words).stream().map(n -> trasform(n)).collect(Collectors.joining(" "));
        }
        return tweet + " covfefe";
    }
}



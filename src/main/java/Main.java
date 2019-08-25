import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static String covfefe(String tweet) {

        String[] words = tweet.split("");
        Arrays.asList(words).forEach(n -> {
            if (n.equals("coverage")) {
                n = "covfefe";
            }
        });
        return Arrays.stream(words).collect(Collectors.joining(" "));
    }

}




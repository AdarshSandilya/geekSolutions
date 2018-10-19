//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
//import java.util.stream.Collector;
import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import static java.util.stream.Collectors.joining;
public class StringProblems {
    public static int findLengthOfShortestWord(String words) {
        Optional<String> shortestWord = Arrays.stream(words.split("\\s+"))
                .reduce((firstWord, sencondWord) -> firstWord.length() < sencondWord.length() ? firstWord : sencondWord);
        return shortestWord.get().length();
    }

    static String accum(String givenString) {
        List<String> list = Arrays.asList(givenString.split(""));
        return list.stream()
                .map((ele) -> new String(new char[givenString.indexOf(ele) + 1]).replace("\0", ele).substring(0, 1).toUpperCase())
                .collect(Collectors.joining("-"));

//        list.stream().map((ele) -> Stream.generate(() -> ele).limit(givenString.indexOf(ele))).collect(Collectors.joining("-"));
//        return "sss";
//        return stringStream.toString();
    }

    public static String order(String words) {
        return Arrays.stream(words.split("\\s+"))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                .collect(Collectors.joining((" ")));
    }
}

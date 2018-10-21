import java.util.*;
import java.util.stream.Collectors;

class StringProblems {
    static int findLengthOfShortestWord(String words) {
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

    static String order(String words) {
        return Arrays.stream(words.split("\\s+"))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                .collect(Collectors.joining((" ")));
    }


    /*
    Take every 2nd (even position) char from the string,
    then the other chars, that are not every 2nd char, and concat them as new String
    where n is number of times to do this
    */

    static String encrypt(final String givenText, final int frequency) {
        List<String> splitText = new LinkedList<>(Arrays.asList(givenText.split("")));
        ArrayList<String> filteredElements = new ArrayList<>();

        if (frequency > 0) {
            for (int j = 1; j < splitText.size();) {
                filteredElements.add(splitText.get(j));
                splitText.remove(j);
                j++;
            }
            filteredElements.addAll(splitText);
            String newText = String.join("", filteredElements);
            return encrypt(newText, frequency-1);
        }
        return givenText;
    }
}

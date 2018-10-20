import java.util.*;
import java.util.stream.IntStream;

class NumberProblems {

    static int oddCount(int number) {
        return number / 2;
    }


    // assuming there will be only one integer with odd occurrence
    
    static int findIntOfOddOccurrence(int[] integers) {
        Map<Integer, Integer> map = new HashMap<>();

        Arrays.stream(integers)
                .boxed()
                .forEach(number -> {
                    if (map.containsKey(number)) {
                        Integer value = map.get(number);
                        map.put(number, ++value);
                    }
                    map.putIfAbsent(number, 1);
                });

        return map.entrySet()
                .stream()
                .filter(key -> key.getValue() % 2 != 0).map(Map.Entry::getKey)
                .findFirst()
                .orElse(0);
    }

    static int ConvertBinaryArrayToInt(List<Integer> binary) {
        Collections.reverse(binary);
        return (int) IntStream.range(0, binary.size())
                .filter(e -> binary.get(e) != 0)
                .mapToDouble(i -> Math.pow(2, i))
                .sum();
    }
}

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class NumberProblemsTest {
    @Test
    public void it_should_count_all_odd_numbers(){
        assertEquals(2, NumberProblems.oddCount(5));
    }

    @Test
    public void should_find_the_number_of_odd_occurrence_in_given_array() {
        assertEquals(5, NumberProblems.findIntOfOddOccurrence(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        assertEquals(5, NumberProblems.findIntOfOddOccurrence(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        assertEquals(10, NumberProblems.findIntOfOddOccurrence(new int[]{10}));
        assertEquals(10, NumberProblems.findIntOfOddOccurrence(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        assertEquals(1, NumberProblems.findIntOfOddOccurrence(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }

    @Test
    public void should_return_number_representation_of_given_binary() throws Exception {

        assertEquals(1, NumberProblems.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
        assertEquals(15, NumberProblems.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
        assertEquals(6, NumberProblems.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0))));
        assertEquals(9, NumberProblems.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1))));
    }
}

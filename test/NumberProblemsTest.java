import org.junit.Test;

import static org.junit.Assert.*;

public class NumberProblemsTest {
    @Test
    public void it_should_count_all_odd_numbers(){
        assertEquals(2, NumberProblems.oddCount(5));
    }

}

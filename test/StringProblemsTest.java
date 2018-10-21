import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class StringProblemsTest {

    //    length of shortest word -----
    @Test
    public void should_return_the_length_of_shortest_word_in_given_words() {
        assertEquals(3, StringProblems.findLengthOfShortestWord("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(1, StringProblems.findLengthOfShortestWord("turns o random test cases are easier than writing out basic ones"));
    }


//    @Test
//    public void test() {
//        assertEquals(StringProblems.accum("ZpglnRxqenU"), "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu");
////        assertEquals(StringProblems.accum("NyffsGeyylB"), "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb");
//}

    //    ordering a string -------
    @Test
    public void should_arrange_string_in_order_baseed_on_the_number_present_in_the_word() {
        assertThat(StringProblems.order("is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"));
        assertThat(StringProblems.order("4of Fo1r       pe6ople g3ood th5e the2"), equalTo("Fo1r the2 g3ood 4of th5e pe6ople"));
    }

    @Test
    public void empty_string_should_return_empty_string() {
        assertThat("Empty input should return empty string", StringProblems.order(""), equalTo(""));
    }

    @Test
    public void should_return_encrypted_string() {
        assertEquals("This is a test!", StringProblems.encrypt("This is a test!", 0));
        assertEquals("hsi  etTi sats!", StringProblems.encrypt("This is a test!", 1));
        assertEquals("s eT ashi tist!", StringProblems.encrypt("This is a test!", 2));
        assertEquals(" Tah itse sits!", StringProblems.encrypt("This is a test!", 3));
        assertEquals("This is a test!", StringProblems.encrypt("This is a test!", 4));
        assertEquals("This is a test!", StringProblems.encrypt("This is a test!", -1));
        assertEquals("hskt svr neetn!Ti aai eyitrsig", StringProblems.encrypt("This kata is very interesting!", 1));
    }
}

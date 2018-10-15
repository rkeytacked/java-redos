package de.creativecouple.talks;

import com.google.re2j.Pattern;
import org.junit.Test;

public class PatternTest {

    @Test
    public void testCpuBurningPatternMatching() {
        "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                .matches("a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void testLinearPatternMatching() throws Exception {
        Pattern.compile("a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?a?aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                .matches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }
}

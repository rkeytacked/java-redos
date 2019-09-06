package de.creativecouple.talks;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PatternTest {

    @Test
    public void testCpuBurningPatternMatching() {
        assertTrue("bedcoooooooooooooooooooooooooooooon"
                .matches("bedco?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?oooooooooooooooooooooooooooooon"));
    }

    @Test
    public void testLinearPatternMatching() throws Exception {
        assertTrue(com.google.re2j.Pattern
                .compile("bedco?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?o?oooooooooooooooooooooooooooooon")
                .matches("bedcoooooooooooooooooooooooooooooon"));
    }
}

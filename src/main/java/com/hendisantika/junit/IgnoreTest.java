package com.hendisantika.junit;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by hendisantika on 3/21/17.
 */
public class IgnoreTest {
    @Test
    public void testMath1() {
        assertThat(1 + 1, is(2));
    }

    @Ignore
    @Test
    public void testMath2() {
        assertThat(1 + 2, is(5));
    }

    @Ignore("some one please create a test for Math3!")
    @Test
    public void testMath3() {
        //...
    }
}

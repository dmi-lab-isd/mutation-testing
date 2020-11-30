package org.labisd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestBoundExample {

    BoundExample b;

    @Before
    public void setUp() {
        b = new BoundExample();
    }
    
    @Test
    public void shouldReturnFooWhenGiven1() {
        assertEquals("foo", b.foo(1));
    }

    @Test
    public void shouldReturnBarWhenGivenMinus1() {
        assertEquals("bar", b.foo(-1));
    }

    @Test
    public void shouldReturnFooWhenGiven0() {
        assertEquals("foo", b.foo(0));
    }

}

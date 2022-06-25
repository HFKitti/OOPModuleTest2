package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTaskTest {


    @Test
    public void countDivisors_test1() {
        int result1 = TestTask.countDivisors(1);
        assertEquals(1, result1);
    }

    @Test
    public void countDivisors_test2() {
        int result2 = TestTask.countDivisors(2);
        assertEquals(2, result2);
    }
    @Test
    public void countDivisors_test3() {
        int result3 = TestTask.countDivisors(10);
        assertEquals(4, result3);
    }
    @Test
    public void countDivisors_test4() {
        int result4 = TestTask.countDivisors(11);
        assertEquals(2, result4);
    }
    @Test
    public void countDivisors_test5() {
        int result5 = TestTask.countDivisors(16);
        assertEquals(5, result5);
    }
    @Test
    public void countDivisors_test6() {
        int result6 = TestTask.countDivisors(25);
        assertEquals(3, result6);
    }
    @Test
    public void countDivisors_test7() {
        int result7 = TestTask.countDivisors(30);
        assertEquals(8, result7);
    }


    }


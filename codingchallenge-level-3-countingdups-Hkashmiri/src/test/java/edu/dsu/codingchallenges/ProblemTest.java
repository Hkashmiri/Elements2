package edu.dsu.codingchallenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void countDuplicatesTest01(){
        Problem problem = new Problem();
        String data = "abcdefga";
        int expected = 1;
        int actual = problem.countDuplicates(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countDuplicatesTest02(){
        Problem problem = new Problem();
        String data = "aabbc";
        int expected = 2;
        int actual = problem.countDuplicates(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countDuplicatesTest03(){
        Problem problem = new Problem();
        String data = "xyzxyzxyz";
        int expected = 3;
        int actual = problem.countDuplicates(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countDuplicatesTest04(){
        Problem problem = new Problem();
        String data = "aaaa";
        int expected = 1;
        int actual = problem.countDuplicates(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countDuplicatesTest05(){
        Problem problem = new Problem();
        String data = "abcdef";
        int expected = 0;
        int actual = problem.countDuplicates(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countDuplicatesTest06(){
        Problem problem = new Problem();
        String data = "aabbccddeeff";
        int expected = 6;
        int actual = problem.countDuplicates(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countDuplicatesTest07(){
        Problem problem = new Problem();
        String data = "abcdabcdabcd";
        int expected = 4;
        int actual = problem.countDuplicates(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countDuplicatesTest08(){
        Problem problem = new Problem();
        String data = "";
        int expected = 0;
        int actual = problem.countDuplicates(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countDuplicatesTest09(){
        Problem problem = new Problem();
        String data = "123123";
        int expected = 3;
        int actual = problem.countDuplicates(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countDuplicatesTest10(){
        Problem problem = new Problem();
        String data = "abac";
        int expected = 1;
        int actual = problem.countDuplicates(data);
        Assertions.assertEquals(expected, actual);
    }
}
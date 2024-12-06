package test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import main.StringManipulator;
public class StringManipulatorTest {
    StringManipulator stringManipulator = new StringManipulator();
    @Test
    public void testReverse() {
       // Your code here
       assertEquals("ELPmAxE",stringManipulator.reverse("ExAmPLE"));
    }
    @Test
    public void testIsPalindrome() {
       // Your code here
       assertEquals(true, stringManipulator.isPalindrome("ELpmpLE"));
    }
    @Test
    public void testIsContained() {
       // Your code here
       assertEquals(true,stringManipulator.isContained("ExAmPLE", "Ex"));
    }
    @Test
    public void testNumberRemoved() {
       // Your code here
       assertEquals("ExAmPLE", stringManipulator.numberRemoved("ExAm1PLE2"));
    }
    @Test
    public void testUpperString() {
       // Your code here
       assertEquals("EXAMPLE", stringManipulator.upperString("ExAmPLE"));
    }
    @Test
    public void testLowerString() {
       // Your code here
       assertEquals("example", stringManipulator.lowerString("ExAmPLE"));
    }
    
    @Test
    public void testCapitalString() {
       // Your code here
       assertEquals("Example String", stringManipulator.capitalString("example string"));
    }
    @Test
    public void testCountVowels() {
       // Your code here
       assertEquals(3, stringManipulator.countVowels("Example"));
    }
    @Test
    public void testCountWords() {
       // Your code here
       assertEquals(4, stringManipulator.countWords("Hello, how are you?"));
    }
    @Test
    public void testFindSubstringIndex() {
       // Your code here
       assertEquals(5,stringManipulator.findSubstringIndex("Java programming","programming"));
    }
    @Test
    public void testReverseWords() {
       // Your code here
       assertEquals("You Are How World Hello", stringManipulator.reverseWords("Hello World How Are You"));
    }    
}


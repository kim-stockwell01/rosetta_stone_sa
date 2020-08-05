package test;

import main.RosettaStoneSA;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RosettaStoneSATest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getUniqueChar_NullInput() {
        Character firstUniqueChar = RosettaStoneSA.getFirstUniqueCharacter( null );
        assertEquals( firstUniqueChar, null );
    }

    @Test
    void getUniqueChar_WordNull() {
        Character firstUniqueChar = RosettaStoneSA.getFirstUniqueCharacter( "null" );
        assertEquals( firstUniqueChar, 'n' );
    }

    @Test
    void getUniqueChar_EmptyInput() {
        Character firstUniqueChar = RosettaStoneSA.getFirstUniqueCharacter( "" );
        assertEquals( firstUniqueChar, null );
    }

    @Test
    void getUniqueChar_TestWhitespace() {
        Character firstUniqueChar = RosettaStoneSA.getFirstUniqueCharacter( " " );
        assertEquals( firstUniqueChar, ' ' );
    }

    @Test
    void getUniqueChar_NonStandardChar() {
        Character firstUniqueChar = RosettaStoneSA.getFirstUniqueCharacter( ")(*%!Q)(*" );
        assertEquals( firstUniqueChar, '%' );
    }

    @Test
    void getUniqueChar_TestLowerVsUpperCase() {
        Character firstUniqueChar = RosettaStoneSA.getFirstUniqueCharacter( "aaaAbbbb" );
        assertEquals( firstUniqueChar, 'A' );
    }

    //    Given "ABC", your function will return "A"
    @Test
    void getUniqueChar_ProvidedTestStr1() {
        Character firstUniqueChar = RosettaStoneSA.getFirstUniqueCharacter( "ABC" );
        assertEquals( firstUniqueChar, 'A' );
    }

//    Given "ABAC", your function will return "B"
    @Test
    void getUniqueChar_ProvidedTestStr2() {
        Character firstUniqueChar = RosettaStoneSA.getFirstUniqueCharacter( "ABAC" );
        assertEquals( firstUniqueChar, 'B' );
    }

 // Given "AABBC", your function will return "C"
    @Test
    void getUniqueChar_ProvidedTestStr3() {
        Character firstUniqueChar = RosettaStoneSA.getFirstUniqueCharacter( "AABBC" );
        assertEquals( firstUniqueChar, 'C' );
    }

    //   Given "AABBCC", your function will return "" or Null, whatever best fits your language of choice.
    @Test
    void getUniqueChar_ProvidedTestStr4() {
        Character firstUniqueChar = RosettaStoneSA.getFirstUniqueCharacter( "AABBCC" );
        assertEquals( firstUniqueChar, null );
    }

}
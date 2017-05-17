package HoldingObjectsTests;

import HoldingObjects.NewTHing;
import HoldingObjects.PhoneBook;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by vilenalivinsky on 5/16/17.
 */
public class PhoneBookTests {

        PhoneBook phoneBook;
        @Before
        public void setUp(){
            this.phoneBook = new PhoneBook();

        }
        @Test
        public void addEntryToPhoneBookTest(){

            //given

            //when
            boolean actual = this.phoneBook.addEntryToEntries("Eugene", "267-918-8722");
            boolean expected = true;

            //then

            assertEquals(actual,expected);
        }
        @Test
        public void printAllName(){

                this.phoneBook.addEntryToEntries("Eugene", "267-918-8722");

                String expected = null;
                    String actual = this.phoneBook.printAllEntires();
                    assertEquals(actual, expected);
            }



//    @Test
//    public void testLookup() {
//
//            //Given
//            PhoneBook entry = new PhoneBook("John Doe", "(001) 666-44-333");
//            String expected = "(001) 666-44-333";
//
//            //When
//            String actual = entry.lookup("John Doe");
//
//            //Then
//            assertEquals(expected, actual);
//
//    }



}



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach; 
 
public class ContactTest { 
  Contact ada ,grace, alan;
  
  @BeforeEach
  public void setup() { 
    ada = new Contact("Ada Lovelace", "+1 617 555 0101");
    grace = new Contact("Grace Hopper", "555-0000");
    alan = new Contact("Alan Turing", "555-0001");
  }

 
  @Test 
  void constructor_setsNameCorrectly() { 
    assertEquals("Ada Lovelace", ada.getName()); 
  } 
 
  @Test
  void constructor_setsPhoneCorrectly() { 
    assertEquals("+1 617 555 0101", ada.getPhone()); 
  } 
 
  @Test
  void getName_returnsExactString_notTransformed() { 
    assertEquals("Grace Hopper", grace.getName());
  } 
 
  @Test
  void toString_containsName() { 
    assertTrue(alan.toString().contains("Alan Turing"));
  } 
 
  @Test
  void toString_containsPhone() {
    assertTrue(alan.toString().contains("555-0001"));
  }

  @Test
  void noChangeExpected_whenIndependentObjectChanges() {
    Contact contact1 = new Contact("Bahram sh", "555-1234");
    Contact contact2 = new Contact("Bahram Sh", "555-5678");

    // Change the phone number of contact1
    contact1.setPhone("555-9999");

    // Ensure that contact2's phone number remains unchanged
    assertEquals("555-5678", contact2.getPhone());
  }

} 
import java.util.*;

public class ContactManager {

    public static void main(String[] args) {

        HashMap<String, Contact> contacts = new HashMap<>();
        Contact contact1 = new Contact("Michael Jordan", "416 587 2222");
        contacts.put(contact1.getName(), contact1);
        Contact contact2 = new Contact("Brock Obama", "416 587 22 24");
        contacts.put(contact2.getName(), contact2);
        Contact contact3 = new Contact("Donald J Trump", "416 587 2324");
        contacts.put(contact3.getName(), contact3);
        Contact contact4 = new Contact("Bahram Sheibani","416 587 2256");
        contacts.put(contact4.getName(), contact4);
        Contact contact5 = new Contact("Linda G", "416 587 2278");
        contacts.put(contact5.getName(), contact5);
        lookup(contacts, "Linda G");
        lookup(contacts, "anyone");
        ArrayList<Contact> sorted = new ArrayList<>(contacts.values());
        sorted.sort((a,b) -> a.getName().compareTo(b.getName()));
        System.out.println("=== All Contacts === ");
        sorted.forEach(contact -> {
            System.out.println(contact);
        });
    }

    public static void lookup(HashMap<String,Contact> contacts,String name){
      Contact found = contacts.get(name);
        if(found== null){
            System.out.println("Contact not found!");

        } else {
            System.out.println(found);
        }

    }
}
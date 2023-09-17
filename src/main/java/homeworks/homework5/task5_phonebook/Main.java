package homeworks.homework5.task5_phonebook;

import java.util.List;

public class Main {


    public static void main(String[] args) {

        PhoneBook phonebook = new PhoneBook();

        phonebook.add(new Record("Alex", "937-99-92"));
        phonebook.add(new Record("Alex", "111-22-33"));
        phonebook.add(new Record("Boris", "444-55-66"));
        phonebook.add(new Record("Igor", "777-88-99"));
        phonebook.add(new Record("Sergiy", "100-11-12"));
        phonebook.add(new Record("Shon", "200-12-13"));
        phonebook.add(new Record("John", "300-14-15"));
        phonebook.add(new Record("Mary", "400-16-17"));


        String searchName = "alex";
        System.out.println("search \" " + searchName + "\"");
        Record found = phonebook.find(searchName);
        System.out.println("first equals: " + found);
        System.out.println();


        System.out.println("search \" " + searchName + "\"");
        List<Record> foundAll = phonebook.findAll(searchName);
        for (Record record : foundAll) {
            System.out.println("all equals: " + record);
        }
    }
}

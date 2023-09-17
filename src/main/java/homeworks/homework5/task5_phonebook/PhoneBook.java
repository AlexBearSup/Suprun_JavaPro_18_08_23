package homeworks.homework5.task5_phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
        List<Record> users = new ArrayList<>();
        public void add (Record user){
            users.add(user);
        }
        public Record find (String name){

            for (Record record : users) {
                if (record.getName().equalsIgnoreCase(name)){
                    return record;
                }
            }
            return null;
        }
        public List<Record> findAll(String name) {
            List<Record> findRecord = new ArrayList<>();
            for (Record record : users) {
                if (record.getName().equalsIgnoreCase(name)) {
                    findRecord.add(record);
                }
             }
            if (findRecord.isEmpty()){
             return null;
            }
            return findRecord;
        }

}

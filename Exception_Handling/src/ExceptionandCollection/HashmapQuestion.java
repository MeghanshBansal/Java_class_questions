package Question;
//write a question which will accept a key-value pair, this function will check, if that pair is present in Hashmap
//if present return that entry else throw an user defined NoEntryFound Hashmap, this exception will print a message no record found for a given pair
//
//Hashmap contains object of Employee class, and the key Empid for employee
//Employee class contains some fields int empid, String name, double salary, string emailid


import Question.Employee;
import Question.MyException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapQuestion {
    public static Employee validate(int empid, HashMap map) throws MyException {
        Iterator<Map.Entry<Integer, Employee>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Employee> entry = iterator.next();
            if (entry.getKey() == empid) {
                return entry.getValue();
            }
        }
        throw new MyException("NoEntryFound");
    }

    public static void main(String[] args) {
        Map<Integer, Employee> map = new HashMap<Integer, Employee>();
        map.put(123, new Employee(123, "Rohit", 50000, "rohit@gmail.com"));
        map.put(456, new Employee(456, "Krishna", 20000, "krishna@gmail.com"));
        try{
            System.out.println(validate(496, (HashMap) map));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

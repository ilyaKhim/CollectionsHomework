import java.util.*;

public class Phonebook {
    Map<String, Set<String>> ph = new HashMap<>();
    /*String  name;
    String number;
*/
/*
    protected Phonebook() {

    }*/

    protected void add(String name, String number){
        Set<String> phones = ph.get(name);
        if(phones == null){
            phones = new HashSet<>();
            ph.put(name, phones);
        }
        phones.add(number);

    }

    protected Set<String> get(String name){
        System.out.println("Результат поиска по запросу: " + name );
       return ph.get(name);
    }
}



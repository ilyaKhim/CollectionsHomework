import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    Map<String, List<String>> ph = new HashMap<>();
    String  name;
    String number;


    public Phonebook() {
        this.ph = ph;
    }

    public void add(String name, String number){
        List<String>phones = ph.get(name);
        if(phones == null){
            phones = new ArrayList<String>();
            ph.put(name, phones);
        }
        phones.add(number);

    }

    public List<String> get(String name){
        System.out.println("Результат поиска по запросу: " + name );
       return ph.get(name);
    }
}
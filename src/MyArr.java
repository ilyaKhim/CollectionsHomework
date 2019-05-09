import java.util.HashMap;
import java.util.Map;

public class MyArr {

    public static void main(String[] args) {
        String[] fruits = {"Яблоко", "Груша", "Апельсин", "Мандарин",
                "Груша", "Манго", "Яблоко", "Яблоко", "Апельсин"};
        Map<String,Integer> myArr = new HashMap<>();
        for(String o: fruits){
            myArr.put(o, myArr.getOrDefault(o,0)+1);
        }

        System.out.println(myArr);

    }
}

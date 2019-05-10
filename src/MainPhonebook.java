public class MainPhonebook {
    public static void main(String[] args) {
        Phonebook ph = new Phonebook();
        ph.add("Иванов", "55-12-31");
        ph.add("Петров", "111-111");
        ph.add("Кузнецов", "120-131");
        ph.add("Иванов", "976-124");
        ph.add("Петров", "145-431");




        System.out.println(ph.get("Иванов"));
    }

}

import java.util.*;

class Main {
    public static void main(String[] args) {
        HashMap <String, Integer> presenze = new HashMap<>();

        presenze.put("DADI", 10);
        presenze.put("DEYAE", 9);
        presenze.put("CORTESI", 8);

        for (String k : presenze.keySet()) {
            System.out.println(k);
        }

        for (Map.Entry<String, Integer> entry : presenze.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
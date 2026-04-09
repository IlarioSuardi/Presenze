import javax.swing.*;
import java.util.*;

class Main {
    static HashMap<String, Integer> presenze = new HashMap<>();

    public static void main(String[] args) {
        aggiungiStudente("DADI");
        aggiungiStudente("DEYAE");
        aggiungiStudente("CORTESI");
        aggiungiStudente("CORTESI");

        registraPresenze("DADI");
        registraPresenze("DEYAE");
        registraPresenze("CORTESI");
        registraPresenze("ROSSI");
        registraPresenze("DADI");
        registraPresenze("DADI");
        registraPresenze("DEYAE");


        stampaPresenze();


    }

    public static void aggiungiStudente(String nome) {
        if (!presenze.containsKey(nome)) {
            presenze.put(nome, 0);
            System.out.println("Studente aggiunto: " + nome);
        } else {
            System.out.println("Studente " + nome + ": già presente");
        }
    }

    public static void registraPresenze(String nome) {
        if (presenze.containsKey(nome)) {
            int presenzeAttuali = presenze.get(nome);
            presenze.put(nome, presenzeAttuali + 1);
        } else {
            System.out.println("Lo studente " +nome + " non è presente");
        }
    }

    public static void stampaPresenze() {
        System.out.println("\nPRESENZE:");
        for (Map.Entry<String, Integer> entry : presenze.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


}
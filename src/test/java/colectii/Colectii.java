package colectii;

import org.testng.annotations.Test;

import java.security.Key;
import java.sql.SQLOutput;
import java.util.*;

public class Colectii {

    //array, list, set/map

    @Test
    public void metodaTest() {

//        cursantiArray();
//        cursantiList();
//        listaMasini();
//        mapExemple();
//        tariOrase();
        caietRetete();
    }
    public void cursantiArray (){

        String[] cursanti=new String[6];
        cursanti[0]="Mihaela";
        cursanti[1]="Ioana";
        cursanti[2]="Mihai";
        cursanti[3]="Monica";
        cursanti[4]="Andrei";
        cursanti[5]="Maria";

        for (int index=0;index<cursanti.length;index++){
            System.out.println("Numele cursantului este " +cursanti[index]);
        }
    }

    public void cursantiList () {
        List<String> cursanti= new ArrayList<>();
        cursanti.add("Mihaela");
        cursanti.add("Dana");
        cursanti.add("Ioana");

        for (int index=0;index<cursanti.size();index++){
            System.out.println("Numele cursantului este " +cursanti.get(index));
        }
    }

    public void listaMasini () {
        List<String> masini= new ArrayList<>();
        masini.add("Dacia");
        masini.add("Volvo");
        masini.add("BMW");
        masini.add("Skoda");

        for (int index=0;index<masini.size();index++){
            System.out.println("Numele masinii este " +masini.get(index));
        }
    }

    // Maps-cheie=valoare;
    // Parcurgerea se face baza cheilor folosind un set;

    public void mapExemple () {
        Map<String,String> elemente= new HashMap<>();
        elemente.put("Masina","Dacia");
        elemente.put("Persoana","Alex");
        elemente.put("Telefon", "iPhone");

        for (String Key: elemente.keySet()){
            System.out.println("Cheia este "+Key);
            System.out.println("Valoarea este "+elemente.get(Key));
        }
    }

    public void tariOrase () {
        Map<String,List<String>>  obiecte = new HashMap<>();
        List<String> oraseRomania= Arrays.asList("Cluj", "Bucuresti", "Timisoara");
        List<String> oraseItalia= Arrays.asList("Torino", "Verona", "Roma");
        List<String> oraseSpania= Arrays.asList("Madrid", "Barcelona", "Valencia");

        obiecte.put("Romania", oraseRomania);
        obiecte.put("Italia", oraseItalia);
        obiecte.put("Spania", oraseSpania);

        for (String Key: obiecte.keySet()){
            System.out.println("Tara este: "+Key);
            System.out.println("Orasele sunt: "+obiecte.get(Key));
        }
    }

    public void caietRetete () {
        Map<String,List<String>>  ingrediente = new HashMap<>();
        List<String> ingredienteSupaPui= Arrays.asList("pui", "apa", "legume");
        List<String> ingredientePrajitura= Arrays.asList("zahar", "lapte", "fructe", "faina");
        List<String> ingredienteSarmale= Arrays.asList("orez", "varza", "carne tocata");

        ingrediente.put("Supa pui", ingredienteSupaPui);
        ingrediente.put("Prajitura", ingredientePrajitura);
        ingrediente.put("Sarmale", ingredienteSarmale);

        for (String Key: ingrediente.keySet()){
            System.out.println("Reteta este: "+Key);
            System.out.println("Ingredientele sunt: "+ingrediente.get(Key));

        }
    }
}

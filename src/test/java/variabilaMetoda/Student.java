package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    //O clasa este un sablon este un sablon care defineste comportamentul unei entitati din viata reala;
    //Intr-un fisier Java recunoastem o clasa dupa cuvantul cheie "Class";
    //O clasa este obligatoriu sa aiba un nume;
    //O clasa contine variabile si metode;
    //O variabila este proprietatea unei clase;
    //O variabila poate fi de doua feluri: globala si locala;
    //Globala- variabila pe care o declaram la inceputul clasei si este vizibila in tot fisierul;
    //Locala- variabila pe care o declaram in interiorul unei metode si este vizibila doar acolo;
    //O variabila globala trebuie sa contina un access control (public), tip de data si un nume;
    //O variabila nu trebuie sa contina tot timpul o valoare;

    public String nume;
    public String prenume;
    public int varsta;
    public double inaltime;
    public float greutate;
    public String adresa;
    public char sex;
    public boolean areRestante;


    //O metoda este actiunea unei clase;
    //O clasa poate avea mai multe metode care se diferentiaza prin numele lor;
    //Metodele pot fi de doua feluri: void si return;
    //O metoda cu void are ca rol sa execute actiunea si sa o afiseze;
    //O metoda cu void trebuie sa contina access control (public), cuvantul cheie 'void', numele metodei si () si {}
    @Test
    public void prezentareStudent() {
        nume = "Moga";
        prenume = "Mihaela";
        varsta = 32;
        inaltime = 1.55;
        greutate = 47.5f;
        adresa = "Luptei nr.40 Sibiu";
        sex = 'f';
        areRestante = false;

        //select all - CRTL + A;
        //Align code- CRTL + ALT + L;
        //Undo- CTRL + Z;


        // System.out.print(nume+" "+prenume+" "+varsta+" "+inaltime+" "+greutate+" "+adresa+" "+sex+" "+areRestante+" ");

//        System.out.print(prenume+" ");
//        System.out.print(varsta+" ");
//        System.out.print(inaltime+" ");
//        System.out.print(greutate+" ");
//        System.out.print(adresa+" ");
//        System.out.print(sex+" ");
//        System.out.print(areRestante+" ");

        //Concatenarea este lipirea unuia sau a mai multor stringuri si lipirea se face cu + si " ";

        System.out.println("Numele studentului este "+ nume);
        System.out.println("Prenumele studentului este " + prenume);
        System.out.println("Inaltimea studentului este " + inaltime);
        System.out.println("Greutatea studentului este " + greutate);
        System.out.println("Adresa studentului este " + adresa);
        System.out.println("Sexul studentului este " + sex);
        System.out.println("Studentul are restante este " + areRestante);

        // Print inseamna ca afiseaza valoarea si ramane pe randul curent;
        // Println inseamna ca afiseaza valoarea si sare la randul urmator


    }

}
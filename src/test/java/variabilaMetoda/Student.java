package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    //O clasa este un sablon care defineste comportamentul unei entitati din viata reala
    //Intr-un fisier JAVA recunoastem o clasa dupa cuvantul cheie - class -
    //O clasa este obligatorie sa aiba un nume
    //O clasa contine variabila si metode
    //O variabila este proprietatea unei clase
    //O variabila poate fi de 2 feluri :  Globala si Locala
    //Globala - este o variabila care o declaram la inceputul clasei si este vizibila in tot fisierul
    //Locala - este o variabila care o declaram in interiorul unei metode si este vizibila doar acolo
    //O variabila globala trebuie sa contina un - access control(Public), tip de data si un nume.
    //O variabila nu trebuie tot timpul sa contina o valoare.

    public String nume;
    public String prenume;
    public int varsta;
    public double inaltime;
    public Float greutate;
    public String adresa;
    public char sex;
    public boolean areRestante;

    //O metoda este actiunea unei clase
    //O clasa poate avea mai multe metode care se diferenteaza prin numele lor.
    //Metodele pot fi de doua feluri : Void si Return
    //O metoda cu Void are ca rol sa execute actiunea si sa o afiseze
    //O metoda cu Void trebuie sa mentina -access control- (Public) , cuvantul cheie VOID, numele metodei (){}
    @Test

    public void prezentareStudent() {
        nume = "Roteliuc";
        prenume = "Iulian";
        varsta = 48;
        inaltime = 1.90;
        greutate = 95f;
        adresa = "Electronicii nr2";
        sex = 'm';
        areRestante = true;

        //ctrl+alt+L = aranjeaza/aliniaza codul
        //ctrl+a = selecteaza tot codul


//        System.out.print(nume+" "+prenume+" "+varsta+" "+inaltime+" "+greutate+" "+adresa+" "+sex+" "+areRestante+" ");

//        System.out.print(prenume+" ");
//        System.out.print(varsta+" ");
//        System.out.print(inaltime+" ");
//        System.out.print(greutate+" ");
//        System.out.print(adresa+" ");
//        System.out.print(sex+" ");
//        System.out.print(areRestante+" ");

        System.out.println("numele studentului este "+nume);
        System.out.println("prenumele studentului este "+prenume);
        System.out.println("varsta studentului este "+varsta);
        System.out.println("inaltimea studentului este "+inaltime);
        System.out.println("greutatea studentului este "+greutate);
        System.out.println("adresa studentului este "+adresa);
        System.out.println("sexul studentului este "+sex);
        System.out.println("are studentul restante? "+areRestante);

        //print inseamna ca afiseaza valoarea si ramane pe randul curent
        //println inseamna ca afiseaza valoarea si sare la randul urmator

        //Concatenarea este lipirea unui sau mai multor string-uri si lipirea se face cu +" "

    }

}

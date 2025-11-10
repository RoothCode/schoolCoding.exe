package structuriAlternative;

import org.testng.annotations.Test;

public class StructuriAlternative {

    // In programare exista doua tipuri de structuri: alternative si repetitive;
    // Structurile alternative: if...then...else/switch...case;

    @Test

    public void metodaTest() {

//        verificaPersoanaMajora(16);
//        verificaPersoanaMajora(21);

//        verificareNumerPar(25);
//        verificareNumerPar(20);

//          verificareNumar(30);

        zileleSaptamanii(0);


    }

    public void verificaPersoanaMajora(int varsta){
        if (varsta >=18) {
            System.out.println("Persoana cu varsta de "+varsta+" ani este majora.");
        }
        else {
            System.out.println("Persoana cu varsta de "+varsta+" ani este minora.");
        }
    }

    public void verificareNumerPar(int numar){
        if (numar%2==0) {
            System.out.println( numar + "este numar par.");
        }
        else {
            System.out.println( numar + "este numar impar.");
        }
    }

    public void verificareNumar(int numar) {
        if (numar > 0 && numar % 5 == 0) {
            System.out.println(numar + "este pozitiv și divizibil cu 5.");
        }
        else {
            System.out.println(numar + "nu este pozitiv, si/sau divizibil cu 5.");
        }
    }

    // La If compilatorul evalueaza fiecare conditie pas cu pas
    // La switch compilatorul sare la valoarea pe care i-am dat-o ca si parametru

    public void zileleSaptamanii(int zi) {
        switch (zi) {
            case 1:
                System.out.println("Astazi este luni.");
                break;
            case 2:
                System.out.println("Astazi este marti.");
                break;
            case 3:
                System.out.println("Astazi este miercuri.");
                break;
            case 4:
                System.out.println("Astazi este joi.");
                break;
            case 5:
                System.out.println("Astazi este vineri.");
                break;
            case 6:
                System.out.println("Astazi este sambata.");
                break;
            case 7:
                System.out.println("Astazi este duminica.");
                break;
            default:
                System.out.println("Nu mai exista zile.");
        }
    }
}




// Tema: Verificăm dacă un număr este pozitiv și divizibil cu 5.- 2 conditii pozitiv si divizibil cu 5.


//if (errorMessage.equals("Invalid password")) {
//    System.out.println("Test failed: parola este greșită.");
//} else if (errorMessage.equals("User not found")) {
//    System.out.println("Test failed: user inexistent.");
//} else {
//    System.out.println("Test passed: login reușit.");
//}
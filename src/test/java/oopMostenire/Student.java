package oopMostenire;

public class Student extends Persoana {

    public Student(String nume, String prenume, int varsta, String adresa, String facultate, String domeniu, int anul, boolean restante) {
        super(nume, prenume, varsta, adresa);
        this.facultate = facultate;
        this.domeniu = domeniu;
        this.anul = anul;
        this.restante = restante;
    }

    public String facultate;
    public String domeniu;
    public int anul;
    public boolean restante;

    public void infoStudent(){
        System.out.println(" Facultatea la care studiaza este " +facultate);
        System.out.println(" Domeniul in care lucreaza este " +domeniu);
        System.out.println(" In ce an este studentul? " +anul);
        System.out.println(" Are restante? " +restante);

    }
}

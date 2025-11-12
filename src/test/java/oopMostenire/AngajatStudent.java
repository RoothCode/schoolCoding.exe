package oopMostenire;

public class AngajatStudent extends Persoana implements AngajatInterface, StudentInterface {
    private String firma;
    private double salariu;
    private String contract;
    private int zileLibere;

    private String facultate;
    private String domeniu;
    private int anul;
    private boolean restante;

    public AngajatStudent(String nume, String prenume, int varsta, String adresa, String firma, double salariu, String contract, int zileLibere, String facultate, String domeniu, int anul, boolean restante) {
        super(nume, prenume, varsta, adresa);
        this.firma = firma;
        this.salariu = salariu;
        this.contract = contract;
        this.zileLibere = zileLibere;
        this.facultate = facultate;
        this.domeniu = domeniu;
        this.anul = anul;
        this.restante = restante;
    }

    @Override
    public void ajungeLaTimpLaBirou() {

    }

    @Override
    public void munceste() {

    }

    @Override
    public void respectaRegulamentulIntern() {

    }

    @Override
    public void mergeLaCursuri() {

    }

    @Override
    public void trebuieSaStudieze() {

    }

    @Override
    public void saNuAibaRestante() {

    }
}

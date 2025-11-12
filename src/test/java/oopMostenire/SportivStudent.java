package oopMostenire;

public class SportivStudent extends Persoana implements SportivInterface, StudentInterface {
    private String sport;
    private boolean sportEchipa;
    private int experienta;

    private String facultate;
    private String domeniu;
    private int anul;
    private boolean restante;

    public SportivStudent(String nume, String prenume, int varsta, String adresa, boolean sportEchipa, String sport, int experienta, String facultate, String domeniu, int anul, boolean restante) {
        super(nume, prenume, varsta, adresa);
        this.sportEchipa = sportEchipa;
        this.sport = sport;
        this.experienta = experienta;
        this.facultate = facultate;
        this.domeniu = domeniu;
        this.anul = anul;
        this.restante = restante;
    }

    @Override
    public void mergeLaAntrenamente() {

    }

    @Override
    public void participaLaCompetitii() {

    }

    @Override
    public void respectaRegimAlimentar() {

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

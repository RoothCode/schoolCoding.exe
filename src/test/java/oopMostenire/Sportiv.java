package oopMostenire;

import java.sql.SQLOutput;

public class Sportiv extends Persoana implements SportivInterface {

    private String sport;
    private boolean sportEchipa;
    private int experienta;

    public Sportiv(String nume, String prenume, int varsta, String adresa, String sport, boolean sportEchipa, int experienta) {
        super(nume, prenume, varsta, adresa);
        this.sport = sport;
        this.sportEchipa = sportEchipa;
        this.experienta = experienta;
    }


    public void infoSportiv(){
        infoPersoana();
        System.out.println("Sportul este " +sport);
        System.out.println("Sportivul face parte dintr-o echipa " +sportEchipa);
        System.out.println("Experienta sportivului este de " +experienta);
    }

    public void mananca(){
        System.out.println(" Sportivul mananca intre antrenamente ");
    }
    public void cautaSportivi(){
        System.out.println(" Afisez toti sportivii inregistrati ");
    }
    public void cautaSportivi(String sport){
        System.out.println(" Afisez sportivii care practica sportul " +sport);
    }
    public void cautaSportivi(String sport ,int experienta){
        System.out.println(" Afisez sportivii cu" +experienta+" an "+ "Care practica sportul "+sport);
    }
    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public boolean isSportEchipa() {
        return sportEchipa;
    }

    public void setSportEchipa(boolean sportEchipa) {
        this.sportEchipa = sportEchipa;
    }

    public int getExperienta() {
        return experienta;
    }

    public void setExperienta(int experienta) {
        this.experienta = experienta;
    }

    @Override
    public void mergeLaAntrenamente() {
        System.out.println(" Sportivul este obligat sa mearga la antrenamente ");
    }

    @Override
    public void participaLaCompetitii() {
        System.out.println(" Sportivul participa la competitii ");
    }

    @Override
    public void respectaRegimAlimentar() {
        System.out.println(" Sportivul este obligat sa respecte regim alimentar ");
    }
}

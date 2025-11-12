package oopMostenire;

public interface AngajatInterface {

    //Abstractizarea = Conceptul prin care putem definii comportamentul unei clase;
    //Abstractizarea se poate face prin doua feluri:
    //                                              INTERFETE
    //                                              CLASE ABSTRACTE

    //Interfetele contin doar metode abstracte( Metodele nu au - BODY - ) //Body = {}
    //Toate metodele abstracte sunt publice;
    //Intr-o interfata putem defini metode cu void sau return;
    //Intr-o interfata nu putem avea un constructor - Nu putem face un obiect
    //Interfata se implementeaza - O interfata se implementeaza iar o clasa se mosteneste;
    //Clasa care implementeaza o interfata trebuie sa implementeze toate metodele din ea;
    //O clasa poate implementa mai multe interfete;
    //O interfata poate mostenii o alta interfata;


    void ajungeLaTimpLaBirou();
    void munceste();
    void respectaRegulamentulIntern();




}


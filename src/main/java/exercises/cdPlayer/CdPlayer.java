package main.java.exercises.cdPlayer;

//También la clase CdPlayer, que podrá contener un Cd.
// El CdPlayer podrá ser encendido (método play) para reproducir
// el Cd (simularemos que se está reproduciendo simplemente
// haciendo que play devuelva el título del disco introducido).
// Tened en cuenta que quizás el CdPlayer no tiene Cd metido
// (podéis comprobar si una variable está a null):
        /*if (cd == null) {
        // no hay cd
        ...
        }*/

public class CdPlayer {
    //propiedades
    private Cd cd;

    public CdPlayer() {
        this.cd = new Cd("The dark side of the moon.", 1200);
    }

    public String play() {
        if (cd == null) {
            return "ERROR: no cd";
        } else {
            return this.cd.getTitle();
        }
    }

    public Cd getCd() {return cd;}

}

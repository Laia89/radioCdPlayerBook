package main.java.exercises.cdPlayer;

//2- Cread la clase Cd con title y duration.
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

public class Main {

    public static void main(String[] args) {
        CdPlayer cdPlayer = new CdPlayer();

        String cdPlaying = cdPlayer.play();

        System.out.println("Is playing: " + cdPlaying);

    }
}

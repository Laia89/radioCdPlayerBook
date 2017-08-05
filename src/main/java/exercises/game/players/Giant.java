package main.java.exercises.game.players;

import java.util.Random;

public class Giant extends Player {
    //properties
    private Random random;
    private boolean isWeak;

    public Giant() {
        this.random = new Random();
        this.isWeak = false;
    }

    //- Cuando ataca, dos de cada 3 veces no atina (no hace daño), y una de cada 3 veces hace daño 4-6.
    @Override
    public int attack() {
        //té un 66% possibilitats de fallar
        if (random.nextFloat() <= 2./3) {
            this.isWeak = false;
            return 0;
        } else {
            this.isWeak = true;
            return 4 + random.nextInt(3);
        }
    }

    //Cuando recibe un golpe, le haces la mitad de daño que a un personaje normal.
    //3- El gigante, cuando realiza un ataque con daño queda momentáneamente muy vulnerable.
    //Por eso, tras un ataque con daño, el siguiente golpe que reciba le hará el doble de daño (en lugar de la mitad).
    @Override
    public void receiveHit(int hit) {
        if (this.isWeak) {
            super.receiveHit(hit*2);
        } else {
            super.receiveHit(hit/2);
        }
    }

}

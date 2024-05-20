abstract class Entidade {
}

abstract class Personagem extends Entidade {
    protected int vida;

    public Personagem(int vida) {
        this.vida = vida;
    }

    public abstract void mover();
}

class Fireboy extends Personagem {
    public Fireboy(int vida) {
        super(vida);
    }

    @Override
    public void mover() {
    }
}

class Watergirl extends Personagem {
    public Watergirl(int vida) {
        super(vida);
    }

    @Override
    public void mover() {
    }
}

abstract class Elemento extends Entidade {
}

class Item extends Elemento {
}

abstract class Perigo extends Elemento {
}

class Lava extends Perigo {
}

class Gelo extends Perigo {
}

class Nivel {
    private int numero;
    private int tempo;
    private int gemasColetadas;
    private Medalha medalha;

    public Nivel(int numero, int tempo, int gemasColetadas, Medalha medalha) {
        this.numero = numero;
        this.tempo = tempo;
        this.gemasColetadas = gemasColetadas;
        this.medalha = medalha;
    }
}

enum Medalha {
    CINZA,
    ROXA,
    LARANJA,
    VERDE
}

public class Main {
    public static void main(String[] args) {
        Fireboy fireboy = new Fireboy(3);
        Watergirl watergirl = new Watergirl(3);

        Nivel nivel1 = new Nivel(1, 100, 10, Medalha.VERDE);
    }
}

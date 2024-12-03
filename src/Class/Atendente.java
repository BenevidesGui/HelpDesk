package Class;

import java.util.Random;


public class Atendente {
    int id;
    String nomeUsuario;
    String numMatricula;

    public Atendente(int id, String nomeUsuario) {

        this.id = id;
        this.nomeUsuario = nomeUsuario;
        this.numMatricula = matricula ();
    }

    public String matricula (){
        Random random = new Random();
        String prefixo = "BR";
        int numeroInteiroLimite = random.nextInt(9999 - 1000 + 1) + 1000;
        return prefixo+numeroInteiroLimite;
    }
}

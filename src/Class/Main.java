package Class;

import static Enums.StatusChamado.*;

public class Main {
    public static void main(String[] args) {

        Atendente atendente1= new Atendente(123,"gui");
        Atendente atendente2= new Atendente(456,"Ana");

        Balcao balcao = new Balcao(123,atendente1.nomeUsuario,"Clear");
        balcao.geraRelatorio();

        Chamados chamado1 = new Chamados("cliente1",atendente1.nomeUsuario,"shampoo",ABERTO,atendente1);
        chamado1.geraRelatorio();

        Chamados chamado2 = new Chamados("cliente2",atendente2.nomeUsuario,"Gel",EM_ATENDIMENTO,atendente2);
        chamado2.geraRelatorio();

        Chamados chamado3 = new Chamados("cliente3",atendente1.nomeUsuario,"Condicionador",FECHADO,atendente1);
        chamado3.geraRelatorio();

    }
}

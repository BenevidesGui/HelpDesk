package Class;

import Enums.StatusChamado;
import Interface.Relatorio;

public class Chamados implements Relatorio {
    String nomeCliente;
    String nomeAtendente;
    String nomeProduto;
    StatusChamado status;
    private Atendente atendente;

    public Chamados(String cliente, String nomeAtendente, String produto, StatusChamado status, Atendente atendente) {
        this.nomeCliente=cliente;
        this.nomeAtendente = nomeAtendente;
        this.nomeProduto = produto;
        this.status = status;
        this.atendente = atendente;
    }

    @Override
     public String geraRelatorio(){
        System.out.println("Nome do Produto: "+nomeProduto+"\n status do Produto :"+status);
        return "Nome do Produto: "+nomeProduto+"\n status do Produto :"+status+"\n";
    }
}

package Class;

import Interface.Relatorio;

import java.time.LocalDateTime;

public class Balcao implements Relatorio {
    int id;
    String nomeAtendente;
    String nomeLoja;
    int qtdAtendimento;
    LocalDateTime horaAtendimento;
    private Atendente atendente;

    public Balcao(int id, String nomeAtendente,
                       String nomeLoja){

        this.id = id;
        this.nomeAtendente = nomeAtendente;
        this.nomeLoja = nomeLoja;
        this.horaAtendimento= Date();

    }

    public LocalDateTime Date(){
        return horaAtendimento = LocalDateTime.now();
    }

    @Override
    public String geraRelatorio() {
        System.out.println("Nome do Atendente :"+nomeAtendente+
                "\nNome da Loja :"+nomeLoja+"\nQuantidade de atendimentos:"
                +qtdAtendimento+"\nData"+horaAtendimento);
        return "Nome do Atendente :"+nomeAtendente+"\nNome da Loja :"
                +nomeLoja+"\nQuantidade de atendimentos:"+qtdAtendimento+
                "\nData"+horaAtendimento+"\n";
    }
}

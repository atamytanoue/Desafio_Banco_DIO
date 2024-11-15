import java.util.ArrayList;

public class Cliente {

    private String nome;
    private String senha;
    private ArrayList<Transacoes> listaT = new ArrayList<Transacoes>();

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Transacoes> getListaT() {
        return listaT;
    }

    public void setListaT(Transacoes transacao) {
        this.listaT.add(transacao);
    }

}

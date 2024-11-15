public class PessoaFisica extends Cliente {

    private String CPF;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
         this.CPF = CPF;
    }

    public PessoaFisica(String CPF, String senha, String nome) {
                this.CPF = CPF;
    }
}

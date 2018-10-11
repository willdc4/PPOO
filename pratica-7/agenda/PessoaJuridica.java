package testeagenda;

public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private int inscricaoEstadual;
    
    public PessoaJuridica(String nome, String endereco, String email, String cnpj, int inscricaoEstadual) {
        super(nome,endereco,email);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    public String getCnpj() {
       return cnpj; 
    }

    @Override
    public String toString() {
        return super.toString() + "CNPJ: " + cnpj + "\nInscrição Estadual: " + inscricaoEstadual + '\n';
    }
}

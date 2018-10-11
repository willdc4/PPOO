public class Correcao {
    private int questao;
    private String situacao;
    private int tentativas;
    
    Correcao(int questao, String situacao, int tentativas) {
        this.questao = questao;
        this.situacao = situacao;
        this.tentativas = tentativas;
    }
    
    public int getQuestao() {
        return questao;
    }
    
    public String getSituacao() {
        return situacao;
    }

    public int getTentativas() {
        return tentativas;
    }
}

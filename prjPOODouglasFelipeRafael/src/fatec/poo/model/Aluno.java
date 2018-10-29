package fatec.poo.model;

/**
 *
 * @author Dougla
 */
public class Aluno extends Pessoa{
    private String escolaridade;

    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }

    public void setEscolaridade(String Escolaridade) {
        this.escolaridade = Escolaridade;
    }
    
}

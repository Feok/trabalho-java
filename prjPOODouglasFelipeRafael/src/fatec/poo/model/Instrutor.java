package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Dougla
 */
public class Instrutor extends Pessoa{
    private String formacao;
    private String areaAtuacao;
    private ArrayList<Curso> cursos;

    public Instrutor(String nome, String cpf) {
        super(cpf, nome);
        this.cursos = new ArrayList<Curso>();
    }

    public void setFormacao(String Formacao) {
        this.formacao = Formacao;
    }

    public void setAreaAtuacao(String AreaAtuacao) {
        this.areaAtuacao = AreaAtuacao;
    }



  
}

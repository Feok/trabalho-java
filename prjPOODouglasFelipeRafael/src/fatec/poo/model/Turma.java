package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Dougla
 */
public abstract class Turma {
    private String siglaTurma;
    private String descricao;
    private String dataInicio;
    private String dataTermino;
    private String periodo;
    private int qtdVagas;
    private String observacoes;
    private ArrayList<Pessoa> pessoas;

    public Turma(String SiglaTurma) {
        this.siglaTurma = SiglaTurma;
        this.pessoas = new ArrayList<Pessoa>(); 
    }

    public void setDescricao(String Descricao) {
        this.descricao = Descricao;
    }

    public void setDataInicio(String DataInicio) {
        this.dataInicio = DataInicio;
    }

    public void setDataTermino(String DataTermino) {
        this.dataTermino = DataTermino;
    }

    public void setPeriodo(String Periodo) {
        this.periodo = Periodo;
    }

    public void setQtdVagas(int QtdVagas) {
        this.qtdVagas = QtdVagas;
    }

    public void setObservacoes(String Observacoes) {
        this.observacoes = Observacoes;
    }

    public abstract void emitirListaFrequencia();

}

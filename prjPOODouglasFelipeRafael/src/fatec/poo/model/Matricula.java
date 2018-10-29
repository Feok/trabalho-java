package fatec.poo.model;

/**
 *
 * @author Dougla
 */
public class Matricula {
    private final String data;
    private int qtdeFaltas;
    private double nota;
    private String matricula;

    public Matricula(String data) {
        this.data = data;
    }

    public void setQtdeFaltas(int qtdeFaltas) {
        this.qtdeFaltas = qtdeFaltas;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
   public void emitirCarne() {
       
   }
}

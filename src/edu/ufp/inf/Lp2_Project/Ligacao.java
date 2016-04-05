package edu.ufp.inf.Lp2_Project;

public class Ligacao extends DirectedEdge {

  private Paragem nextParagem;

  private float tempo;

  private float custo;

    private Paragem cruza;

  public void addLinha(Linha l) {
  }

  public void removeLinha(Linha l) {
  }

    public Paragem getNextParagem() {
        return nextParagem;
    }

    public float getTempo() {
        return tempo;
    }

    public float getCusto() {
        return custo;
    }

    public Paragem getCruza() {
        return cruza;
    }

    public Ligacao(Paragem nextParagem, float tempo, float custo, Paragem cruza, int v, int w, double weight) {
        super(v, w, weight);
        this.nextParagem = nextParagem;
        this.tempo = tempo;
        this.custo = custo;
        this.cruza = cruza;
    }

    public void setNextParagem(Paragem nextParagem) {
        this.nextParagem = nextParagem;
    }

    public void setTempo(float tempo) {
        this.tempo = tempo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public void setCruza(Paragem cruza) {
        this.cruza = cruza;
    }

}
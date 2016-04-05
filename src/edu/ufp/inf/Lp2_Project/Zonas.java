package edu.ufp.inf.Lp2_Project;

public class Zonas extends EdgeWeightedGraph {

    private Integer idZona;

    private String nome;

    public void addZona(Zonas z) {
    }

    public void removeZona(Zonas z) {
    }

    public Zonas searchZona(Zonas nome) {
        return null;
    }

    public void addligacao(Ligacao l) {
    }

    public void removeLigacao(Ligacao l) {
    }

    public Integer getIdZona() {
        return idZona;
    }

    public String getNome() {
        return nome;
    }

    public Vector getPertencem() {
        return pertencem;
    }

    public void setIdZona(Integer idZona) {
        this.idZona = idZona;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPertencem(Vector pertencem) {
        this.pertencem = pertencem;
    }

    public Zonas(Integer idZona, String nome, Vector pertencem, int V) {
        super(V);
        this.idZona = idZona;
        this.nome = nome;
        this.pertencem = pertencem;
    }

    public Zonas(Integer idZona, String nome, Vector pertencem, int V, int E) {
        super(V, E);
        this.idZona = idZona;
        this.nome = nome;
        this.pertencem = pertencem;
    }

    public Zonas(Integer idZona, String nome, Vector pertencem, In in) {
        super(in);
        this.idZona = idZona;
        this.nome = nome;
        this.pertencem = pertencem;
    }

    public Zonas(Integer idZona, String nome, Vector pertencem, EdgeWeightedGraph G) {
        super(G);
        this.idZona = idZona;
        this.nome = nome;
        this.pertencem = pertencem;
    }
    
}

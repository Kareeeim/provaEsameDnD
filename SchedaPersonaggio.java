package provaEsameDnD;

public abstract class SchedaPersonaggio {
    protected String nome;
    protected double vita; //VITA_MAX - DANNO_BASE

    public SchedaPersonaggio(String nome, double vita){
        this.nome = nome;
        this.vita = Regole.VITA_MAX;
    }
    
}

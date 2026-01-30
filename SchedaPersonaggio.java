package provaEsameDnD;

public abstract class SchedaPersonaggio {
    protected String nome;
    protected double vita; //VITA_MAX - DANNO_BASE
    protected int schiva; //quante volte puoi schivare
    protected int ts;

    public SchedaPersonaggio(String nome, double vita, int schiva, int ts){
        this.nome = nome;
        this.vita = Regole.VITA_MAX;
        this.schiva = schiva;
        this.ts = ts;
    }
    
}

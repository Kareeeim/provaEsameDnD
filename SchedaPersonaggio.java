package provaEsameDnD;

public abstract class SchedaPersonaggio {
    protected String nome;
    protected int vita; //VITA_MAX - DANNO_BASE

    public SchedaPersonaggio(String nome){
        this.nome = nome;
        this.vita = Regole.VITA_MAX;
    }
    
}

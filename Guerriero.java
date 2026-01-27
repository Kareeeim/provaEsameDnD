package provaEsameDnD;

public class Guerriero extends SchedaPersonaggio implements Melee {
    // attributo aggiuntivo rispetto a SchedaPersonaggio
    protected int valoreForza;


    public Guerriero(String nome,int valoreForza) {
        super(nome);
        this.valoreForza = valoreForza;
    }

    public void attaccoMelee() {
        System.out.println(nome + " tira una sleppa da " + (Regole.DANNO_BASE + valoreForza) + " danni");
    }
}

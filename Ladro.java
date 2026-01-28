package provaEsameDnD;

public class Ladro extends SchedaPersonaggio implements Melee {
    protected String trauma;

    public Ladro(String nome, String trauma, double vita) {
        super(nome, vita);
        this.trauma = trauma;
    }

    public void attaccoMelee() {
        System.out.println(nome + " ti taglia i tendini e siccome " + trauma + " fa: " + (Regole.DANNO_BASE * Regole.sneakAttackLadro)+ " danni");
    }
}

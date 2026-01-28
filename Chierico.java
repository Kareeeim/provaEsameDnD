package provaEsameDnD;

public class Chierico extends SchedaPersonaggio implements Melee, Spells, Healing {
    protected String divinità;

    public Chierico(String nome, String divinità, double vita){
        super(nome, vita);
        this.divinità = divinità;
    }


    public void healing(){
        System.out.println(nome + " ti rinvigorisce di: " + (Regole.DANNO_BASE * Regole.interventoDivino) + " hp nel nome di " + divinità);
    }
    public void attaccoMelee(){
        System.out.println(nome + " ti porge l'altra guangia e ti fa: " + (Regole.DANNO_BASE / 2) + "danni");
    }
    public void spell(){
        System.out.println(nome + " ti tira una sfera di acqua santa e fa: " + (Regole.DANNO_BASE * Regole.interventoDivino) + "danni");
    }
}




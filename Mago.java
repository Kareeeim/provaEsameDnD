package provaEsameDnD;

public class Mago extends SchedaPersonaggio implements Spells, Melee {
    protected String magia;

    public Mago(String nome, String magia, double vita){
        super(nome, vita);
        this.magia = magia;
    }


    public void spell() {
        System.out.println(nome + " tira una " + magia + " da " + (Regole.DANNO_BASE * Regole.pallaDiFuoco) + " danni, chi se lo aspettava...");
    }
    public void attaccoMelee() {
        System.out.println(nome + " fa " + (Regole.DANNO_BASE - 29) + " danni, cosa ti aspettavi...");
        System.out.println("La prossima volta prova: " + magia + " idiota");
    }
}

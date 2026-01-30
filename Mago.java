package provaEsameDnD;
import java.util.Scanner;
public class Mago extends SchedaPersonaggio implements Spells, Melee, Dodge, Morte, Hb {
    protected String magia;

    Scanner scanner = new Scanner(System.in);

    public Mago(String nome, String magia, double vita, int schiva, int ts){
        super(nome, vita, schiva, ts);
        this.magia = magia;
    }

    @Override
    public void spell() {
        System.out.println(nome + " tira una " + magia + " da " + (Regole.DANNO_BASE * Regole.pallaDiFuoco) + " danni, chi se lo aspettava...");
    }
    @Override
    public void attaccoMelee() {
        System.out.println(nome + " fa " + (Regole.DANNO_BASE - 29) + " danni, cosa ti aspettavi...");
        System.out.println("La prossima volta prova: " + magia + " idiota");
    }
    @Override   
    public void dodge(){
        if(schiva > 0) {
            System.out.println(nome + " attacco schivato con successo");
            schiva --;
        } else {
            System.out.println(nome + " la prossima vota prova a giocare un rogue");
        }
    }
    @Override
    public void morte(){
        System.out.println("Tira il dado: ");
        int ts = scanner.nextInt();

        if(ts >= 10){
            System.out.println(nome + " Ehy you, you're finally awake");
        } else{
            System.out.println(nome + " RIP Bozo, you won't be missed");
        }
        scanner.close();
    }
    @Override
    public void auguri(){
        System.out.println(nome + ": " + "BUON COMPLEANNO MASTERMATTEO!");
    }
}

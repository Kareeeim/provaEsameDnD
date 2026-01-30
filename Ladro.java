package provaEsameDnD;
import java.util.Scanner;
public class Ladro extends SchedaPersonaggio implements Melee, Dodge, Morte, Hb{

    Scanner scanner = new Scanner(System.in);

    protected String trauma;

    public Ladro(String nome, String trauma, double vita, int schiva, int ts) {
        super(nome, vita, schiva, ts);
        this.trauma = trauma;
    }
    @Override
    public void attaccoMelee() {
        System.out.println(nome + " ti taglia i tendini e siccome " + trauma + " fa: " + (Regole.DANNO_BASE * Regole.sneakAttackLadro)+ " danni");
    }
    @Override
    public void dodge(){
        if(schiva > 0) {
            System.out.println(nome + " attacco schivato con successo");
            schiva --;
        } else {
            System.out.println(nome + " hai rotto le palle, per oggi hai schivato abbastanza");
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

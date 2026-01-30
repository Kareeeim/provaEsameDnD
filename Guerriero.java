package provaEsameDnD;
import java.util.Scanner;
public class Guerriero extends SchedaPersonaggio implements Melee, Dodge, Morte, Hb {

    Scanner scanner = new Scanner(System.in);
    
    protected double valoreForza;


    public Guerriero(String nome,int valoreForza, double vita, int schiva, int ts) {
        super(nome, vita, schiva, ts);
        this.valoreForza = valoreForza;
    }
    @Override
    public void attaccoMelee() {
        System.out.println(nome + " tira una sleppa da " + (Regole.DANNO_BASE + valoreForza) + " danni");
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

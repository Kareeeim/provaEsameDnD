package provaEsameDnD;
import java.util.Scanner;
public class Chierico extends SchedaPersonaggio implements Melee, Spells, Healing, Dodge, Morte, Hb {
    protected String divinità;

    Scanner scanner = new Scanner(System.in);

    public Chierico(String nome, String divinità, double vita, int schiva, int ts){
        super(nome, vita, schiva, ts);
        this.divinità = divinità;
    }

    @Override
    public void healing(){
        System.out.println(nome + " ti rinvigorisce di: " + (Regole.DANNO_BASE * Regole.interventoDivino) + " hp nel nome di " + divinità);
    }
    @Override
    public void attaccoMelee(){
        System.out.println(nome + " ti porge l'altra guangia e ti fa: " + (Regole.DANNO_BASE / 2) + "danni");
    }
    @Override
    public void spell(){
        System.out.println(nome + " ti tira una sfera di acqua santa e fa: " + (Regole.DANNO_BASE * Regole.interventoDivino) + "danni");
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





package provaEsameDnD;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Guerriero guerriero1 = new Guerriero("Bucci", 18, 100, 0, 0);
        Ladro ladro1 = new Ladro("Limes", "ha la mamma morta", 100, 3, 0);
        Chierico chierico1 = new Chierico("Zaigan", "Cristo", 100, 0, 0);
        Mago mago1 = new Mago("Golurb", "PALLA DI FUOCO", 100, 1, 0);
        
        guerriero1.auguri();      //BUON COMPLEANNO PROF
        ladro1.auguri();           //ho scrtto mastermatteo perché ogni sessione di D&D è gestita da un master
        chierico1.auguri();         //e sono un grande amante dei giochi di parole
        mago1.auguri();
        System.out.println("La vita iniziale di " + guerriero1.nome + " è "  + guerriero1.vita);
        System.out.println("La vita iniziale di " + ladro1.nome + " è " + ladro1.vita);
        guerriero1.attaccoMelee();
        System.out.println(ladro1.nome + "viene colpito da: " + guerriero1.nome + " e perde: " + (Regole.DANNO_BASE + guerriero1.valoreForza) + " hp");
        ladro1.vita = ladro1.vita - (Regole.DANNO_BASE + guerriero1.valoreForza);
        System.out.println("La vita di " + ladro1.nome + " adesso è: " + ladro1.vita);
        ladro1.attaccoMelee();
        System.out.println(guerriero1.nome + " viene colpito da: " + ladro1.nome + " e perde: " + (Regole.DANNO_BASE * Regole.sneakAttackLadro / Regole.dimezzaAttaccoSubitoGuerriero) + " hp");
        guerriero1.vita = guerriero1.vita - Regole.DANNO_BASE * Regole.sneakAttackLadro / Regole.dimezzaAttaccoSubitoGuerriero;
        System.out.println("La vita di " + guerriero1.nome + " adesso è: " + guerriero1.vita);
        System.out.println("La vita iniziale di " + chierico1.nome + " è " + chierico1.vita);
        chierico1.healing();
        System.out.println(chierico1.nome + " cura " + ladro1.nome);
        ladro1.vita = ladro1.vita + (Regole.DANNO_BASE * Regole.interventoDivino);
        System.out.println("La vita di " + ladro1.nome + " adesso è: " + ladro1.vita);
        System.out.println("La vita iniziale di: " + mago1.nome + " é: " + mago1.vita);
        mago1.spell();
        System.out.println(ladro1.nome + " e " + guerriero1.nome + " vengono colpiti da: " + mago1.magia);
        ladro1.dodge();
        guerriero1.dodge();
        System.out.println(guerriero1.nome + " subisce " + (Regole.DANNO_BASE * Regole.pallaDiFuoco / Regole.dimezzaAttaccoSubitoGuerriero) + " danni");
        guerriero1.vita = guerriero1.vita - (Regole.DANNO_BASE * Regole.pallaDiFuoco / Regole.dimezzaAttaccoSubitoGuerriero);
        System.out.println("La vita di " + ladro1.nome + " è: " + ladro1.vita);
        System.out.println("La vita di " + guerriero1.nome + " adesso è: " + guerriero1.vita);
        ladro1.dodge();
        ladro1.dodge();
        ladro1.dodge();//test per vedere se il counter dei dodge si aggiorna
        guerriero1.morte();
        guerriero1.dodge();
        
        scanner.close();
    }
}


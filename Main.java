package provaEsameDnD;

public class Main {
    public static void main(String[] args) {
        Guerriero guerriero1 = new Guerriero("Bucci", 18, 100);
        Ladro ladro1 = new Ladro("Limes", "ha la mamma morta", 100);
        Chierico chierico1 = new Chierico("Zaigan", "Cristo", 100);
        Mago mago1 = new Mago("Golurb", "PALLA DI FUOCO", 100);
        
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
        System.out.println(ladro1.nome + " subisce: " + (Regole.DANNO_BASE * Regole.pallaDiFuoco) + " danni");
        System.out.println(guerriero1.nome + " subisce " + (Regole.DANNO_BASE * Regole.pallaDiFuoco / Regole.dimezzaAttaccoSubitoGuerriero) + " danni");
        ladro1.vita = ladro1.vita - (Regole.DANNO_BASE * Regole.pallaDiFuoco);
        guerriero1.vita = guerriero1.vita - (Regole.DANNO_BASE * Regole.pallaDiFuoco / Regole.dimezzaAttaccoSubitoGuerriero);
        System.out.println("La vita di " + ladro1.nome + " adesso è: " + ladro1.vita);
        System.out.println("La vita di " + guerriero1.nome + " adesso è: " + guerriero1.vita);
    }
}

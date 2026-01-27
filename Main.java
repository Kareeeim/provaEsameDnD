package provaEsameDnD;

public class Main {
    public static void main(String[] args) {
        Guerriero guerriero1 = new Guerriero("Bucci", 18);
        Ladro ladro1 = new Ladro("Limes", "ha la mamma morta");
        
        
        
        System.out.println("La vita iniziale di " + guerriero1.nome + "è "  + guerriero1.vita);
        guerriero1.attaccoMelee();
        System.out.println("La vita iniziale di " + ladro1.nome + " è " + ladro1.vita);
        ladro1.attaccoMelee();

    }
}

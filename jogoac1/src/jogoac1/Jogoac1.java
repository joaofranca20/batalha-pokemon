package jogoac1;

import java.util.Scanner;

public class Jogoac1 {

    public static String battle;

    public static void main(String[] args) {

        System.out.print("Selecione qual luta você quer ver: " + "\n"
                + "1 - Totodile (água) VS Chikorita (planta)" + "\n"
                + "2 - Chikorita (planta) VS Cyndaquil (fogo)" + "\n"
                + "3 - Totodile (água) VS Cyndaquil (fogo)" + "\n"
        );
        Scanner sc1 = new Scanner(System.in);
        battle = sc1.next();

    }

    public static void criarBatalha(int i) {

        switch (i) {
            case 1:
                Batalha.batalhaPokemon(new Pokemon("Chikorita", "Planta", 20), new Pokemon("Totodile ", "Água", 20));
                break;
            case 2:
                Batalha.batalhaPokemon(new Pokemon("Cyndaquil", "Fogo", 20), new Pokemon("Chikorita ", "Planta", 20));
                break;
            case 3:
                Batalha.batalhaPokemon(new Pokemon("Totodile", "Água", 20), new Pokemon("Cyndaquil ", "Fogo", 20));
                break;
        }
    }

}

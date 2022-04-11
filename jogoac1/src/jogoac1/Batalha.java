/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogoac1;

import javax.swing.JOptionPane;

public class Batalha {

    public static void batalhaPokemon(Pokemon poke1, Pokemon poke2) {
        boolean isDefeated;
        do {
            isDefeated = ataquePokemon(poke1, poke2);

            if (!isDefeated) {
                isDefeated = ataquePokemon(poke2, poke1);
            }

        } while (!isDefeated);

    }

    private static boolean ataquePokemon(Pokemon poke1, Pokemon poke2) {

        double dano = poke1.getAtaque() - poke2.getDefesa();
        poke2.setHp(poke2.getHp() - dano);

        if (poke2.getHp() <= 0) {
            //System.out.println("\n" + poke2.getNome() + " Foi derrotado por "
            //+ poke1.getNome() + "! " + poke1.getNome() + " saiu com "
            //+ poke1.getHp() + "HP!");
            JOptionPane.showMessageDialog(null, poke2.getNome() + "foi derrotado por "
                    + poke1.getNome() + "! \n" + poke1.getNome() + " saiu com "
                    + (int) poke1.getHp() + "HP!");

            return true;

        }
        return false;
    }

}

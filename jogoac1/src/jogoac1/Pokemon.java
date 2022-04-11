/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogoac1;

public class Pokemon {

    private String nome;
    private String tipo;
    private double hp = 200;
    private double defesa;
    private double ataque;
    private int level;

    public Pokemon(String nome, String tipo, int level) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;

        calculaAtributos();
        calculaLevel();
        imprimeAtributos();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    private void imprimeAtributos() {
        System.out.println(
                "Nome: " + this.nome + " | "
                + "Tipo: " + this.tipo + " | "
                + "Vida: " + this.hp + " | "
                + "Defesa: " + this.defesa + " | "
                + "Level: " + this.level + " | "
                + "Ataque: " + this.ataque + " |"
                + " \n ");
    }

    private void calculaLevel() {
        hp = hp + (level / 2) + 1.5 * hp;
        ataque = ataque + (level / 3) + 1.1 * ataque;
        defesa = defesa + (level / 4) + 1.1 * defesa;
    }

    private void calculaAtributos() {

        switch (this.tipo) {

            case "Fogo":
                this.ataque = 59;
                this.defesa = 10;
                this.hp -= 30;
                break;

            case "Água":
                this.ataque = 30;
                this.defesa = 36;
                this.hp += 30;
                break;

            case "Planta":
                this.ataque = 48;
                this.defesa = 20;
                this.hp -= 10;
                break;
        }

    }

}

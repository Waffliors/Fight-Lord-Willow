/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author joao.pbsilva20
 */
public class Terrestre_leve extends Inimigo {

    public Terrestre_leve() {
        // Valores de vida, ataque, defesa, velocidade de movimento, gold, xp 
        // e tipo, respectivamente
        super(10, 2, 5, 1, 10, 20, "terrestre");
    }

    public void reduzVida(int valor) {
        super.reduzVida(valor);
    }

    public boolean morte() {
        return super.getVida() == 0;
    }

}

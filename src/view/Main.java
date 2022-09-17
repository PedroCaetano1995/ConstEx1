package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedro
 */
import model.Ventilador;

class Main {
  public static void main(String[] args) {
    Ventilador v1 = new Ventilador("Branco");
    Ventilador v2 = new Ventilador(1l, "Branco", true );

    System.out.println(v1.verVelocidade());
    System.out.println(v2.verVelocidade());

    v1.ligar();
    v2.desligar();
    
    System.out.println(v1.verVelocidade());
    System.out.println(v2.verVelocidade());
  }
}

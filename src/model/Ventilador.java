/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author pedro
 */


public class Ventilador {
  Long velocidade;
  String cor;
  boolean ligado;

  public Ventilador(String cor) {
    this.cor = cor;
    this.ligado = false;
    this.velocidade = 0l;
  }

  public Ventilador(Long velocidade, String cor, boolean ligado) {
    this.velocidade = velocidade;
    this.cor = cor;
    this.ligado = ligado;
  }

  public Long getVelocidade() {
    return velocidade;
  }

  public void setVelocidade(Long velocidade) {
    this.velocidade = velocidade;
  }

 public void setCor(String cor) {
   this.cor = cor;
 }

 public String getCor() {
   return cor;
 }

  public void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  public boolean isLigado() {
    return ligado;
  }

  public void ligar() {
    this.velocidade = 1l;
    this.ligado = true;
  }

  public void desligar() {
    this.velocidade = 0l;
    this.ligado = false;
  }

  public String verVelocidade() {
    return this.ligado? "Ventilador esta ligadona velocidade: " + this.velocidade : "Ventilador Desligado";
  }

  public String estaLigado() {
    return this.ligado? "Ligado" : "Desligado";
  }

  @Override
  public String toString() {
    return "Cor: " + this.cor + ", Velocidade: " + this.velocidade + ", está " + estaLigado() ;
  }

}

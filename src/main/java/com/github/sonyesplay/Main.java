package com.github.sonyesplay;

import com.github.sonyesplay.mascota.*;


public class Main {

  public static void main(String[] args) {
    Mascota mascota = new Mascota("andres","10");
    Perro p = new Perro("prueba perro","edad perro prueba");
    Gato g = new Gato("prueba GATO","edad GATO prueba");

    //perro.agregarAccesorio(new Accesorio("Collar Antipulgas"));
    System.out.println(mascota);
    System.out.println(p);
    System.out.println(g);

  }
}

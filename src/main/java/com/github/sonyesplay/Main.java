package com.github.sonyesplay;


public class Main {

  public static void main(String[] args) {
    TiendaMascota tiendaMascota= new TiendaMascota();
    Perro p = new Perro("mike","5 meses");
    tiendaMascota.agregarMascota(p);
    Gato g = new Gato("simon","10 años");
    tiendaMascota.agregarMascota(g);
    Perro p2 = new Perro("marco","5 dias");
    tiendaMascota.agregarMascota(p2);
    Gato g2 = new Gato("sam","10 meses");
    tiendaMascota.agregarMascota(g2);
    //tiendaMascota.agregarMascota(new mascota(("mike","5 meses"));

    //perro.agregarAccesorio(new Accesorio("Collar Antipulgas"));
    System.out.println(tiendaMascota);
    /*System.out.println(p);
    System.out.println(g);*/

  }
}

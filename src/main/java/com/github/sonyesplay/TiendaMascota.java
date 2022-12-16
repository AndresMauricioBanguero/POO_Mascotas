package com.github.sonyesplay;

import java.util.ArrayList;

public class TiendaMascota {

    private final ArrayList<Mascota> mascotas;
    /*private ArrayList<Perro> perros;
    private ArrayList<Gato> gatos;*/

    public TiendaMascota() {
       /* this.perros = new ArrayList<>();
        this.gatos = new ArrayList<>();*/
        this.mascotas = new ArrayList<>();
    }

    public void agregarMascota(Mascota mascota) {
        if (mascota instanceof Perro) {
           // Perro perro= (Perro) mascota;
            ((Perro) mascota).haceSonidoperro();
            System.out.println("se agrego un perro");
            System.out.println(mascota);
        } else {
            //Gato gato= (Gato) mascota;
            ((Gato) mascota).haceSonidogato();
            System.out.println("se agrego un gato");
            System.out.println(mascota);

        }
        this.mascotas.add(mascota);
    }
    /*public void agregarPerro(Perro perro) {
        this.perros.add(perro);
    }
    public void agregarGato(Gato gato) {
        this.gatos.add(gato);
    }*/

    @Override
    public String toString() {
        return "TiendaMascota{" +
                "mascotas=" + mascotas +
                '}';
    }
}

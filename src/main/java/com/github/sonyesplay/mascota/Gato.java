package com.github.sonyesplay.mascota;

import com.github.sonyesplay.mascota.Mascota;

public class Gato extends Mascota {

     public Gato(String nombre, String edad) {
         super(nombre, edad);
    }
    public void haceSonidogato(){
        System.out.println("miau");
    }
}

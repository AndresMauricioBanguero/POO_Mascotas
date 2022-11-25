package com.github.sonyesplay;

import com.github.sonyesplay.mascota.Mascota;

import java.util.ArrayList;

public class TiendaMascota {

    private ArrayList<Mascota> mascotas;

    public TiendaMascota() {
        this.mascotas = new ArrayList<>();
    }
    public void agregarMascota(Mascota mascota) {
        this.mascotas.add(mascota);
    }

    @Override
    public String toString() {
        return "TiendaMascota{" +
                "mascotas=" + mascotas +
                '}';
    }
}

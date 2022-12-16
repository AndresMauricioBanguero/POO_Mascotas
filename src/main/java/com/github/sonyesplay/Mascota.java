package com.github.sonyesplay;

public abstract class Mascota {
    private final String nombre;
    private final String edad;

    public Mascota(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }


}

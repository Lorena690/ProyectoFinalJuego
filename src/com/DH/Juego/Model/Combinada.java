package com.DH.Juego.Model;

import java.util.ArrayList;
import java.util.List;

public class Combinada extends Habilidad {

    private Integer factorMultiplicador;
    private List<Habilidad> habilidades;

    public Combinada(String nombre, String descripcion, Integer factorMultiplicador) {
        super(nombre, descripcion);
        this.factorMultiplicador = factorMultiplicador;
        this.habilidades = new ArrayList<>();
    }

    public void agregarHabilidad(Habilidad habilidad){
        habilidades.add(habilidad);
    }

    @Override
    public Double calcularPuntaje() {
        Double sumatoria = 0.;
        for (Habilidad habilidad: habilidades) {
            sumatoria += habilidad.calcularPuntaje();
        }
        return sumatoria*factorMultiplicador;
    }

    @Override
    public String mostrarHabilidad() {
        return "Habilidad Combinada: Nombre: "+getNombre()+" Puntaje: "+calcularPuntaje()+"\n";
    }
}

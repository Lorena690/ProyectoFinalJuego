package com.DH.Juego.Model;

import com.DH.Juego.Factory.HabilidadFactory;

import java.util.ArrayList;
import java.util.List;

public class Personaje {

    private List<Habilidad> habilidades;

    public Personaje() {
        this.habilidades = new ArrayList<>();
    }

    public void agregarHabilidad(String codigo){
        try {
            habilidades.add(HabilidadFactory.getInstance().generarHabiliadad(codigo));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String mostrarHabilidades(){
        String textoHabilidades = "Habilidades:\n";
        for (Habilidad habilidad: habilidades) {
            textoHabilidades += habilidad.mostrarHabilidad();
        }
        return textoHabilidades;
    }
}

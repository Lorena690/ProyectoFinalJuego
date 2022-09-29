package com.DH.Juego;

import com.DH.Juego.Factory.HabilidadFactory;
import com.DH.Juego.Model.Personaje;

public class Test {
    public static void main(String[] args) {
        Personaje personaje = new Personaje();
        personaje.agregarHabilidad(HabilidadFactory.CODIGO_SALTAR);
        personaje.agregarHabilidad(HabilidadFactory.CODIGO_DISPARAR);
        personaje.agregarHabilidad(HabilidadFactory.CODIGO_DISPARO_AL_SALTAR);

        System.out.println("---------------");
        System.out.println(personaje.mostrarHabilidades());
        System.out.println("---------------");

        personaje.agregarHabilidad("correr");

    }
}

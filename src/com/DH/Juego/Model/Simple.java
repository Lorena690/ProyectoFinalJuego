package com.DH.Juego.Model;

public class Simple extends Habilidad {

    private Double puntaje;
    private final String DISPARAR = "Disparar";

    public Simple(String nombre, String descripcion, Double puntaje) {
        super(nombre, descripcion);
        this.puntaje = puntaje;
    }

    @Override
    public Double calcularPuntaje() {
        if (getNombre() == DISPARAR)
            return puntaje*1.1;
        else
            return puntaje;
    }

    @Override
    public String mostrarHabilidad() {
        return "Habilidad Simple: Nombre: "+getNombre()+" Puntaje: "+calcularPuntaje()+"\n";
    }
}

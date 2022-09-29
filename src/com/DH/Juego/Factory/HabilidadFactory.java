package com.DH.Juego.Factory;

import com.DH.Juego.Model.Combinada;
import com.DH.Juego.Model.Habilidad;
import com.DH.Juego.Model.Simple;

public class HabilidadFactory {
    private static HabilidadFactory instance;
    public static final String CODIGO_DISPARAR = "Disparar";
    public static final String CODIGO_SALTAR = "Saltar";
    public static final String CODIGO_DISPARO_AL_SALTAR = "Disparo-al-saltar";
    private HabilidadFactory(){

    }

    public static HabilidadFactory getInstance(){
        if(instance == null)
            instance = new HabilidadFactory();
        return instance;
    }

    public Habilidad generarHabiliadad(String codigo) throws Exception {
        switch (codigo){
            case CODIGO_DISPARAR:
                return new Simple(CODIGO_DISPARAR, "Disparar con una bonificación", 10.);
            case CODIGO_SALTAR:
                return new Simple(CODIGO_SALTAR, "El personaje Salta", 7.5);
            case CODIGO_DISPARO_AL_SALTAR:
                Combinada combinada = new Combinada(CODIGO_DISPARO_AL_SALTAR, "Una habilidad combinada para saltar y disparar", 3);
                combinada.agregarHabilidad(generarHabiliadad(CODIGO_SALTAR));
                combinada.agregarHabilidad(generarHabiliadad(CODIGO_DISPARAR));
                return combinada;
            default:
                throw new Exception("No existe la habilidad con el codigo : " + codigo);
        }
    }


}

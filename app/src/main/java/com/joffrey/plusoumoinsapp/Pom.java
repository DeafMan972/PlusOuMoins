package com.joffrey.plusoumoinsapp;

public class Pom {

    private boolean reponse;
    private int nombre;
    private int nombre2;

    public Pom(int nombre) {
        setNombre(nombre);
    }

    public void LancerProgramme() {

        if (getNombre() > getNombre2() && getNombre() < getNombre2()) {
            setReponse(false);
        }
        if (getNombre() == getNombre2()) {
            setReponse(true);
        }

    }

    public boolean isReponse(){
        return reponse;
    }

    public void setReponse(boolean reponse) {
        this.reponse = reponse;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getNombre2(){
        this.nombre2 = (int) Math.random();
        return nombre2;
    }
}
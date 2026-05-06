package ar.edu.unahur.obj2.w2j.drones;

import ar.edu.unahur.obj2.w2j.misiones.IMision;

public abstract class Dron {
    protected Integer autonomia;
    protected Double procesamiento;
    protected IMision misionAsignada;

    public Dron(Integer autonomia, Double procesamiento, IMision misionAsignada) {
        this.autonomia = autonomia;
        this.procesamiento = procesamiento;
        this.misionAsignada = misionAsignada;
    }

//*************************************************************

    public Integer getAutonomia() {
        return this.autonomia;
    }

    public void reprogramarMision(IMision nuevaMision) {
        this.misionAsignada = nuevaMision;
    }

    public void reducirAutonomia(Integer unidades) {
        this.autonomia -= unidades;
    }

//*************************************************************
    
    //Templade Method
    public Double getEficienciaOperativa() {
        return (autonomia * 10) + doEficienciaExtra();
    }

    public abstract Double doEficienciaExtra();

    public abstract Boolean esDronAvanzado();
}

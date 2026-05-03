package ar.edu.unahur.obj2.w2j.drones;

import ar.edu.unahur.obj2.w2j.misiones.IMision;

public class DronComercial extends Dron {

    public DronComercial(Integer autonomia, Double procesamiento, IMision misionAsignada) {
        super(autonomia, procesamiento, misionAsignada);
    }

//*************************************************************

//*************************************************************

    @Override
    public Double doEficienciaExtra() {
        return this.misionAsignada.getEficienciaSegunMision() + 15.0;
    }

    @Override
    public Boolean esDronAvanzado() {
        return false;
    }
    
}

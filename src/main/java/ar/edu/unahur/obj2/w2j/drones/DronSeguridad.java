package ar.edu.unahur.obj2.w2j.drones;

import ar.edu.unahur.obj2.w2j.misiones.IMision;

public class DronSeguridad extends Dron {

    public DronSeguridad(Integer autonomia, Double procesamiento, IMision misionAsignada) {
        super(autonomia, procesamiento, misionAsignada);
    }
    
//*************************************************************

//*************************************************************

    @Override
    public Double doEficienciaExtra() {
        return this.misionAsignada.getEficienciaSegunMision();
    }

    @Override
    public Boolean esDronAvanzado() {
        return this.procesamiento > 50 || misionAsignada.esDronAvanzadoParaEstaMision(this); 
    }
}

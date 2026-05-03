package ar.edu.unahur.obj2.w2j.misiones;

import ar.edu.unahur.obj2.w2j.drones.Dron;

public class StrategyMisionTransporte implements IMision {

    public StrategyMisionTransporte() {
    }

//*************************************************************

//*************************************************************

    @Override
    public Double getEficienciaSegunMision() {
        return 0.0;
    }

    @Override
    public Boolean esDronAvanzadoParaEstaMision(Dron unDron) {
        return unDron.getAutonomia() > 50;
    }
    
    
}

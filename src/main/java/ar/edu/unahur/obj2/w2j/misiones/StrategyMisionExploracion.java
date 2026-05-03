package ar.edu.unahur.obj2.w2j.misiones;

import ar.edu.unahur.obj2.w2j.drones.Dron;

public class StrategyMisionExploracion implements IMision {

    public StrategyMisionExploracion() {
    }

//*************************************************************

//*************************************************************

    @Override
    public Double getEficienciaSegunMision() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean esDronAvanzadoParaEstaMision(Dron unDron) {
        return unDron.getEficienciaOperativa() % 2 == 0;
    }

    
}

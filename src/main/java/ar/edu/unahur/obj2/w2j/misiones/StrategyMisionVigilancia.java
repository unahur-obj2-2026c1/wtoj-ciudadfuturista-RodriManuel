package ar.edu.unahur.obj2.w2j.misiones;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.w2j.drones.Dron;

public class StrategyMisionVigilancia implements IMision {
    private List<Sensor> sensores;

    public StrategyMisionVigilancia() {
    
    }

    public StrategyMisionVigilancia(List<Sensor> sensores) {
        this.sensores = new ArrayList<>(sensores);
    }

//*************************************************************

//*************************************************************

    @Override
    public Double getEficienciaSegunMision() {
        return 100.0;
    }

    @Override
    public Boolean esDronAvanzadoParaEstaMision(Dron unDron) {
        return this.sensores.stream().allMatch(Sensor::esDuradero);
    }

    
}

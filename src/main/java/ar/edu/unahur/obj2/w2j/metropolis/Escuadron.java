package ar.edu.unahur.obj2.w2j.metropolis;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.w2j.drones.Dron;

public class Escuadron {
    private List<Dron> drones;

    public Escuadron(List<Dron> drones) {
        this.drones = new ArrayList<>(drones);
    }

//*************************************************************

    public List<Dron> getDrones() {
        return new ArrayList<>(this.drones);
    }

    public void sumarDronAlEscuadron(Dron dron) {
        if (Ciudad.getInstance().getDronesPermitidosPorEscuadron() < drones.size()) {
            this.drones.add(dron);
        }
    }

//*************************************************************

    public void operarZona(Zona zona) {
        zona.registrarOperacion();
        drones.stream().forEach(d -> d.reducirAutonomia(2));
    }
}

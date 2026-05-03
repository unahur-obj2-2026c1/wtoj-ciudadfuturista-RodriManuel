package ar.edu.unahur.obj2.w2j.misiones;

import ar.edu.unahur.obj2.w2j.drones.Dron;

public interface IMision {
    public Double getEficienciaSegunMision();
    public Boolean esDronAvanzadoParaEstaMision(Dron unDron);
}

package ar.edu.unahur.obj2.w2j.metropolis;

public class Zona {
    private Double tamannoDeZona;
    private Integer nroDeOperacionesRecibidas;
    
    public Zona(Double tamannoDeZona, Integer nroDeOperacionesRecibidas) {
        this.tamannoDeZona = tamannoDeZona;
        this.nroDeOperacionesRecibidas = nroDeOperacionesRecibidas;
    }

//*************************************************************

    public Double getTamannoDeZona() {
        return tamannoDeZona;
    }

    public Integer getNroDeOperacionesRecibidas() {
        return nroDeOperacionesRecibidas;
    }

    public void registrarOperacion() {
        this.nroDeOperacionesRecibidas += 1;
    }

//*************************************************************

}

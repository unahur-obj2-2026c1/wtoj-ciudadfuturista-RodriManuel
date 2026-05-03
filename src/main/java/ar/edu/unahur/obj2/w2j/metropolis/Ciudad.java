package ar.edu.unahur.obj2.w2j.metropolis;

public class Ciudad {
    private Integer dronesPermitidosPorEscuadron = 10;

    public Ciudad(Integer dronesPermitidosPorEscuadron) {
        this.dronesPermitidosPorEscuadron = dronesPermitidosPorEscuadron;
    }

//*************************************************************

    public Integer getDronesPermitidosPorEscuadron() {
        return dronesPermitidosPorEscuadron;
    }

    public void disminuirLimiteDeDronesPorEscuadron() {
        if (dronesPermitidosPorEscuadron > 1) {
            this.dronesPermitidosPorEscuadron -= 1;
        }
    }

    public void aumentarLimiteDeDronesPorEscuadron() {
        this.dronesPermitidosPorEscuadron += 1;
    }

//*************************************************************

    

}

package ar.edu.unahur.obj2.w2j.metropolis;

public class Ciudad {
    private static Ciudad instance = new Ciudad(10);
    private Integer dronesPermitidosPorEscuadron = 10;

    private Ciudad() {
    }

    private Ciudad(Integer dronesPermitidosPorEscuadron) {
        this.dronesPermitidosPorEscuadron = dronesPermitidosPorEscuadron;
    }

//*************************************************************

    public static Ciudad getInstance() {
        return instance;
    }

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

package ar.edu.unahur.obj2.w2j.misiones;

public class Sensor {
    private final Integer CAPACIDAD;
    private final Double DURABILIDAD;
    private final Boolean MEJORAS_TECNOLOGICAS;
    
    public Sensor(Integer cAPACIDAD, Double dURABILIDAD, Boolean mEJORAS_TECNOLOGICAS) {
        CAPACIDAD = cAPACIDAD;
        DURABILIDAD = dURABILIDAD;
        MEJORAS_TECNOLOGICAS = mEJORAS_TECNOLOGICAS;
    }

//*************************************************************

    public Integer getCapacidad() {
        return CAPACIDAD;
    }

    public Double getDurabilidad() {
        return DURABILIDAD;
    }

    public Boolean tieneMejorasTecnologicas() {
        return MEJORAS_TECNOLOGICAS;
    }

//*************************************************************    

    public Boolean esDuradero() {
        return DURABILIDAD > (CAPACIDAD * 2);
    }

}

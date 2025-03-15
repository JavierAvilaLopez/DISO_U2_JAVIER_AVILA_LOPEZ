package com.Unidad2_Actividad_Practica;

// Interfaz Strategy
interface DoctorStrategy {
    void inspectChildren();
}

// Estrategia específica del Dr. Fong
class FongDoctorStrategy implements DoctorStrategy {
    @Override
    public void inspectChildren() {
        System.out.println("FongDoctorStrategy: Inspeccionando a los niños...");
    }
}

// Estrategia específica del Dr. Wang
class WangDoctorStrategy implements DoctorStrategy {
    @Override
    public void inspectChildren() {
        System.out.println("WangDoctorStrategy: Inspeccionando a los niños...");
    }
}

// Contexto que maneja la estrategia del servicio
class KinderGardenServiceContext {
    private DoctorStrategy strategy;
    private KinderGardenServiceTemplate serviceTemplate;

    public KinderGardenServiceContext(DoctorStrategy strategy, KinderGardenServiceTemplate serviceTemplate) {
        this.strategy = strategy;
        this.serviceTemplate = serviceTemplate;
    }

    public void setServiceStrategy(DoctorStrategy strategy, KinderGardenServiceTemplate serviceTemplate) {
        this.strategy = strategy;
        this.serviceTemplate = serviceTemplate;
    }

    public void applyServiceStrategy() {
        strategy.inspectChildren();
        serviceTemplate.applyServiceStrategy();
    }
}

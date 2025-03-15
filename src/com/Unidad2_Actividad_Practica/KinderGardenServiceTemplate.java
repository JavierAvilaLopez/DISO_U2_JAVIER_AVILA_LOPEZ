package com.Unidad2_Actividad_Practica;

// Clase abstracta que define la estructura del servicio
abstract class KinderGardenServiceTemplate {

    public final void applyServiceStrategy() {
        inspectChildren();
        System.out.println("Finalizada la tarea de inspección");
        sendResultsInspection();
        sendInvoice();
    }

    protected abstract void inspectChildren(); // Método abstracto para que lo implementen los doctores

    protected final void sendResultsInspection() {
        System.out.println("Se han enviado los resultados de la inspección");
    }

    protected final void sendInvoice() {
        System.out.println("Se ha enviado la factura correspondiente al servicio");
    }
}

// Implementación específica para el Dr. Fong
class FongDoctorService extends KinderGardenServiceTemplate {
    @Override
    protected void inspectChildren() {
        System.out.println("FongDoctorService: Inspeccionando a los niños...");
    }
}

// Implementación específica para el Dr. Wang
class WangDoctorService extends KinderGardenServiceTemplate {
    @Override
    protected void inspectChildren() {
        System.out.println("WangDoctorService: Inspeccionando a los niños...");
    }
}


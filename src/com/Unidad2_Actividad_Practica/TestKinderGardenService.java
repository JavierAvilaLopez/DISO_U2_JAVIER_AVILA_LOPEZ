package com.Unidad2_Actividad_Practica;

public class TestKinderGardenService {
    public static void main(String[] args) {
        // Servicio con el Dr. Fong
        KinderGardenServiceContext kinderGardenContext = new KinderGardenServiceContext(
                new FongDoctorStrategy(), new FongDoctorService()
        );
        kinderGardenContext.applyServiceStrategy();

        System.out.println();

        // Cambiamos al Dr. Wang
        kinderGardenContext.setServiceStrategy(
                new WangDoctorStrategy(), new WangDoctorService()
        );
        kinderGardenContext.applyServiceStrategy();
    }
}

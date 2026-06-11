package mateorosas.nexoghsystem.Classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nombre;
    private String ubicacion;
    private String domicilio;
    private int pisos;
    private final List<Habitacion> habitaciones;
    private String zonaTuristica;
    private List<String> servicios;
    private LocalDate inicioOperaciones;

    public Hotel(LocalDate inicioOperaciones, String zonaTuristica, int pisos, List<String> servicios, String domicilio, String ubicacion, String nombre) {
        this.inicioOperaciones = inicioOperaciones;
        this.zonaTuristica = zonaTuristica;
        this.pisos = pisos;
        this.servicios = servicios;
        this.domicilio = domicilio;
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public String getZonaTuristica() {
        return zonaTuristica;
    }

    public void setZonaTuristica(String zonaTuristica) {
        this.zonaTuristica = zonaTuristica;
    }

    public List<String> getServicios() {
        return servicios;
    }

    public void setServicios(List<String> servicios) {
        this.servicios = servicios;
    }

    public LocalDate getInicioOperaciones() {
        return inicioOperaciones;
    }

    public void setInicioOperaciones(LocalDate inicioOperaciones) {
        this.inicioOperaciones = inicioOperaciones;
    }
    public List<Habitacion> obtenerHabitaciones(){
        return this.habitaciones;
    }
}

package mateorosas.nexoghsystem.Classes;

import mateorosas.nexoghsystem.Classes.enums.NivelHabitacion;
import mateorosas.nexoghsystem.Classes.enums.TipoCama;
import java.util.List;

public class Habitacion {
    private String hotel;
    private int numerCamas;
    private TipoCama tipo;
    private int cantPersonas;
    private NivelHabitacion nivel;
    private String locacion;
    private List<String> amenidades;
    private boolean disponible;

    public Habitacion(String hotel, int numerCamas, TipoCama tipo, int cantPersonas, NivelHabitacion nivel, String locacion, List<String> amenidades) {
        this.hotel = hotel;
        this.numerCamas = numerCamas;
        this.tipo = tipo;
        this.cantPersonas = cantPersonas;
        this.nivel = nivel;
        this.locacion = locacion;
        this.amenidades = amenidades;
        this.disponible = true;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public int getNumerCamas() {
        return numerCamas;
    }

    public void setNumerCamas(int numerCamas) {
        this.numerCamas = numerCamas;
    }

    public TipoCama getTipo() {
        return tipo;
    }

    public void setTipo(TipoCama tipo) {
        this.tipo = tipo;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public NivelHabitacion getNivel() {
        return nivel;
    }

    public void setNivel(NivelHabitacion nivel) {
        this.nivel = nivel;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    public List<String> getAmenidades() {
        return amenidades;
    }

    public void setAmenidades(List<String> amenidades) {
        this.amenidades = amenidades;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

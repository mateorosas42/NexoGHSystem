package mateorosas.nexoghsystem.Classes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String ubicacion;
    private String rfc;
    private String correo;
    private String telCasa;
    private String telCelular;
    private LocalDateTime nacimiento;
    private final List<Reservacion> historial;

    public Cliente(String nombre, String ubicacion, String rfc, String correo, String telCasa, String tel_celular, LocalDateTime nacimiento) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.rfc = rfc;
        this.correo = correo;
        this.telCasa = telCasa;
        this.telCelular = tel_celular;
        this.nacimiento = nacimiento;
        this.historial = new ArrayList<>();
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

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelCasa() {
        return telCasa;
    }

    public void setTelCasa(String telCasa) {
        this.telCasa = telCasa;
    }

    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    public LocalDateTime getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDateTime nacimiento) {
        this.nacimiento = nacimiento;
    }

    public List<Reservacion> getHistorial() {
        return historial;
    }
}

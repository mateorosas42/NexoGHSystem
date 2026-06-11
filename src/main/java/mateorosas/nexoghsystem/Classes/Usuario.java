package mateorosas.nexoghsystem.Classes;

import mateorosas.nexoghsystem.Classes.enums.TipoUsuario;

import java.time.LocalDate;

public class Usuario {
    private String correo;
    private String pass;
    private String nombreCompleto;
    private long numNomina;
    private LocalDate nacimiento;
    private String telCasa;
    private String telCelular;
    private TipoUsuario tipo;

    public Usuario(String correo, String pass, String nombreCompleto, long numNomina, LocalDate nacimiento, String telCasa, String telCelular, TipoUsuario tipo) {
        this.correo = correo;
        this.pass = pass;
        this.nombreCompleto = nombreCompleto;
        this.numNomina = numNomina;
        this.nacimiento = nacimiento;
        this.telCasa = telCasa;
        this.telCelular = telCelular;
        this.tipo = tipo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getNumNomina() {
        return numNomina;
    }

    public void setNumNomina(long numNomina) {
        this.numNomina = numNomina;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
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

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }
}

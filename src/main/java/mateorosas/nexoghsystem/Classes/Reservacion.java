package mateorosas.nexoghsystem.Classes;

import java.time.LocalDateTime;

public class Reservacion {
    private Cliente cliente;
    private LocalDateTime fechaLlegada;
    private LocalDateTime fechaSalida;
    private Habitacion habitacion;
    private boolean checkIn;
    private boolean checkOut;
    private boolean vigente;

    public Reservacion(Cliente cliente, LocalDateTime fechaLlegada, LocalDateTime fechaSalida, Habitacion habitacion) {
        this.cliente = cliente;
        this.fechaLlegada = fechaLlegada;
        this.fechaSalida = fechaSalida;
        this.habitacion = habitacion;
        this.vigente = false;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalDateTime fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public boolean isCheckIn() {
        return checkIn;
    }

    public void setCheckIn(boolean checkIn) {
        this.checkIn = checkIn;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }
}

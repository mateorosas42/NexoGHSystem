package mateorosas.nexoghsystem.Classes.records;

import mateorosas.nexoghsystem.Classes.Usuario;
import mateorosas.nexoghsystem.Classes.enums.TipoReporte;

import java.time.LocalDateTime;

public record Reporte(Usuario usuario, LocalDateTime sucedio, TipoReporte tipo, String descripcion) {
}

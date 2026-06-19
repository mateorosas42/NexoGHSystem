package mateorosas.nexoghsystem;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

public class ErrorScene extends Scene {

    private static final double DEFAULT_WIDTH  = 600;
    private static final double DEFAULT_HEIGHT = 400;

    // ── Constructor principal ──────────────────────────────────────────────────
    public ErrorScene() {
        this(DEFAULT_WIDTH, DEFAULT_HEIGHT, null, null);
    }

    public ErrorScene(double width, double height) {
        this(width, height, null, null);
    }

    /**
     * @param width         Ancho de la escena.
     * @param height        Alto de la escena.
     * @param onRetry       Acción al pulsar "Reintentar" (puede ser null).
     * @param onClose       Acción al pulsar "Cerrar" (puede ser null).
     */
    public ErrorScene(double width, double height, Runnable onRetry, Runnable onClose) {
        super(buildRoot(onRetry, onClose), width, height);
        getStylesheets().add(ErrorScene.class.getResource("error-scene.css").toExternalForm());
    }
    private static StackPane buildRoot(Runnable onRetry, Runnable onClose) {

        // Icono de advertencia dentro de un círculo
        Label iconLabel = new Label("⚠");
        iconLabel.getStyleClass().add("error-icon-label");

        Circle iconCircle = new Circle(36);
        iconCircle.getStyleClass().add("error-icon-circle");

        StackPane iconPane = new StackPane(iconCircle, iconLabel);
        iconPane.setMaxSize(72, 72);

        // Subtítulo pequeño en mayúsculas
        Label category = new Label("ERROR DE CARGA");
        category.getStyleClass().add("error-category");

        // Título principal
        Label title = new Label("No se pudo cargar la vista");
        title.getStyleClass().add("error-title");
        title.setWrapText(true);
        title.setTextAlignment(TextAlignment.CENTER);

        // Descripción
        Label description = new Label("Comuníquese con un desarrollador\npara resolver este problema.");
        description.getStyleClass().add("error-description");
        description.setWrapText(true);
        description.setTextAlignment(TextAlignment.CENTER);

        // Botones
        Button retryButton = new Button("Reintentar");
        retryButton.getStyleClass().add("error-btn-retry");
        retryButton.setOnAction(e -> { if (onRetry != null) onRetry.run(); });

        Button closeButton = new Button("Cerrar");
        closeButton.getStyleClass().add("error-btn-close");
        closeButton.setOnAction(e -> { if (onClose != null) onClose.run(); });

        HBox buttons = new HBox(12, retryButton, closeButton);
        buttons.setAlignment(Pos.CENTER);

        // Tarjeta central
        VBox card = new VBox(16, iconPane, category, title, description, buttons);
        card.setAlignment(Pos.CENTER);
        card.getStyleClass().add("error-card");
        card.setMaxWidth(440);

        // Fondo
        StackPane root = new StackPane(card);
        root.getStyleClass().add("error-root");

        return root;
    }
}
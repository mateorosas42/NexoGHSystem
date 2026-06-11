module mateorosas.nexoghsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;

    opens mateorosas.nexoghsystem to javafx.fxml;
    exports mateorosas.nexoghsystem;
}
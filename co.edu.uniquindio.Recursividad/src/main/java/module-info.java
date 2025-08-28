module co.edu.uniquindio.recursividad.ejercicios {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.recursividad.ejercicios to javafx.fxml;
    exports co.edu.uniquindio.recursividad.ejercicios;
}
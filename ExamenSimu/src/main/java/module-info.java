module ni.edu.uni.fcys.programacion2.examensimu {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires java.base;

    opens ni.edu.uni.fcys.programacion2.examensimu to javafx.fxml;
    exports ni.edu.uni.fcys.programacion2.examensimu;
    exports ni.edu.uni.fcys.programacion2.examensimu.controller;
}

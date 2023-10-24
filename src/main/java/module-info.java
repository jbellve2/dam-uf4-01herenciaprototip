module vicent.bellver.herenciaexemple {
    requires javafx.controls;
    requires javafx.fxml;
   // requires Fitxers;


    opens vicent.bellver.herenciaexemple to javafx.fxml;
    exports vicent.bellver.herenciaexemple;
    opens vicent.bellver.herenciaexemple.controladors to javafx.fxml;

}
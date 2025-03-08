package controllers;

import components.SampleWidget;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class DashboardController {
    @FXML
    private Pane widgetPane1;

    public void initialize() {
        SampleWidget sampleWidget = new SampleWidget();
        widgetPane1.getChildren().add(sampleWidget);
    }
}

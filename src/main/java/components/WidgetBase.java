package components;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class WidgetBase extends BorderPane {
    protected Label titleLabel;
    protected Button refreshButton;

    public WidgetBase(String title) {
        HBox topBar = new HBox();
        titleLabel = new Label(title);
        refreshButton = new Button("Refresh");
        topBar.getChildren().addAll(titleLabel, refreshButton);
        setTop(topBar);

        setCenter(new Label("Content goes here"));
    }

    public void refresh() {
    }
}
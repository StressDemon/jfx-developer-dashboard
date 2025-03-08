package components;

import javafx.scene.control.Label;

public class SampleWidget extends WidgetBase{
    public SampleWidget() {
        super("Sample Widget");
        setCenter(new Label("This is a sample widget"));
    }

    @Override
    public void refresh() {
    }
}

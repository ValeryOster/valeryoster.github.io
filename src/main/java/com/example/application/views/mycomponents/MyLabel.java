package com.example.application.views.mycomponents;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Synchronize;
import com.vaadin.flow.component.Tag;

@Tag("my-label")
public class MyLabel extends Component {
    public void setText(String text) {
        getElement().setText(text);
    }

    public String getText() {
        return getElement().getText();
    }
    @Synchronize("change")
    public String getValue() {
        return getElement().getProperty("value");
    }
    public void setValue(String value) {
        getElement().setProperty("value", value);
    }
}
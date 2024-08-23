package com.example.application.views.empty;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Test Vaadin Feature")
@Route(value = "", layout = MainLayout.class)
@RouteAlias(value = "")
public class MainView extends VerticalLayout {

    public MainView() {


        Button button = new Button("Click me",
                event -> Notification.show("Clicked!"));
        add(button);
    }

}

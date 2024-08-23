package com.example.application.views.empty;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;
import java.util.List;

@Route(value = "data", layout = MainLayout.class)
public class DataView extends VerticalLayout {
    private List<Person> people = new ArrayList<>();
    private Grid<Person> grid = new Grid<>(Person.class);
    private ListDataProvider<Person> dataProvider = new ListDataProvider<>(people);
    public DataView() {
        TextField firstNameField = new TextField("First Name");
        TextField lastNameField = new TextField("Last Name");
        Button addButton = new Button("Add Person",
                event -> {
                    people.add(
                            new Person(firstNameField.getValue(),
                                    lastNameField.getValue()));
                    dataProvider.refreshAll();
                });
        grid.setDataProvider(dataProvider);
        grid.setColumns("firstName", "lastName");
        add(firstNameField, lastNameField, addButton, grid);
    }
}

package com.example.application.views;

import com.example.application.views.empty.DataView;
import com.example.application.views.empty.MainView;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.RouterLink;


public class MainLayout extends AppLayout {
 public MainLayout() {
   createHeader();
 }
 private void createHeader() {
   RouterLink mainLink = new RouterLink("Hello World", MainView.class);
   RouterLink dataLink = new RouterLink("Data View", DataView.class);
   addToNavbar(new HorizontalLayout(mainLink, dataLink));

     setPrimarySection(Section.DRAWER);
     Image img = new Image("https://i.imgur.com/GPpnszs.png", "Vaadin Logo");
     img.setHeight("44px");
     addToNavbar(new DrawerToggle(), img);
     Tabs tabs = new Tabs(new Tab("Home"),
             new Tab("About"));
     tabs.setOrientation(Tabs.Orientation.VERTICAL);
     addToDrawer(tabs);
 }
}
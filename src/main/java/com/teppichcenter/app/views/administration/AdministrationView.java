package com.teppichcenter.app.views.administration;

import com.teppichcenter.app.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import jakarta.annotation.security.RolesAllowed;

@PageTitle("Administration")
@Route(value = "administration", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@RolesAllowed("ADMIN")
@Uses(Icon.class)
public class AdministrationView extends Composite<VerticalLayout> {

    public AdministrationView() {
        TabSheet tabSheet = new TabSheet();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        tabSheet.setWidth("100%");
        setTabSheetSampleData(tabSheet);
        getContent().add(tabSheet);
    }

    private void setTabSheetSampleData(TabSheet tabSheet) {
        tabSheet.add("Lagerverwaltung", new Div(new Text("This is the Dashboard tab content")));
        tabSheet.add("Benutzerverwaltung", new Div(new Text("This is the Payment tab content")));
        tabSheet.add("Produktverwaltung", new Div(new Text("This is the Shipping tab content")));
        tabSheet.add("Design", new Div(new Text("This is the Shipping tab content")));
    }
}

package com.vaadin.tests.components.flash;

import com.vaadin.server.ClassResource;
import com.vaadin.tests.components.TestBase;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Flash;

public class FlashExpansion extends TestBase {

    Flash player = new Flash();

    @Override
    protected void setup() {

        player.setWidth("400px");
        player.setHeight("300px");
        player.setSource(new ClassResource("simple.swf"));
        addComponent(player);
        Button button = new Button("click");
        button.addClickListener(new Button.ClickListener() {

            @Override
            public void buttonClick(ClickEvent event) {
                player.setSizeFull();

            }
        });
        addComponent(button);
    }

    @Override
    protected String getDescription() {
        return "Flash object should expand according to percentile sizes";
    }

    @Override
    protected Integer getTicketNumber() {
        // TODO Auto-generated method stub
        return null;
    }

}

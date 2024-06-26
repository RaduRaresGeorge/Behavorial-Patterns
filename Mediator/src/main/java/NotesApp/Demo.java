package src.main.java.NotesApp;

import src.main.java.NotesApp.components.*;
import src.main.java.NotesApp.mediator.Mediator;
import src.main.java.NotesApp.mediator.Editor;

import javax.swing.*;

/**
 * src.main.java.NotesApp.src.main.java.EventSubscription.src.main.java.IMediaPlayer.src.main.java.PaymentMethod.Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
package src.main.java.NotesApp.components;

import src.main.java.NotesApp.mediator.Mediator;

/**
 * Common component interface.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
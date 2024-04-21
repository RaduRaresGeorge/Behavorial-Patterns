package src.main.java.EventSubscription.listeners;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
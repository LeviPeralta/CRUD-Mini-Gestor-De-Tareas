package org.example;


import javafx.beans.property.*;
import javafx.scene.layout.Priority;

import java.time.LocalDate;

public class Task {
    private final IntegerProperty id = new SimpleIntegerProperty(this, "id");
    private final StringProperty title = new SimpleStringProperty(this, "title", "");
    private final StringProperty description = new SimpleStringProperty(this, "description", "");
    private final ObjectProperty<Priority> priority = new SimpleObjectProperty<>(this, "priority", Priority.MEDIA);
    private final ObjectProperty<LocalDate> dueDate = new SimpleObjectProperty<>(this, "dueDate");

    public Task(int id, String title, String description, Priority priority, LocalDate dueDate) {
        setId(id);
        setTitle(title);
        setDescription(description);
        setPriority(priority);
        setDueDate(dueDate);
    }

    public int getId() { return id.get(); }
    public IntegerProperty idProperty() { return id; }
    public void setId(int value) { id.set(value); }

    public String getTitle() { return title.get(); }
    public StringProperty titleProperty() { return title; }
    public void setTitle(String value) { title.set(value); }

    public String getDescription() { return description.get(); }
    public StringProperty descriptionProperty() { return description; }
    public void setDescription(String value) { description.set(value); }

    public Priority getPriority() { return priority.get(); }
    public ObjectProperty<Priority> priorityProperty() { return priority; }
    public void setPriority(Priority value) { priority.set(value); }

    public LocalDate getDueDate() { return dueDate.get(); }
    public ObjectProperty<LocalDate> dueDateProperty() { return dueDate; }
    public void setDueDate(LocalDate value) { dueDate.set(value); }
}
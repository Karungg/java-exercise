package com.todo;

public class Task {
    private int id;
    private String description;
    private boolean done;

    // Constructor
    public Task(int id, String description, boolean done) {
        this.id = id;
        this.description = description;
        this.done = done;
    }

    // Getter dan Setter untuk id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter dan Setter untuk description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getter dan Setter untuk done
    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return (done ? "[X] " : "[ ] ") + description;
    }
}

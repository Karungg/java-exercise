public class Task {
    private String description;
    private boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public void markAsDone()
    {
        this.isDone = true;
    }

    public String toString()
    {
        return (isDone ? "[X] " : "[ ] ") + description;
    }
}
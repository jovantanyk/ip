package main.java;

public class EventTask extends Task {
    private String startDate;
    private String endDate;
    public EventTask(String description, String startDate, String endDate) {
        super(description);
        this.startDate = startDate;
        this.endDate = endDate;

    }

    @Override
    public String getTask() {
        if (isDone) {
            return "[E][X] " + this.description + " (from: " + startDate + ", to: " + this.endDate + ")";
        } else {
            return "[E][ ] " + this.description + " (from: " + startDate + ", to: " + this.endDate + ")";
        }
    }
    @Override
    public String toFileString() {
        if (this.isDone) {
            return "E | 1 | " + this.description + " | "  + this.startDate + " | " + this.endDate;
        } else {
            return "E | 0 | " + this.description + " | "  + this.startDate + " | " + this.endDate;
        }
    }
}

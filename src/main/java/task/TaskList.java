package main.java.task;

import main.java.FileHandler;

import java.util.ArrayList;

public class TaskList {
    private final ArrayList<Task> list = new ArrayList<Task>();

    public TaskList() {

    }

    public Task getTask(int index) {
        return this.list.get(index);
    }

    public int getSize() {
        return this.list.size();
    }

    public void addTask(Task task) {
        this.list.add(task);
        FileHandler.saveTaskList(this);
    }

    public void deleteTask(int index) {
        this.list.remove(index);
        FileHandler.saveTaskList(this);
    }

    public boolean markTask(int index, boolean isDone) {
        Task task = this.list.get(index);
        if (task.isDone == isDone) {
            return false;
        } else {
            task.setTaskState(isDone);
            FileHandler.saveTaskList(this);
            return true;
        }
    }
    public String toString() {
        int size = this.list.size();
        String returnString = "";
        if (size == 0) {
            return returnString;
        }
        for (int i = 0; i < size; i++) {
            String current = String.valueOf(i + 1);
            if (i == size - 1) {
                returnString = returnString + current + ": " + this.list.get(i).getTask();
            } else {
                returnString = returnString + current + ": " + this.list.get(i).getTask() + "\n";
            }
        }
        return returnString;
    }
}

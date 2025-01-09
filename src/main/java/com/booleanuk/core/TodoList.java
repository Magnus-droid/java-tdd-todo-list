package com.booleanuk.core;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TodoList {

    ArrayList<Task> tasks = new ArrayList<>();


    public boolean add(Task task) {
        if (!tasks.contains(task)) {
            tasks.add(task);
            return true;
        }
        return false;
    }

    public ArrayList<Task> viewTasks() {
        return tasks;
    }

    public ArrayList<Task> viewIncompleteTasks() {
        ArrayList<Task> incomplete = new ArrayList<>();
        for (Task task : this.tasks) {
            if (!task.complete) {
                incomplete.add(task);
            }
        }
        return incomplete;
    }

    public ArrayList<Task> viewCompleteTasks() {
        ArrayList<Task> complete = new ArrayList<>();
        for (Task task : this.tasks) {
            if (task.complete) {
                complete.add(task);
            }
        }
        return complete;
    }

    Task searchTask(Task task) {
        if(tasks.contains(task)) {
            return task;
        }
        System.out.println("Task not found!");
        return null;
    }

}

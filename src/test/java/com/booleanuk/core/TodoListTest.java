package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

class TodoListTest {
    @Test
    public void checkForTaskInList() {
        Task task = new Task("Test");
        TodoList todo = new TodoList();
        Assertions.assertTrue(todo.add(task));
        Assertions.assertFalse(todo.add(task));

    }

    @Test
    public void checkViewTask() {
        Task task = new Task("Test");
        TodoList todo = new TodoList();
        ArrayList<Task> empty = new ArrayList<>();
        Assertions.assertIterableEquals(empty, todo.viewTasks());
        todo.add(task);
        empty.add(task);
        Assertions.assertIterableEquals(empty, todo.viewTasks());

    }

    @Test
    public void checkIncompleteTaskView() {
        TodoList todo = new TodoList();
        Task taskIncomplete = new Task("Task incomplete");
        Task taskComplete = new Task("Task complete");
        taskComplete.changeStatus(true);
        todo.add(taskIncomplete);
        todo.add(taskComplete);
        Assertions.assertNotEquals(todo.viewTasks(), todo.viewIncompleteTasks());
    }

    @Test
    public void checkCompleteTaskView() {
        TodoList todo = new TodoList();
        Task taskIncomplete = new Task("Task incomplete");
        Task taskComplete = new Task("Task complete");
        taskComplete.changeStatus(true);
        todo.add(taskIncomplete);
        todo.add(taskComplete);
        Assertions.assertNotEquals(todo.viewTasks(), todo.viewCompleteTasks());
    }

    @Test
    public void testSearchTaskName() {
        TodoList todo = new TodoList();
        Task example = new Task("Example");

        Assertions.assertNotEquals(example, todo.searchTask(example));
        todo.add(example);

        Assertions.assertEquals(example, todo.searchTask(example));

    }

    @Test
    public void testRemoveTask() {
        TodoList todo = new TodoList();
        Task example = new Task("Example");
        Task example2 = new Task("Example2");
        todo.add(example);
        ArrayList<Task> tasks = todo.viewTasks();
        todo.removeTask(example2);
        Assertions.assertEquals(tasks, todo.viewTasks());

        todo.add(example2);
        tasks = todo.viewTasks();
        todo.removeTask(example2);
        Assertions.assertNotEquals(todo.viewTasks(), tasks);

    }

    @Test
    public void testAscending() {
        TodoList todo = new TodoList();
        Task a = new Task("A");
        Task z = new Task("Zebra");
        Task f = new Task("Fair");

        todo.add(a);
        todo.add(f);
        todo.add(z);

        Assertions.assertEquals(todo.viewTasks(), todo.alphabeticallyAscView());


    }

}

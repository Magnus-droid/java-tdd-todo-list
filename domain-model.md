
 # TodoList class
 
| Members                | Methods                                   | Scenarios                        | Result                      |
|------------------------|-------------------------------------------|----------------------------------|-----------------------------|
| ArrayList\<Task> tasks | boolean add(Task task)                    | Task is already in list          | False                       |
|                        |                                           | Task is not in list              | True                        |
|                        | ArrayList\<Task> viewTasks()              |                                  | Return entire todo list     |
|                        | ArrayList\<Task> viewIncompleteTasks()    |                                  | Return incomplete task list |
|                        | ArrayList\<Task> viewCompleteTasks()      |                                  | Return complete task list   |
|                        | Task searchTask(Task task)                | Task not found                   | Return null + error message |
|                        |                                           | Task found                       | Return task                 |
|                        | void removeTask(Task task)                | Task to be removed doesn't exist | Do nothing                  |
|                        |                                           | Task to be removed exists        | Remove task from todo list  |
|                        | ArrayList\<Task> alphabeticallyAscView()  |                                  | Return sorted todo list     |
|                        | ArrayList\<Task> alphabeticallyDescView() |                                  | Return sorted todo list     |

# Task class

| Members          | Methods                           | Scenarios       | Result                        |
|------------------|-----------------------------------|-----------------|-------------------------------|
| boolean complete | void changeStatus(boolean status) | status is true  | Member complete becomes true  |
| String name      |                                   | status is false | Member complete becomes false |

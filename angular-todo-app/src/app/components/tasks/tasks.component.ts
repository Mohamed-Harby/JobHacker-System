import { Component } from '@angular/core';
import { Task } from 'src/app/Task';
import { TASKS } from 'src/app/mock-tasks';

@Component({
  selector: 'app-tasks',
  templateUrl: './tasks.component.html',
  styleUrls: ['./tasks.component.css']
})
export class TasksComponent {
  tasks: Task[] = TASKS;
  newTaskText: string = '';
  
  deleteTask(taskToDelete: Task): void {
    this.tasks = this.tasks.filter(task => task !== taskToDelete);
  }

  addTask(): void {
    if (this.newTaskText.trim()) {
      const newTask: Task = {
        id: this.tasks.length + 1,
        text: this.newTaskText
      };
      this.tasks.push(newTask);
      this.newTaskText = '';
    }
  }
}

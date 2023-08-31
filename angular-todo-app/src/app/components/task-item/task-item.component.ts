import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Task } from 'src/app/Task';

@Component({
  selector: 'app-task-item',
  templateUrl: './task-item.component.html',
  styleUrls: ['./task-item.component.css']
})
export class TaskItemComponent {
  @Input () task: Task;
  @Output() taskFinished: EventEmitter<Task> = new EventEmitter<Task>();
  
  onDeleteTaskClick(task: Task): void {
    this.taskFinished.emit(task);
  }
  constructor() {
    this.task = {
      id: 0,
      text: 'Empty task',
    }
  }
}

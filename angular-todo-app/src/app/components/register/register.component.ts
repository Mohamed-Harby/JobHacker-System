import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
  username: string = '';
  password: string = '';

  constructor(private router: Router) {}

  login (): void {
    this.router.navigate(['/login']);
  }
  register(): void {
    this.router.navigate(['/tasks']);
  }
}

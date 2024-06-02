import { Component } from '@angular/core';
import { AuthService } from '../../services/auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  username: string;
  password: string;

  constructor(private authService: AuthService, private router: Router) {}

  onSubmit(): void {
    this.authService.login(this.username, this.password).subscribe(data => {
      localStorage.setItem('token', data.token);
      if(data.role === 'ADMIN') {
        this.router.navigate(['/admin']);
      }
      else if(data.role === 'USER') {
        this.router.navigate(['/user']);
      }
    });
  }
}

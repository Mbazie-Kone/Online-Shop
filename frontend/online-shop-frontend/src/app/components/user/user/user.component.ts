import { Component, OnInit } from '@angular/core';
import { UserService } from '../../../services/user/user.service';
import { User } from '../../../classes/user';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrl: './user.component.css'
})
export class UserComponent implements OnInit {

  users: User[];

  constructor(private userService: UserService) {}

  ngOnInit(): void {
   this.getUsers();
  }

  getUsers(): void {
   this.userService.getUsers().subscribe(users => this.users = users);
  }

  addUser(name: string): void {
    this.userService.addUser({ name } as User)
      .subscribe(user => {
        this.users.push(user);
      });
  }

}
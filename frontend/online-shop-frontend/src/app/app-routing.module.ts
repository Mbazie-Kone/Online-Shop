import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { AdminDashboardComponent } from './components/admin-dashboard/admin-dashboard.component';
import { UserDashboardComponent } from './components/user-dashboard/user-dashboard.component';
import { AuthGuard } from './services/permissions.service';

const routes: Routes = [
  {path: 'login', component: LoginComponent },
  {path: 'admin', component: AdminDashboardComponent, canActivate: [AuthGuard], data: {roles: ['ADMIN'] } },
  {path: 'user', component: UserDashboardComponent, canActivate: [AuthGuard], data: { roles: ['USER'] } },
  {path: '', redirectTo: '/login', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

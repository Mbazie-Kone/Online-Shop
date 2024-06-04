import { Injectable, inject } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivateFn, Router, RouterStateSnapshot } from '@angular/router';
import { AuthService } from './auth.service';

@Injectable({
  providedIn: 'root'
})
export class PermissionsService {

  constructor(private authService: AuthService, private router: Router) { }

  canActive(next: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean {

    const currentUser = this.authService.isLoggedIn();
    if(currentUser) {
      const roles = route.data['roles'] as Array<string>;
      if(roles && roles.indexOf(currentUser.role) === -1) {
        this.router.navigate(['/login']);
        return false;
      }
      return true;
    }
    this.router.navigate(['/login']);
    return false;
  }
}

export const AuthGuard: CanActivateFn = (next: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean => {
  return inject(PermissionsService).canActive(next,state);
}

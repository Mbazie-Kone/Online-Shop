import { Injectable, inject } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivateFn, Router, RouterStateSnapshot } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class PermissionsService {

  constructor(private router: Router) { }

  canActive(next: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean {

  }
}

export const AuthGuard: CanActivateFn = (next: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean => {
  return inject(PermissionsService).canActive(next,state);
}

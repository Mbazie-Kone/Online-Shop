import { Component, OnInit } from '@angular/core';
import { ProductsService } from '../../services/products.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrl: './products.component.css'
})
export class ProductsComponent implements OnInit {

  products: any[] = [];

  constructor(private productsService: ProductsService) {}

  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

}

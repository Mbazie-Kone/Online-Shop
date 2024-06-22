import { Component, OnInit } from '@angular/core';
import { ProductsService } from '../../services/products.service';
import { Product } from '../../models/product';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrl: './products.component.css'
})
export class ProductsComponent implements OnInit {

  products: Product[] = [];

  constructor(private productsService: ProductsService) {}

  ngOnInit() {
   this.productsService.getProducts().subscribe (
    data => {
      console.log(data);
      this.products = data;
    }, error => {
      console.error('Errors!:', error)
    }
  );
  }

}

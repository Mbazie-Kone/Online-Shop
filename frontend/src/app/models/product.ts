export class Product {
    constructor(
        public id: number,
        public averageRating: number,
        public description: string,
        public image: string,
        public name: string,
        public price: number,
        public reviewCount: number,
        public stockQuantity: number,
     ) { }
}
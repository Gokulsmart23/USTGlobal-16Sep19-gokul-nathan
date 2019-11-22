import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  name = 'Mikel';
  imgUrl = 'https://cdn.pixabay.com/photo/2019/08/23/01/28/mountain-4424657__340.jpg';
  address = 'Gandhi Nagar, Hosur-635 109';
  colorName = 'blue';
  isActive: boolean = false;
  colsSpanValue: number = 2;

  constructor() {}

  ngOnInit() {
    setInterval(() => {
      this.colorName = 'white';
      this.isActive = ! this.isActive;
    } , 2000);
  }

}

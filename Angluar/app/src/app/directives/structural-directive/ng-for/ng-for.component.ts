import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
  Products = [
        {img : 'https://cdn.pixabay.com/photo/2019/09/28/12/41/ford-mustang-4510677__340.jpg',
      name : 'Speedo meter',
    price : 200},
    {img : 'https://cdn.pixabay.com/photo/2019/09/28/03/54/sunflower-4509760__340.jpg',
    name : 'Sunflower',
  price : 100},
  {img : 'https://cdn.pixabay.com/photo/2019/09/28/12/41/porsche-4510684__340.jpg',
  name : 'Car',
price : 2000}
  ]
  constructor() { }

  ngOnInit() {
  }

}

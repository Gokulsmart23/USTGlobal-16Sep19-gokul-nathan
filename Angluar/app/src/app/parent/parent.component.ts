import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  selectedCar;
  Cars = [
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2016/04/01/12/16/car-1300629__340.png',
      name : 'car1'
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2014/09/07/22/34/car-race-438467__340.jpg',
      name : 'car2'
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2016/11/22/23/44/buildings-1851246__340.jpg',
      name : 'car3'
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg',
      name : 'car4'
    }
  ];

  constructor() { }

  ngOnInit() {
  }

  sendCar(car) {
    console.log(car);
    this.selectedCar = car;
  }
}

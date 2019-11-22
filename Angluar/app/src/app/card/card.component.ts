import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {
  imageUrl: string = 'https://cdn.pixabay.com/photo/2019/09/29/20/00/squirrel-4514238__340.jpg';
  constructor() { }

  ngOnInit() {
  }

}

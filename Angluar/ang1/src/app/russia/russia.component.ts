import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-russia',
  templateUrl: './russia.component.html',
  styleUrls: ['./russia.component.css']
})
export class RussiaComponent implements OnInit {

  news :any;
  constructor(private http: HttpClient) {
    this.getNews();
   }

  ngOnInit() {
  }
  getNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=ru&category=general&apiKey=1ddbfcd89a7748d88925e53cec5b8d4c').subscribe((data) => {
      this.news = data.articles;

    }, err => {
      console.log(err);
    }, () => {
      console.log('news got sucessfully');
    });
  }


}

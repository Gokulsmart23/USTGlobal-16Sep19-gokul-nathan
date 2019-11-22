import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  news: any;
  constructor(private http: HttpClient) {
    this.getNews();
   }

  ngOnInit() {
  }

  getNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=general&apiKey=1ddbfcd89a7748d88925e53cec5b8d4c').subscribe((data) => {
      this.news = data.articles;

    }, err => {
      console.log(err);
    }, () => {
      console.log('news got sucessfully');
    });
  }

}

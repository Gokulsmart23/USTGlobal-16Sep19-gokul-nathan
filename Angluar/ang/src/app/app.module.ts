import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { CarsComponent } from './cars/cars.component';
import { CarsChildComponent } from './cars/cars-child/cars-child.component';
import { BikeParentComponent } from './bike-parent/bike-parent.component';
import { BikeChildComponent } from './bike-child/bike-child.component';
import { MoviesChildComponent } from './movies-child/movies-child.component';
import { MoviesParentComponent } from './movies-parent/movies-parent.component';
import { LaptopParentComponent } from './laptop-parent/laptop-parent.component';
import { MobileParentComponent } from './mobile-parent/mobile-parent.component';
import { LaptopChildComponent } from './laptop-child/laptop-child.component';
import { MobileChildComponent } from './mobile-child/mobile-child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    CarsComponent,
    CarsChildComponent,
    BikeParentComponent,
    BikeChildComponent,
    MoviesParentComponent,
    MoviesChildComponent,
    LaptopParentComponent,
    LaptopChildComponent,
    MobileParentComponent,
    MobileChildComponent,
    CommentComponent,
    CommentDetailsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot([
      {path : 'home' , component : HomeComponent},
      {path : 'cars' , component : CarsComponent},
      {path : 'bikes' , component : BikeParentComponent},
      {path : 'movies' , component : MoviesParentComponent},
      {path : 'laptop' , component : LaptopParentComponent},
      {path : 'mobile' , component : MobileParentComponent},
      {path : 'comment-details' , component : CommentDetailsComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

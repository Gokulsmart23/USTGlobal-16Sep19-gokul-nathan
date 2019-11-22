import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EntertainmentHomeComponent } from './entertainment-home.component';

describe('EntertainmentHomeComponent', () => {
  let component: EntertainmentHomeComponent;
  let fixture: ComponentFixture<EntertainmentHomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EntertainmentHomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EntertainmentHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

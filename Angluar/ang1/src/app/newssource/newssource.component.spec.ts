import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewssourceComponent } from './newssource.component';

describe('NewssourceComponent', () => {
  let component: NewssourceComponent;
  let fixture: ComponentFixture<NewssourceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewssourceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewssourceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

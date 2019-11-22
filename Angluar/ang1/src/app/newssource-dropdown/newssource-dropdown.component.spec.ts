import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewssourceDropdownComponent } from './newssource-dropdown.component';

describe('NewssourceDropdownComponent', () => {
  let component: NewssourceDropdownComponent;
  let fixture: ComponentFixture<NewssourceDropdownComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewssourceDropdownComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewssourceDropdownComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

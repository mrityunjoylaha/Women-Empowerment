import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailsRegistrationComponent } from './details-registration.component';

describe('DetailsRegistrationComponent', () => {
  let component: DetailsRegistrationComponent;
  let fixture: ComponentFixture<DetailsRegistrationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DetailsRegistrationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DetailsRegistrationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

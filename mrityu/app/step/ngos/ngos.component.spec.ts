import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NgosComponent } from './ngos.component';

describe('NgosComponent', () => {
  let component: NgosComponent;
  let fixture: ComponentFixture<NgosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NgosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NgosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

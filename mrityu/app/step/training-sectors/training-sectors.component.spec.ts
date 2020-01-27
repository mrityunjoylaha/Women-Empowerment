import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TrainingSectorsComponent } from './training-sectors.component';

describe('TrainingSectorsComponent', () => {
  let component: TrainingSectorsComponent;
  let fixture: ComponentFixture<TrainingSectorsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TrainingSectorsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TrainingSectorsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

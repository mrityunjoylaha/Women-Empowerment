import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LegislationsPolicyComponent } from './legislations-policy.component';

describe('LegislationsPolicyComponent', () => {
  let component: LegislationsPolicyComponent;
  let fixture: ComponentFixture<LegislationsPolicyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LegislationsPolicyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LegislationsPolicyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

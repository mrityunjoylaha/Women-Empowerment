import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators,FormControl} from "@angular/forms";
import {Router} from "@angular/router";
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-details-registration',
  templateUrl: './details-registration.component.html',
  styleUrls: ['./details-registration.component.css']
})
export class DetailsRegistrationComponent implements OnInit {

  addForm: FormGroup;

  countries = ['USA', 'Germany', 'Italy', 'France']

  requestTypes = ['Claim', 'Feedback', 'Help Request']

  constructor() {
    this.addForm = this.createFormGroup()
  }

  // Step 1
  createFormGroup() {
    return new FormGroup({
      personalData: new FormGroup({
        email: new FormControl(),
        mobile: new FormControl(),
        country: new FormControl(),
      }),
      requestType: new FormControl(),
      text: new FormControl(),
    })
  }

  ngOnInit() {
  }

}

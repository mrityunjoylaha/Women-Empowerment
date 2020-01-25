import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { FormsModule,ReactiveFormsModule} from '@angular/forms';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import { Injectable } from '@angular/core';



@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})

@Injectable()
export class RegistrationComponent implements OnInit {
  addForm:FormGroup;
   url:string="http://192.168.12.44:9090/step";
 

  constructor(private http: HttpClient,private formBuilder: FormBuilder) { }
  //
 

  ngOnInit() {
    this.addForm=this.formBuilder.group({
      name:[''],
      userName:[''],
      dob:[''],
      password:[''],
      cPassword:[''],
      contact:['']
      
    });

}


addCustomer():void{
  this.http.post(this.url, this.addForm.value).subscribe(data=>{
    alert('customer  is added.');
  })
}
}


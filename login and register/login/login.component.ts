import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  url:string="https://cors-anywhere.herokuapp.com/192.168.12.44:9090/step/login"
  userForm: FormGroup;
  Username: string;
  password:string;
  result:any;

  constructor(private http:HttpClient,private router: Router, private formBuilder: FormBuilder) { }

  ngOnInit() {
   this.userForm = this.formBuilder.group({
    username:[],
    password:[]
   });
  }

  onSubmit():void{
    // alert('login');
   // let url = this.url+"/"+this.Username+"/"+this.password;
  //  alert(this.url);
   this.http.post(this.url,this.userForm.value).subscribe(data=>{
    alert('Login is successful');
    
    this.result = data;


   });
   this.router.navigate(['step-home']);
  }


}

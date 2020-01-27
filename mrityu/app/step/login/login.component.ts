// import { Component, OnInit } from '@angular/core';
// import { FormBuilder,FormGroup,Validators} from '@angular/forms';

// @Component({
//   selector: 'app-login',
//   templateUrl: './login.component.html',
//   styleUrls: ['./login.component.css']
// })
// export class LoginComponent implements OnInit {


//   nForm: FormGroup;
//   post:any;
//   username:string = " ";
//   password:string=" ";
//   constructor(private fb:FormBuilder) {

//     this.nForm=fb.group({
//       'username':[null,Validators.required],
//       'password':[null,Validators.compose([Validators.required,Validators.minLength(30),Validators.maxLength(500)])]
//     })
//    }

//    addPost(post){
//     this.password = post.password;
//     this.username = post.username;
//    }

//   ngOnInit() {
//   }

// }



import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators, FormControl} from "@angular/forms";
import {Router} from "@angular/router";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  
  loginForm: FormGroup;
  submitted: boolean = false;
  invalidLogin: boolean = false;


  constructor(private formBuilder: FormBuilder, private router: Router, ) { }

  onSubmit(){
    this.submitted = true;
    if(this.loginForm.invalid){
      return;
    }
    if(this.loginForm.controls.email.value =="joy.com" &&
        this.loginForm.controls.password.value=="1234"){
          localStorage.setItem("username",this.loginForm.controls.email.value);
          this.router.navigate(['step-home']);
    }
    else{
      this.invalidLogin = true;
    }
  }
 


  ngOnInit() {
    

    this.loginForm = this.formBuilder.group({
      email: ['', Validators.required],
      password: ['', Validators.required]
    });



}
}

import { Component, OnInit } from '@angular/core';
import { User } from '../user';

@Component({
  selector: 'app-advertisement-form',
  templateUrl: './advertisement-form.component.html',
  styleUrls: ['./advertisement-form.component.css']
})
export class AdvertisementFormComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  categories=['Furniture','Hardware','Mobile'];
  public name="Shalaka";

  usermodel=new User('','','','');
  onSubmit()
  {
    console.log(this.usermodel);
  }
}

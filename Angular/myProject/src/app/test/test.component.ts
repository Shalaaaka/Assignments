import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
  <h1>Welcome {{name}}</h1>
  <h2>{{2+2}}</h2>
  <h2>{{"Welcome"+name+" "+name.length}}</h2>
  <h2>{{url}}</h2>
  <input [id]="id" type="text" value="Shalaka"/>
  <h2 [class]="colorclass">Class Binding</h2>
  <h2 [style.color]="'Orange'">Style Binding 1</h2>
  <h2 [style.color]=highlight>Style Binding 2</h2>
  <button (click)="onClick()">button</button>
  <input #my type="text">
  <button (click)="logmsg(my.value)">Log</button>
  <h2 *ngIf="display; then thenblock;else elseblock">Shalaka</h2>
  <ng-template #elseblock>
  <h2>Hello</h2>
  </ng-template>
  <ng-template #thenblock>
  <h2>Hi</h2>
  </ng-template>
  <div [ngSwitch]="color">
  <div *ngSwitchCase="'red'">Red</div>
  <div *ngSwitchCase="'blue'">Blue</div>
  <div *ngSwitchDefault>pickagain</div>
  </div>
  <div *ngFor="let color of colors; index as i">
  <h2>{{i}} {{color}}</h2>
  </div>
  <h2>{{name | uppercase}}</h2>
  <h2>{{name | lowercase}}</h2>
  <h2>{{name | titlecase}}</h2>
  <h2>{{name | slice:1:7}}</h2>
  <h2>{{person | json}}</h2>
  <h2>{{0.25 | percent}}</h2>
  <h2>{{0.25 | currency}}</h2>
  <h2>{{date}}</h2>
  <h2>{{date | date:'short'}}</h2>
  <h2>{{date | date:'shortDate'}}</h2>
  `,
  styles: [
    `
    .test-color
    {
      color:green;
    }
    `
  ]
})
export class TestComponent implements OnInit {

  //@Input('parentData') public  name: string;parent to child
  /*@Output() public childevent=new EventEmitter();*child to parent*/
  public person={//pipes(json)
    "fname":"Shalaka",
    "lname":"Kale"
  }
  public date=new Date();//date pipe
  public colors =["red","blue","black","white"]//ngFor Directive
  public color="red";//ngSwitch Directive
  display=true;//ngIf Directive
  public name="Shalaka";//interpolation-only for strings
  public url=window.location.href;
  public id="testid";//property binding
  public colorclass="test-color";//class binding
  public highlight="Red";//style binding
  public greeting="";
  constructor() { }

  ngOnInit(): void {
  }

  onClick()//event binding
  {
    document.write("Welcome");
  }

  logmsg(value: string)//reference variable
  {
    document.write(value);
  }
}

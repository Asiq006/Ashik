import { Component, EventEmitter, Input, OnChanges, OnInit, Output, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-submit',
  templateUrl: './submit.component.html',
  styleUrls: ['./submit.component.css']
})
export class SubmitComponent implements OnInit,OnChanges {
  @Input() data:any;
  @Output() outputMsg:any = new EventEmitter();
  empId:any = 0
  constructor() { }
  ngOnChanges(): void {
    if (this.data>0) {
      this.empId++;
      this.outputMsg.emit(this.empId);  
    }
   
    
  }

  ngOnInit(): void {
    
   
  }

  // Send(){
  //   this.outputMsg.emit(this.data);  
  // }
}

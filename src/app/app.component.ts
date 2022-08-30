import { state } from '@angular/animations';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Employee } from './Employee';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  title = 'Employee_Details';
  summit: boolean = true;
  // name = new FormControl('');
  candidateForm: any;
  empArray: any;
  words: string = "";
  result: any;
  show: boolean = false;
  selectedIndex: number = 0;
  noOfEmployees: number = 0;
  idEmployee: number = 0;
  state_arr: string = "";
  Global: any;
  submit: boolean = false;
  displayCountry: boolean = true;
  displayState: boolean = true;
  displayCity:boolean=true;


  constructor(private fb: FormBuilder) {


  }
  ngOnInit(): void {
    this.empArray = [];
    this.candidateForm = this.fb.group({
      firstname: ['', Validators.required],
      middleName: ['', Validators.required],
      lastname: ['', Validators.required],
      gender: ['', Validators.required],
      dateOfBirth: ['', Validators.required],
      age: ['', Validators.required],
      address: ['', Validators.required],
      country: ['', Validators.required],
      State: ['', Validators.required],
      City: ['', Validators.required],
      Email: ['', [Validators.required, Validators.email]],
      institution: ['', Validators.required],
      course: ['', Validators.required],
      yearOfPassing: ['', Validators.required],
      cgpa: ['', Validators.required],
      degree: ['', Validators.required]

    })

  }


  // ="India">India</option>
  //         <option value="Iran">Iran</option>
  //         <option value="Canada">Canada</option>
  //         <option value="Australia">Australia</option> -->
  //       </select>

  Country: any = [
    { id: 1, name: "India" },
    { id: 2, name: "Iran" },
    { id: 3, name: "Canada" },
    { id: 4, name: "Australia" },

  ];

  State: any = [
    { id: 1, sname: "TamilNadu", Country: 1 },
    { id: 2, sname: "AndhraPradesh", Country: 1 },
    { id: 3, sname: "WestBengal", Country: 1 },
    { id: 4, sname: "UttraPradesh", Country: 1 },



    { id: 6, sname: "Alborz", Country: 2 },
    { id: 7, sname: "Ardabil ", Country: 2 },
    { id: 8, sname: "Bushehr", Country: 2 },
    { id: 9, sname: "Gilan", Country: 2 },

    { id: 10, sname: "Alberta", Country: 3 },
    { id: 11, sname: "British Columbia", Country: 3 },
    { id: 12, sname: "Manitoba", Country: 3 },
    { id: 13, sname: "New Brunswick", Country: 3 }
  ];

  City: any = [
    // INDIA
    { id: 1, cname: "Chennai", State: 1 },
    { id: 2, cname: "Trichy", State: 1 },
    { id: 3, cname: "Madurai", State: 1 },
    { id: 4, cname: "Vellore", State: 1 },
    { id: 5, cname: "VijayaWada", State: 2 },
    { id: 6, cname: "KakkiNada", State: 2 },
    { id: 7, cname: "Kuntur", State: 2 },
    { id: 8, cname: "Nellore", State: 2 },
    { id: 9, cname: "Kolkata", State: 3 },
    { id: 10, cname: "DurgaPur", State: 3 },
    { id: 11, cname: "Dargling", State: 3 },
    { id: 12, cname: "Jangipur", State: 3 },
    { id: 13, cname: "Lucknow", State: 4 },
    { id: 14, cname: "Agra", State: 4 },
    { id: 15, cname: "Varanasi", State: 4 },

    // IRAN
    { id: 16, cname: "Karaj", State: 5 },
    { id: 17, cname: "Kaif", State: 5 },
    { id: 18, cname: "Karma", State: 5 },
    { id: 19, cname: "Kajan", State: 5 },
    { id: 20, cname: "Alminah", State: 6 },
    { id: 21, cname: "Althaf", State: 6 },
    { id: 22, cname: "Ashan", State: 6 },
    { id: 23, cname: "Akif", State: 6 },
    { id: 24, cname: "Pathan", State: 7 },
    { id: 25, cname: "phutak", State: 7 },
    { id: 26, cname: "pilon", State: 7 },
    { id: 27, cname: "periyad", State: 7 },
    { id: 28, cname: "meejanah", State: 8 },
    { id: 29, cname: "mifkin", State: 8 },
    { id: 30, cname: "miyaj", State: 8 },
    { id: 31, cname: "mufiyan", State: 8 },


    // canada
    { id: 32, cname: "Toronto", State: 9 },
    { id: 33, cname: "Montreal", State: 9 },
    { id: 34, cname: "Calgary", State: 9 },
    { id: 35, cname: "Ottawa", State: 9 },
    { id: 36, cname: "Edmonton", State: 10 },
    { id: 37, cname: "Winnipeg", State: 10 },
    { id: 38, cname: "Mississauga", State: 10 },
    { id: 39, cname: "Vancouver", State: 10 },
    { id: 40, cname: "DeepRiver", State: 11 },
    { id: 41, cname: "Sherbrooke", State: 11 },
    { id: 42, cname: "Brandon", State: 11 },
    { id: 43, cname: "Churchill", State: 11 },
    { id: 44, cname: "Dauphin", State: 12 },
    { id: 45, cname: "Flin Flon", State: 12 },
    { id: 46, cname: "Saint Boniface", State: 12 },
    { id: 47, cname: "Swan River", State: 12 },

  ]

  dropDownCity: any = this.City;
  dropDownState: any = this.State;
  dropDownCountry:any=this.Country;

  populateState(value:any) {

    if (this.candidateForm.controls.country.value.id == 'Select your Country') {
      this.dropDownState = this.State;
    }
    else {
      this.dropDownState = this.State.filter((i: any) => i.Country == this.candidateForm.controls.country.value.id);
      this.dropDownCity = true;
    }

  }


  populateCity(value:any) {
    console.log(this.City);

    if (this.candidateForm.controls.State.value.id == 'Select your State') {
      this.dropDownCity = this.City;
    }
    else {
      this.dropDownCity = this.City.filter((i: { State:any}) => i.State == this.candidateForm.controls.State.value.id);
      this.displayCity=true;
    }
  }


  forCountry(e: any) {
    this.displayCountry = false;
    this.dropDownCountry = this.Country().filter((i: { id: any; }) => i.id == this.candidateForm.controls.state.value.Country);
  }

  forState(e: any) {
    this.displayState = false;
    this.dropDownState=this.State().filter((i: { id: any; }) => i.id ==this.candidateForm.controls.City.value.State);

  }

 


  // if (this.candidateForm.status == "INVALID") {
  //   return;
  // }

  // this.candidateForm.reset();
  //   this.candidateForm.valueChanges.subscribe((value: any) => {
  //   }
  // )}

  // home() {
  //   this.candidateForm.home();

  // }
  add() {
    let isUserExist = this.checkUserExists(this.candidateForm);
    if (isUserExist == true) {
      alert("USER EXISTS ALREADY !");

    }
    else {
      // console.log(this.submitted);
      // this.submitted = true;
      // console.log(this.empArray);
      // this.empArray.push(this.candidateForm.value);
      // // console.log(this.result);
      // alert('Employee added Successfully !');
      // console.log(this.submitted);
      this.submit = true;
      this.empArray.push(this.candidateForm.value)
      console.log(this.empArray);
      console.log(this.result);
      alert('Employee Added Successfully');
      this.noOfEmployees = this.noOfEmployees + 1;
      this.idEmployee++;
      console.log(this.empArray);




    }
  }
  checkUserExists(candidateForm: any) {
    let registerEmployee = this.empArray;
    let userExist = false;
    for (let i = 0; i < this.empArray.length; i++) {
      if (registerEmployee[i].firstname == this.candidateForm.value.firstname && registerEmployee[i].email == this.candidateForm.value.email) {
        userExist = true;
      }
    }
    return userExist;


  }
  reset() {
    this.candidateForm.reset();

  }
  // get Email() {
  //   return this.candidateForm.get('Email')
  // }
  deleteRecord(i: any) {
    this.empArray.splice(i, 1)
    console.log(this.deleteRecord);

    alert('Removed');
    this.noOfEmployees = this.noOfEmployees - 1;
    if (this.noOfEmployees > 0) {
      this.selectedIndex = 0;
    }
    else {
      this.selectedIndex = -1;
    }
  }
  get() {

  }
  details(i: any) {
    this.show = true;
    this.selectedIndex = i;
  }

  //  uniqueId(event1:any)
  //  console.log("uniqueId");

  displayOutput(event: any) {
    console.log(event);
    if (this.empArray.length > 0) {
      this.empArray[this.empArray.length - 1].id = event;
    }
  }
}

  //  duplicaate(duplicate:any){
  //    console.log(duplicate);
  //    this.empArray.filter(duplicate,1)
  //  }


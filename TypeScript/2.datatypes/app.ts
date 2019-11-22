//Variabble Declaration
let myName : string = "Gokul";
 console.log(myName, typeof myName);

 let age : number;
 console.log(age, typeof age);

 let mobileNumber = 8940191847;
 console.log(mobileNumber, typeof mobileNumber);

 let address;
 address = "qwerty";
 address = 9876;
 console.log(address, typeof address);

 let calAge = function() : void{
     console.log("age is 22");
 }
 calAge();

//Class Declaration
 class Person{
     constructor(public name : string, public age : number){

     }
 }
 let Person1 = new Person("Gokul",22);
 console.log(Person1);

 class Student extends Person{
     constructor(name : string, age : number, public rollNo : number){
         super(name, age);
     }
 }
 let Student1 = new Student("Kavin",23,1001);
 console.log(Student1);
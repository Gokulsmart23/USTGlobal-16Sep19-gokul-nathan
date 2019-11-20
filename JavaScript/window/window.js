console.log('Window Object',window);
console.log('This Keyword',this);
console.log(this === window);
/* window.alert('Welcome to JavaScript Class');
alert('Welcome to UST Global and Test Yantra');

let confirmDelete = confirm('Are you sure want to Delete');
console.log('Confirm Delete',confirmDelete);

let userName = prompt('What is your name','Gokul');
console.log('User Name is', userName); */

const person = { 
    firstName : 'Aliya',
    age : 26,
    lastName : 'Kapoor',
    getName : function(){
        console.log('This keyword',this);
        return this.firstName + " " + this.lastName
    }
}
let fullName = person.getName()
console.log('Full Name',fullName);
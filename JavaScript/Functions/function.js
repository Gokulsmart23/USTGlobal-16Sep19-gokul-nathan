//Named Functions
function add(num1,num2)
{
    console.log('Sum =',num1 + num2);
}
add(10,20);
function add1(num1,num2,num3)
{
   console.log('Sum value =', num1+num2+num3); 
}
add1(10,20,30);
//Function Expression (Anonymous)
var sub = function(num1,num2)
{
    var subValue = num1 + num2;
    return subValue;
}
var value = sub(90,89)
console.log('Value =', value);
//Self invoked Function
console.log('Hello');
(function (num1,num2){
    console.log('value =',num1+num2);
})(10,20)
var div = num1=>{
    console.log('Value=',num1);
}
(10);
//Fat Array Functions
var div1 = num1=>console.log(num1);
(10);
var sum = (num1,num2)=> num1+num2;
var val = sum(10,20);
work('gokul');
function work(msg){
    console.log('Hello',msg);
}
greet('Dinga');
function greet(msg){
    console.log('Hi',msg);
}
playMusic('song');
function playMusic(msg){
    console.log('Playing',msg);
}

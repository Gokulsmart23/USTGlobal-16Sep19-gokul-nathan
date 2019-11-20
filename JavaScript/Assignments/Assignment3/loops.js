var books = ['English','Maths','Science','Social'];
console.log('For loop');
for(var i=0; i<books.length; i++){
    console.log('Books=',books[i]);
}
console.log('=============================');
console.log('For in');
for(var index in books){
    console.log('Books=',books[index]);
}
console.log('=============================');
console.log('For each')
books.forEach(function(value,index){
    console.log('Books=',value);
})
console.log('=============================');
console.log('For of')
for(var element of books){
    console.log('Books=',element);
}
console.log('///////////////////////////////');
 var names = ['Gokul','kavin','Mohan','Vinodh','Bala'];
 console.log('For loop');
for(var i=0; i<names.length; i++){
    console.log('Names=',names[i]);
}
console.log('=============================');
console.log('For in');
for(var index in names){
    console.log('Names=',names[index]);
}
console.log('=============================');
console.log('For each')
names.forEach(function(value,index){
    console.log('Names=',value);
})
console.log('=============================');
console.log('For of')
for(var element of names){
    console.log('Names=',element);
}
console.log('///////////////////////////////');
var numbers =[10,20,30,40,50];
console.log('For loop');
for(var i=0; i<numbers.length; i++){
    console.log('Numbers=',numbers[i]);
}
console.log('=============================');
console.log('For in');
for(var index in numbers){
    console.log('Numbers=',numbers[index]);
}
console.log('=============================');
console.log('For each')
numbers.forEach(function(value,index){
    console.log('Numbers=',value);
})
console.log('=============================');
console.log('For of')
for(var element of numbers){
    console.log('Numbers=',element);
}
console.log('///////////////////////////////');
console.log('for loop');
var cars = ['BMW','Audi',"Jaguar","Benz"];
for(var i=0; i<cars.length; i++){
    console.log('Car=',cars[i]);
}
console.log('=============================');
console.log('for in');
for(var index in cars){
    console.log('Car=',cars[index]);
} 
console.log('=============================');
console.log('for each');
cars.forEach(function(value,index){
    console.log('Car=',value);
})
console.log('=============================');
console.log('for of');
for(var element of cars){
    console.log('Cars=',element);
}
console.log('///////////////////////////////');
var mobiles = new Array('Iphone','Samsung','Redmi','Huwai');
console.log('for loop');
for(var i=0; i<mobiles.length; i++){
    console.log('Mobile=',mobiles[i]);
}
console.log('=============================');
console.log('for in');
for(var index in mobiles){
    console.log('Mobile=',mobiles[index]);
}
console.log('=============================');
console.log('for each');
mobiles.forEach(function(value){
    console.log('Mobile=',value);
})
console.log('=============================');
console.log('for of');
for(var element of mobiles){
    console.log('Mobile=',element);
}
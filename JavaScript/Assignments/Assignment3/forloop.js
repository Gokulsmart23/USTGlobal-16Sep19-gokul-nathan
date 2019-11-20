var chocolates = new Array('Dairy milk','Kit Kat','Milky Bar','Temtation');
console.log('for loop');
for(var i=0; i<chocolates.length; i++){
    console.log('Chocolate=',chocolates[i]);
}
console.log('=============================');
console.log('for in');
for(var i in chocolates){
    console.log('Chocolate=',chocolates[i]);
}
console.log('=============================');
console.log('for each');
chocolates.forEach(function(value,index){
    console.log('Chocolate=',value);
})
console.log('=============================');
console.log('for of');
for(var element of chocolates){
    console.log('Chocolate=',element);
}
console.log('///////////////////////////////');
var shopping = new Array('FlipKart','Amazon','EBuy','Snapdeal');
console.log('for loop');
for(var i=0; i<shopping.length; i++){
    console.log('Shopping=',shopping[i]);
}
console.log('=============================');
console.log('for in');
for(var index in shopping){
    console.log('Shopping=',shopping[index]);
}
console.log('=============================');
console.log('for each');
shopping.forEach(function(value,index){
    console.log('Shopping=',value);
})
console.log('=============================');
for(var element of shopping){
    console.log('Shopping=',element);
}
console.log('///////////////////////////////');
console.log('for loop');
var movies = new Array('KGF','Bigil','Kappan','Mersal');
console.log('for loop');
for(var i=0; i<mobiles.length; i++){
    console.log('Movie=',movies[i]);
}
console.log('=============================');
console.log('for in');
for(var index in movies){
    console.log('Movie=',movies[index]);
}
console.log('=============================');
console.log('for each');
movies.forEach(function(value,index){
    console.log('Movie=',value);
})
console.log('=============================');
console.log('for of');
for(var element of movies){
    console.log('Movie=',element);
}
console.log('///////////////////////////////');
var shoes = new Array('Sparkz','Adidas','RBK','Puma');
console.log('for loop');
for(var i=0; shoes.length; i++){
    console.log('Shoe=',shoes[i]);
}
console.log('=============================');
console.log('for in');
for (var index in shoes){
    console.log('Shoe=',shoes[index]);
}
console.log('=============================');
console.log('for each')
shoes.forEach(function(value,index){
    console.log('Shoe=',value);
})
console.log('=============================');
console.log('for of')
for(var element of shoes){
    console.log('Shoe=',element);
}
var person = {
    name : 'Gokulnathan',
    age : 22,
    qualification : 'BE',
    branch : 'BTM'
}
for(var index in person){
    console.log('Person=',person[index]);
}
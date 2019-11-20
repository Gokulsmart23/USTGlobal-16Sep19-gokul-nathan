var brands = ['kingfisher','bisleri','aqua','kinley']
console.log('For of Loop');
for(var element of brands){
    console.log('Brands=',element);
}
console.log('=============================');
console.log('For in Loop');
for(var index in brands){
    console.log('Brands=',brands[index]);
}
console.log('=============================');
console.log('For in Loop for Object');
/* var person = {
    name = 'Sundari',
    age = 33,
    color = 'white'     
}
for(var key in person){
    console.log('Value=',person[key])
} */
console.log('=============================');
console.log('For Each Loop');
var movies = ['Sholay','Maya Bazar','Jurassic park','Titanic'];
movies.forEach(function(value,index){
    console.log('Movie=',value);
})
var items=[{item :'bangle',
                id : 1,
            price : 100},
       {item : 'eyeliner',
    id : 2,
price : 500},
{item : 'watch',
id : 3,
price : 5000},
{item : 'bike',
id : 4,
price : 1000000}];
items.forEach(function(items,index){
    console.log('Items=',items);
    console.log('Index of items=',index);
})

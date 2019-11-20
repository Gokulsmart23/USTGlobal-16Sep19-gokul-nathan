const items = [{
    name : 'Ear ring',
    id : 1,
    price : 5000 // 5300
},{
    name : 'Kajal',
    id : 2,
    price : 1000 
},{
    name : 'Trimmer',
    id : 3,
    price : 3000 // 3300
},{
    name : 'Beards',
    id : 4,
    price : 170
}]
for(let data in items){
    if(items[data].price>1000){
        items[data].price = items[data].price + 300;
    }
}
/* console.log(items);
console.log('======================');
const data = items.map(function(value){
    let newData;
    if(value.price>1000){
        newData = value.price + 300;
    }
    return newData;
}) 
console.log(data);*/
items.map(function(item,index){
    item.price = item.price + 300;
    return item
})
console.log(items);
items.map((value)=>{
    value.price = value.price + 300
    return value
})
console.log(items);
const filteredItems = items.filter((item)=>item.price>1000)
console.log(filteredItems);
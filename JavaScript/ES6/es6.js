const message = new Promise(function(resolve,reject){
    if(30>10){
        resolve([{
            name : 'BillGates',
            age : 67
        },{
            name : 'Mark Zuckerberg',
            age : 40
        },{
            name : 'Jeff Bezos',
            age : 45
        }])
    } else {
        reject('Failed')
    }
})
message.then(function(msg){
    console.log('Success Message',msg);
}).catch(function(error){
    console.log('Failure Message',error)  
});
console.log('============================')
const employee = new Promise(function(resolve,reject){
    if(30>10){
        resolve([{
            name : 'Gokul',
            age : 22
        },{
            name : 'Kavin',
            age : 23
        },{
            name : 'Mohan',
            age : 21
        }])
    } else {
        reject('Failed')
    }
})
employee.then(function(data){
    console.log('Employee Data',data);
}).catch(function(error){
    console.log('Failure Message',error)  
});
//Closures
function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter + 10
        return count 
    }
    return innerFunction
}
let innerFunc = outerFunction(20);
let counter = innerFunc()
console.log('Counter Value',counter)
const person ={
    name : 'Sundara',
    age : 100,
    color : 'white',
    address : {
        city : 'Bijapur',
        state : 'Karanataka',
        pincode : 591115
    },
    hobbies : ['Coding','Bird Watching','Singing']
}
console.log('JavScript person Object',person)
const jsonObject = JSON.stringify(person)
console.log('JSON person Object',jsonObject)
const javaScriptPersonObject = JSON.parse(jsonObject)
console.log('JavaScript person Object after parse',javaScriptPersonObject)

localStorage.setItem('email','billgates@gmail.com')
const emailID = localStorage.getItem('email')
console.log('Email ID',emailID)
localStorage.clear()
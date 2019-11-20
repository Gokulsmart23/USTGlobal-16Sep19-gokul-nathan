const hobbies = ['Sleeping','Cricket','Eating','Coding','Roaming'];
console.log(typeof hobbies);
const isArrayOrNot = Array.isArray(hobbies);
console.log('Hobbies array or not',isArrayOrNot);
const hasCricket = hobbies.includes('Cricket');
console.log('Using include method',hasCricket);
hobbies.push('Guiter','Volly Ball');
console.log('After push method',hobbies);
hobbies.pop();
console.log('After pop method',hobbies);
hobbies.unshift('Numismatics','Singing');
console.log('After unshift method',hobbies);
hobbies.shift();
console.log('After shift method',hobbies);
const hobbies1 = ['Sleeping','Cricket','Eating','Coding','Roaming']
hobbies1.splice(1,0,'Bird Watching','PUBG');
console.log('After splice method',hobbies1);
var afterSlice = hobbies1.slice(2,4);
console.log('After slice method',hobbies1);
console.log('After slice method',afterSlice);
const indexOfCoding = hobbies1.indexOf('Coding');
console.log('Index of Coding',indexOfCoding);
const joinHobbies = hobbies1.join('-');
console.log('After join',joinHobbies);
const numbers = [100,200,300,400];
const numbers1 = numbers.map(function(value,index){
    let newValue = value+50;
    return newValue;
})
const numbers2 = numbers.map(value=>value+50);
const number = numbers.filter(function(value,index){
    if(value>200){
        return true
    } else {
        return false
    }
})
console.log(number);
const num = numbers.filter(value=>value>200)
console.log(num);

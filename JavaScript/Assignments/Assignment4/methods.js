const subjects = ['English','Tamil','Maths','Science','Social'];
console.log(subjects.length);
subjects.forEach(function(value,index){
    console.log('Subject=',value);
})
console.log('Is this a Array=',Array.isArray(subjects));
console.log('Tamil is present in Array=',subjects.includes('Tamil',1));
console.log('No of index present in Array=',subjects.push('History','Geography'));
console.log(subjects);
console.log('Removed element=',subjects.pop('Social'));
console.log(subjects);
console.log('Removed element=',subjects.shift());
console.log(subjects);
subjects.unshift('English','Geography');
console.log(subjects);
console.log(subjects.slice(0,5));
console.log(subjects.join('-'));
console.log('Social present in',subjects.indexOf('Social',2),'th index');
subjects.map(function(value,index){
    let newArr ="Subject="+value;
    console.log(newArr);
})
console.log('============================');
const names = ['Gokul','Mohan','Kavin','Sathish','Vinodth','Bala','Aravindh'];
console.log(names.length);
names.forEach(function(value,index){
    console.log('Name=',value);
})
console.log('Is this a Array=',Array.isArray(names));
console.log('Bala is present in Array=',names.includes('Bala',1));
console.log('No of index present in Array=',names.push('Ram','Vishnu'));
console.log(names);
console.log('Removed element=',names.pop());
console.log(names);
names.unshift('Sasi','Akashy');
console.log(names);
console.log(names.slice(1,5));
console.log(names.join());
console.log('Ram present in',names.indexOf('Ram',2),'th index');
names.map(function(value,index){
    let newArr ="Name="+value;
    console.log(newArr);
})
console.log('============================');
const movies = ['Sholay','Maya Bazar','Jurassic park','Titanic'];
console.log(movies.length);
movies.forEach(function(value,index){
    console.log('Movie=',value);
})
console.log('Is this a Array=',Array.isArray(movies));
console.log('Titanic is present in Array=',names.includes('Titanic',1));
console.log('No of index present in Array=',names.push('Bigil','Kappan'));
console.log(movies);
console.log('Removed element=',movies.pop());
console.log(movies);
movies.unshift('Sarkar','Mersal');
console.log(movies);
console.log(movies.slice(1,5));
console.log(movies.join());
console.log('Titanic present in',movies.indexOf('Titanic',2),'th index');
movies.map(function(value,index){
    let newArr ="Movie="+value;
    console.log(newArr);
})
console.log('============================');
const str = 'Gokul Nathan';
const str1 = ' T';
console.log(str.length);
console.log(str.toLowerCase()); 
console.log(str.toUpperCase());
console.log(str.charAt(4));
console.log(str.indexOf('a',4));
console.log(str.concat(str1));
console.log(str.includes('l',1));
console.log(str1.replace(' ','.'));
console.log(str.split('_',2));
console.log(str.substr(6,6));
console.log(str.search('a'));
console.log(str.trim());
console.log('============================');
const st = 'Basavanagudi';
const st1 = ' Branch';
console.log(st.length);
console.log(st.toLowerCase()); 
console.log(st.toUpperCase());
console.log(st.charAt(7));
console.log(str.indexOf('g',5));
console.log(st.concat(st1));
console.log(st.includes('s',1));
console.log(st1.replace(' ','-'));
console.log(st.split('_',3));
console.log(st.substr(4,5));
console.log(st.search('g'));
console.log(st.trim());
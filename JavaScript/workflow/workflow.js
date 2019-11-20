function first(){
    setTimeout(function(){
        console.log('First Function Executed');
    },0)
}
function second(){
    console.log('Second Function Executed');
}
first();
second();
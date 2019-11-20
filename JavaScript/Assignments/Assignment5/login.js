let filterUsr;
let filterPwd;
function sub(){
    let usr = document.getElementById('username').value
    let pwd = document.getElementById('password').value
    if(usr.trim().length>5 & pwd.trim().length>6){
        alert('Login Success');
        document.getElementById('login').innerHTML = false;
    } else {
        let userErr = document.getElementById('usrerr').innerHTML = 'Username invalid'
        //userErr.textContent = 'Username invalid'
        userErr.style.color = 'red';
        userErr.style.fontSize = '10px'
        document.getElementById('pwderr').innerHTML = 'Password invalid'
    }
}
function showPassword(){
    var x = document.getElementById('password');
  if (x.type === "password") {
    x.type = "text";
  } else {
    x.type = "password";
  }
}
function enableButton(){
    let disusr = document.getElementById('username');
    let dispwd = document.getElementById('password');
}


window.onload = function(){
let x = prompt("x asis");
let y = prompt("y asis");
alert (kordinates(x,y));
}

function kordinates(a,b){
    return (Math.sqrt(a*a+b*b));
}
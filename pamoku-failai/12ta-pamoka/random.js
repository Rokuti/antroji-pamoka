window.onload = function() {
    let x = +prompt("iveskit skaiciu nuo");
    let y = +prompt("iveskit antra skaiciu iki");
    alert (atsitiktinis(x,y));
}

function atsitiktinis(a,b){
 return  (Math.round(Math.random() * (b - a) + a));
}
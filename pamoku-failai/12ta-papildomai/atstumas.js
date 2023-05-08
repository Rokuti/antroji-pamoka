window.onload = function(){
let x1 = +prompt("pirmas x");
let y1 = +prompt("pirmas y");
let x2 = +prompt("antrasx");
let y2 = +prompt("antras y");
alert (atstumas(x1,y1,x2,y2));
}

function atstumas(a,b,c,d){
    return Math.sqrt((c-a)*(c-a)+(d-b)*(d-b));
}

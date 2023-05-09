window.onload = function(){
    let x = +prompt("pirmas sekos skaicius");
    let y = +prompt("antras sekos skaicius");
    let n = +prompt("kelintas kinatamasis");
    alert (nNarys(x,y,n));
}

function nNarys(a,b,n){
    return a+b*(n-1);
}
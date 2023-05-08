window.onload = function() {
    let x = prompt("vertikali linija");
    let y = prompt("herizontali linija");
    alert (perimetras(x,y));
}

function perimetras(a,b){
    return a*b;
}
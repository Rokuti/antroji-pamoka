window.onload = function(){
    let a = +prompt("Iveskit skaiciu");
    let b = +prompt("Iveskit intervalo pradzia");
    let c = +prompt("Iveskit intervalo pabaiga");
    alert("Skaicius yra intervale " + arIntervale(a,b,c));
}

function arIntervale (a,b,c){
    return (a >= b && a <= c);
}
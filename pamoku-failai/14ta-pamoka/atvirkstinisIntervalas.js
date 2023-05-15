window.onload = function(){
    let a = +prompt("Iveskit skaiciu");
    let b = +prompt("Iveskit intervalo pradzia");
    let c = +prompt("Iveskit intervalo pabaiga");
    alert(Nera(a,b,c));
}

function Nera(a,b,c){
    return (a<b || a>c);
}
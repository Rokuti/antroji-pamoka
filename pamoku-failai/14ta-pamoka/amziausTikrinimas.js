window.onload = function(){
    let amzius = +prompt("Iveskite amziu");
    alert(amziausTikrinimas(amzius));
    alert(arLyginisIrTeigiamas(amzius));
}

function amziausTikrinimas(a){
    return (a > 0 && a < 120);
}

function arLyginisIrTeigiamas(a){
    return (a > 0 && a % 2 ==0);
}
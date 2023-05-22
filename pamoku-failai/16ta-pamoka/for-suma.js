window.onload = function (){
    let pradzia = +prompt("iveskite pradini skaiciu");
    let pabaiga = +prompt("iveskite pabaiga");
    let d = +prompt("kas kelinta");
    alert(kiekIsViso(pradzia, pabaiga, d));
    VisiLyginiai(pradzia, pabaiga);
}
function kiekIsViso(pradzia, pabaiga, d) {
    let suma = 0;
    for (let i = pradzia; i <= pabaiga; i += d) {
        suma += i;
    }
    return suma;
}

function arLyginis(pradzia){
   if (pradzia % 2 == 0){
    console.log(pradzia);
   }
}

function VisiLyginiai(pradzia, pabaiga){
    for (let i = pradzia; i < pabaiga; i++) {
        arLyginis(i);
    }
}
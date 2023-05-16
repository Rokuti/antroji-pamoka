window.onload = function (){
    let pradzia = +prompt("iveskite pradini skaiciu");
    let pabaiga = +prompt("iveskite pabaiga");
    let d = +prompt("kas kelinta");
    alert(kiekIsViso(pradzia, pabaiga, d));
}
function kiekIsViso(pradzia, pabaiga, d) {
    let suma = 0;
    for (let i = pradzia; i <= pabaiga; i += d) {
        suma += i;
    }
    return suma;
}

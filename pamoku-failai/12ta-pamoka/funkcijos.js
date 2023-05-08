window.onload = function() {
console.log(dvigubaiMinusDesimt(6));
let sk1 = prompt("iveskite skaiciu");
let sk2 = prompt("kita skaiciu");
console.log(antraFunkcija(sk1,sk2));
let zodis = (prompt("iveskite zody"));
console.log(trisKartus(zodis));
let skaiciaZodziai = prompt("iveskit skaicius 1")
let skaiciaZodziai2 = prompt ("isveskit skaicius2")
console.log(skaiciaiZodziai(skaiciaZodziai,skaiciaZodziai2));
}


function dvigubaiMinusDesimt(a){
    return 2*a-10;

}

 function antraFunkcija(a,b){
    return a*b/a+b;
 }
 function trisKartus(a){
    return (a+" "+a+" "+a);
    
 }
 function skaiciaiZodziai(a,b){
    return (a+""+b);
 }
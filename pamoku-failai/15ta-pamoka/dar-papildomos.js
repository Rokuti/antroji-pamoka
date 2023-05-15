window.onload = function(){
    let zodis = prompt("Iveskite zodi: ");
    let pradzia = prompt("Iveskit padzia");
    let pabaiga = prompt("Iveskite pabaige");
    alert(zodziai(zodis,pradzia,pabaiga));
    let n = prompt("kelinta raide");
    alert(kazKelintaRaide(zodis,n));
    console.log(kazKelintaRaide(zodis,-1));
}

function zodziai(a,b,c){
   return a.startsWith(b) && a.endsWith(c);
}

function kazKelintaRaide(zodis,n){
 if (n > 0) {
    return zodis[n];
 } else if (n < 0) {
    return zodis.slice(n)[0];
 }
}
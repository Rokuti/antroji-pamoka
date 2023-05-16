window.onload = function (){
    let pradzia = +prompt("iveskite pradini skaiciu");
    let pabaiga = +prompt("iveskite pabaiga");
    let d = +prompt("kas kelinta");
    kasKazkelinta(pradzia, pabaiga, d);
}

function kasKazkelinta(pradzia, pabaiga, d){
    for (let i = pradzia; i < pabaiga; i += d){
        console.log(i);
    }
}
window.onload = function(){
    let pradzia = +prompt("Iveskite pradzia");
    let pabaiga = +prompt("Iveskite pabaiga");
    alert(padaugintaIki(pradzia,pabaiga));
}

function padaugintaIki(pradzia,pabaiga){
    let sum = 1;
    for(let i = pradzia;i < pabaiga; i++){
        sum *= i;
    }
    return (sum);
}
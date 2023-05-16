window.onload = function(){
    let zodis = prompt("iveskite zodi");
    let n = +prompt("kiek kartu");
    daudKartZodis(zodis,n);
}
function daudKartZodis(zodis,n){
    for(let i = 0; i < n; i++){
        console.log(zodis);
    }
}
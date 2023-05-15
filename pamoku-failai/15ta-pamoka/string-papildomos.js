window.onload = function(){
    let zodis = prompt("Iveskite zodi: ");
    let galune = prompt("Iveskit antra zodi");
alert(zodis.toLocaleLowerCase()==galune.toLocaleLowerCase());
alert(palygintiZodzius(zodis,galune));
}

function palygintiZodzius(a,b){
    if (a > b){
        return -1;
    } else if (a = b){
        return 0;
    } else {
        return 1;
    }
}
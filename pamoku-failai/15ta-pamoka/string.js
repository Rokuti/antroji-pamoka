window.onload = function(){
    let zodis = prompt("Iveskite zodi: ");
    let galune = prompt("Iveskit ieskoma galune");
    alert(zodis.length);
    console.log(zodis.at(-1));
    console.log(zodis[zodis.length-1]);
    console.log(zodis.toLocaleLowerCase().includes("taip"));
    console.log(zodis.endsWith(galune));
}

function galune(a){
}
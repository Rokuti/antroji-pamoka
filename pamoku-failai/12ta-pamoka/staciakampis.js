window.onload = function() {
    let x = prompt("ilgis");
    let y = prompt("plotis");
    let z = prompt("aukstis");
    alert (staciakampis(x,y,z));
}

function staciakampis(a,b,c){
    return (2*a*b + 2*a*c + 2*b*c);
}
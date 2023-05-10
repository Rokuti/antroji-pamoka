window.onload = function(){
    let a = +prompt("Iveskit pirma krastine");
    let b = +prompt("Iveskit antra krastine");
    let c = +prompt("Iveskit trecia krastine");
    alert("trikampis iseis: " + arIseina(a,b,c));
}

function arIseina(a,b,c){
    return (a < b + c && b < a + c && c < b + a);
}
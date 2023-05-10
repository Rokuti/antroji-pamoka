window.onload = function(){
let a = +prompt("Iveskit skaiciu");
lyginis(a);
}

function lyginis (a){
    if (a % 2 == 0){
        alert("Skaicius yra lyginis");
    } else {
        alert("Skaicius yra nelyginis");
    }
}
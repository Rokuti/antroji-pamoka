window.onload = function(){
    let a = +prompt("Iveskit pirma krastine");
    let b = +prompt("Iveskit antra krastine");
    let c = +prompt("Iveskit trecia krastine");
    alert(koksTrikampis(a,b,c));
}

function koksTrikampis(a,b,c){
    if (a == b == c){
        return "lygiaKrastis";
    } else if (a == b || b == c || c == a){
        return "lygiaSonis"
    } else {
        return "paprastas"
    }
}
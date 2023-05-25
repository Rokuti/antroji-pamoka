window.onload = function(){
    let forma = document.forms["skaiciai"];
    let pirmasSkaicius = forma["skaicius"];
    let antrasSkaicius = forma["2skaicius"];
    let mygtukas = document.getElementById("sandauga");
    mygtukas.onclick = function() {
        let skaicius = pirmasSkaicius.valueAsNumber;
        let skaicius2 = antrasSkaicius.valueAsNumber;
        alert("Sandauga yra :"+ sandauga(skaicius,skaicius2));
    }
    let mygtukas2 = document.getElementById("sudetis");
    mygtukas2.onclick = function() {
        let skaicius = pirmasSkaicius.valueAsNumber;
        let skaicius2 = antrasSkaicius.valueAsNumber;
        alert("Sudetis yra :"+ sudetis(skaicius,skaicius2));
    }
    let mygtukas3 = document.getElementById("atimtis");
    mygtukas3.onclick = function() {
        let skaicius = pirmasSkaicius.valueAsNumber;
        let skaicius2 = antrasSkaicius.valueAsNumber;
        alert("Atimtis yra :"+ atimtis(skaicius,skaicius2));
    }
    let mygtukas4 = document.getElementById("dalyba");
    mygtukas4.onclick = function() {
        let skaicius = pirmasSkaicius.valueAsNumber;
        let skaicius2 = antrasSkaicius.valueAsNumber;
        alert("Dalyba yra :"+ dalyba(skaicius,skaicius2));
    }

}

function sandauga(a,b){
    return a*b;
}

function sudetis(a,b){
    return a+b;
}
function atimtis(a,b){
    return a-b;
}
function dalyba (a,b){
    return a/b;
}
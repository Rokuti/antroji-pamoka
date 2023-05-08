window.onload = function(){
let change = prompt("skaicius pls:");
console.log(keicia(change));
let x = prompt("kazka");
let z = prompt("dar");
let y = prompt("dar kazka");
alert(x+" "+z+" "+y);
a = 1;
b = 2;
c = 3;
d = 4;
e = 5;
console.log(faktorialas(a,b,c,d,e));
}

function keicia(a){
    return a*-1;
}
function faktorialas(a,b,c,d,e){
    console.log(a);
    console.log(a*b);
    console.log(a*b*c);
    console.log(a*b*c*d);
    console.log(a*b*c*d*e);
}
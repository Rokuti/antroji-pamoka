window.onload = function(){
    let a = +prompt("a trikampio krastine");
    let b = +prompt("b trikampio krastine");
    let c = +prompt("c trikampio krastine");
    alert (plotas(a,b,c));
}

function pusperimetri(a,b,c){
    console.log(a+b+c);
    return (a+b+c)/2;
}

function plotas (a,b,c){
    let p = pusperimetri(a,b,c);
    console.log(p);
    return Math.sqrt(p*(p-a)*(p-b)*(p-c));
}
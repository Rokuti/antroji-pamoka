window.onload = function(){
    let a = +prompt("trikampio statine");
    let b = +prompt("kita trikampio krastine");
    alert (istrizaine(a,b));
}
function istrizaine(a,b){
    return (Math.sqrt(a*a+b*b));
}
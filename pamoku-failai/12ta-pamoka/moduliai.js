window.onload = function(){
    let x = prompt("ivesti skaiciu");
    let y = prompt("kita skaiciu");
    alert (iseiga(x,y));
}

function iseiga(a,b){
   return (Math.abs(a))+(Math.abs(b));
}

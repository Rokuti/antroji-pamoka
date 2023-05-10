window.onload = function(){
    let a = +prompt("Iveskit skaiciu");
    let b = +prompt("Iveskit antra skaiciu");
    palyginimas(a,b);
    }
    
    function palyginimas(a,b){
        if (a * b > a + b){
            alert("true");
        } else {
            alert ("false");
        }
    }
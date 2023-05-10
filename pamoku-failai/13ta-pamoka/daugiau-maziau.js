window.onload = function(){
    let a = +prompt("Iveskit skaiciu");
    let b = +prompt("Iveskit antra skaiciu");
    palyginimas(a,b);
    }
    
    function palyginimas(a,b){
        if (a > b){
            alert("-1");
        } else if (a < b) {
            alert("1");
        } else {
            alert ("0");
        }
    }
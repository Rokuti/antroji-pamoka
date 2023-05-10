window.onload = function(){
    let a = +prompt("Iveskit pirmos krastines ilgi");
    let b = +prompt("Iveskit antros krastines ilgi");
    let c = +prompt("Iveskit trecios krastines ilgi")
    palyginimas(a,b,c);
    }
    
    function palyginimas(a,b,c){
        if (c*c==a*a + b*b){
            alert("trikampis yra statusis");
        } else {
            alert ("trikampis nera statusis");
        }
    }
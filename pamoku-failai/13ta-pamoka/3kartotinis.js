window.onload = function(){
    let a = +prompt("Iveskit skaiciu");
    kartotinis(a);
    }
    
    function kartotinis(a){
        if (a % 3 == 0){
            alert("Skaicius yra 3 kartotinis");
        } else {
            alert("Skaicius yra nera 3 kartotinis");
        }
    }
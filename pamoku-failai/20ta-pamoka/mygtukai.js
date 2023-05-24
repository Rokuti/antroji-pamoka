window.onload = function(){
    let p = document.getElementById("pastraipa");
    let b1 = document.getElementById("1mygtukas");
    let b2 = document.getElementById("2mygtukas");
    let b3 = document.getElementById("3mygtukas");
    let b4 = document.getElementById("4mygtukas");
    let b5 = document.getElementById("5mygtukas");
    let b6 = document.getElementById("6mygtukas");
    console.log(p);
    console.log(b1);
    console.log(b2);
    console.log(b3);
    console.log(b4);
    console.log(b5);
    console.log(b6);

    b1.onclick = function(){
        p.innerHTML = "Java script programavimas";
    }
    b2.onclick = function(){
        alert("Svarbus pranesimas");
    }
    b3.onclick = function(){
        p.innerHTML = prompt("Iveskite teksta");
    }
    b4.onclick = function(){
        p.style.backgroundColor = "tomato";
    }
    b5.onclick = function(){
        p.style.display = "none";
    }
    b6.onclick = function(){
        let ieskomaRaide = prompt("Įveskite Raide, kurios ieškote pastraipoje");
        let raideKartu = 0;
        for (let i = 0; i < p.innerHTML.length; i++) {
            if (p.innerHTML[i].includes(ieskomaRaide)) {
                raideKartu++;
            }
        } alert("jusu raide rasta :" + raideKartu);
    }
    }
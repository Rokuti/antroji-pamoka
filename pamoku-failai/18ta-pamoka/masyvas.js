window.onload = function(){
    const masyvas = [3, 5, 6, 8];
    alert("masyvo sandauga :" + masyvoSandauga(masyvas));
console.log(masyvas);
masyvas.push(3, 5, 6.325);
console.log(masyvas);
masyvas.unshift(10, 0, 0, 10);
console.log(masyvas.length);
masyvas.shift();
console.log(masyvas);
alert("masyvo vidurkis :" + MasyvoVidurkis(masyvas));
masyvoKasAntras(masyvas);
masyvas.unshift(12,13,14,15);
arDidesnisUz10(masyvas);
console.log(filtruotiLyginius(masyvas));
let nuo = +prompt("nuo kiek intervale?");
let iki = +prompt("iki kiek intervale");
console.log(KiekIntervale(masyvas,nuo,iki));
}

function MasyvoVidurkis(masyvas){
    let sum = 0
    for (let i = 0; i < masyvas.length; i++) {
      sum += masyvas[i];
        
    }
    return sum /= masyvas.length
}

function masyvoSandauga(masyvas){
    let sum = 1
    for (let i = 0; i < masyvas.length; i++) {
        sum *=masyvas[i];
    }
    return sum
}

function masyvoKasAntras(masyvas){
    for (let i = 0; i < masyvas.length; i+=2) {
            console.log(masyvas[i]);
        }
        
    }


function arDidesnisUz10(masyvas, d){
    for (let i = 0; i < masyvas.length; i++) {
        if (masyvas[i] > d ){
            console.log(masyvas[i]);
        }
    }
}

function filtruotiLyginius(prekes) {
    const prafiltruotosPrekes = [];
    for (let i = 0; i < prekes.length; i++) {
        if (prekes[i] % 2 == 0) {
            prafiltruotosPrekes.push(prekes[i]);
        }  
    }
    return prafiltruotosPrekes;
}

function KiekIntervale(masyvas, nuo, iki){
    let intervale = 0
    for (let i = 0; i < masyvas.length; i++) {
   if(nuo>masyvas[i] && iki<masyvas[i]){
    intervale++;
   }
    } return intervale
}
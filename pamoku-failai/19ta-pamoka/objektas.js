window.onload = function(){
    let studentas = {id:391, vardasPavarde: "vardenis pavardenis",klase: "8a",metinisVidurkis: 9};
console.log(studentas);
alert(JSON.stringify(studentas));
let x = +prompt("su kokiu vidurkiu lyginti?");
alert("jusu ivesta metinis vidurki studentas siekia :" +studentas.metinisVidurkis>x);
let ieskomaKlase = +prompt("kokioje klaseje ieskote");
alert("Studentas yra jusu ieskojamoje klaseje :"+ arTapatiKlase(studentas,ieskomaKlase));
}

function arTapatiKlase(studentas,klase) {
    if (studentas.klase[0] == klase[0] || studentas.klase[1] == klase[0] || studentas.klase[3] == klase[0] ) {
        return true;
    }
    else {
        return false;
    }
}
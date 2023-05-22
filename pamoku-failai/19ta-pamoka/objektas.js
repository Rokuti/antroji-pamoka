window.onload = function(){
    let studentas = {id:391, vardasPavarde: "vardenis pavardenis",klase: "12a",metinisVidurkis: 9 };
console.log(studentas);
alert(JSON.stringify(studentas));
let x = +prompt("su kokiu vidurkiu lyginti?");
alert("jusu ivesta metinis vidurki studentas siekia :" +studentas.metinisVidurkis>x);
let ieskomaKlase = +prompt("kokioje klaseje ieskote");
}

function arTapatiKlase(ieskomaKlase){
    
}
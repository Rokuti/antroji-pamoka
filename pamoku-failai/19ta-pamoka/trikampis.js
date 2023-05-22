window.onload = function(){
    let a = 2;
    let b = 2;
    let c = 2;
    let trikampis = { a:2, b:2, c:2, plotas:plotas(a,b,c), perimetras:a+b+c };
    console.log(trikampis);
    alert(JSON.stringify(trikampis));
    alert("ar trikampio plotas didesnis uz perimetra :"+trikampis.plotas>trikampis.perimetras);
    let x = 3;
    let y = 3;
    let w = 3;
    let trikampis2 = { a:3, b:3, c:3, plotas:plotas(x,y,w), perimetras:x+y+w };
    alert(plotuPalyginimas(trikampis.plotas, trikampis2.plotas));
}

function pusperimetri(a,b,c){
    console.log(a+b+c);
    return (a+b+c)/2;
}

function plotas (a,b,c){
    let p = pusperimetri(a,b,c);
    console.log(p);
    return Math.sqrt(p*(p-a)*(p-b)*(p-c));
}

function plotuPalyginimas(a,b){
    if(a<b){
        return -1;
    } else if(a==b){
        return 0;
    } else {
        return 1;
    }
}
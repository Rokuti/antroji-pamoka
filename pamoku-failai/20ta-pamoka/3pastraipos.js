window.onload = function(){
    let p1 = document.getElementById("1pastraipa");
    let p2 = document.getElementById("2pastraipa");
    let p3 = document.getElementById("3pastraipa");
    console.log(p1);
    console.log(p2);
    console.log(p3);

    p1.innerHTML = "siandien yra treciadienis";
    p1.style.color = "red";
    p2.style.border = "2px solid black";
    p2.style.padding = "0.5em";
    p3.style.backgroundColor = "bisque";
    p3.style.width = "50%";
    alert(p1.innerHTML);
    p3.innerHTML = p1.innerHTML + p2.innerHTML;
}
window.onload = function() {
let rezultatas1 = trigubaSuma(3,5);
console.log(rezultatas1)
let rezultatas2 = trigubaSuma(-2,11);
console.log(rezultatas2);
let sk1 = 50;
let sk2 = 20;
let rezultatas3 = trigubaSuma(sk1,sk2)
console.log(rezultatas3);
}

function trigubaSuma (a,b) {
return 3*(a+b);
 }
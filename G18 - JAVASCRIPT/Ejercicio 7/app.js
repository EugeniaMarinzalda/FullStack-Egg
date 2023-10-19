let suma=0;

function calcular() {
    let lim = parseInt(document.getElementById("limite").value);
    let num = parseInt(document.getElementById("num1").value);
    let res;
    
    if ((num+suma) < lim) {
        suma+=num;
        res= `<p>El resultado es: </p>`;
    } else {
        suma=lim;
        res=`<p>Alcanzo el limite máximo de: </p>`;
    }

    console.log("limite:" + lim);
    console.log("numero:" + num);
    console.log("suma:" + suma);
    
    document.getElementById("resultado").innerHTML = `<p>${res} ${suma}</p>`;

}

let x = document.getElementsByClassName("validar")
for (let i = 0; i < x.length; i++) {
    x[i].addEventListener('keypress', (event) => {
        if (event.key === 'Enter') {
            event.preventDefault();
            calcular();
        }
    });

}

document.getElementById("boton").onclick = calcular;

/*var limit = parseInt(prompt("Introduzca el Numero Limitante"));
var num = parseInt(prompt("Introduzca un numero para empezar a sumar"));
var aux = num;
if (aux > limit) {
    alert("el numero :" + num + ", ya es mayor a :" + limit);
} else {
    do {
        num = parseInt(prompt("Introduzca un numero para seguir sumando"));
        aux += num;
        console.log("suma " + aux);
    } while (aux < limit);
    alert("el numero :" + aux + ", ya es mayor a :" + limit);
}*/
/*let maximo = prompt("Ingrese el valor maximo:");
let num1 = Number(prompt("ingre un numero"));
var num2 = Number(prompt("ingre otro numero"));
var suma= (num1+num2);
while (suma < maximo) {
    num2 = Number(prompt("ingre otro numero"));
  suma+=num2 ; 
}*/
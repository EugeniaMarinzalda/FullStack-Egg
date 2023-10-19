let max=0;
let min=100;
let sum=0;
let cant=0;
let resultado;

function calcular() {
    let num = parseInt(document.getElementById("num").value);

    if (num != 0) {
        sum += num;
        cant+=1;
        if (num < min) {
            min=num;
        }
        if (num > max){
            max=num;
        } 
        resultado = "Se registraron "+ cant +" numero/s";

    }else{
        resultado="El máximo es: "+max+ "<br>El minimo es: "+min+ "<br>El promedio es: "+(sum/cant);
    }
    
    document.getElementById("resultado").innerHTML = `<p>${resultado}</p>`;
    document.getElementById("num").value = " ";
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



/*function operacion() {
    //var numLimite = Number(prompt("Sr. usuario, introduzca un valor"));
    var suma = Number(0);
    var w = document.getElementById('resultado');

    while (input1 > 0) {
        var numero2 = Number(prompt("Sr. usuario, introduzca un valor"));

        suma = suma + numero2;
        if(suma>input1) break;
    }

    w.innerHTML = suma;
}

function iniciar() {
    input1 = Number(prompt("Sr. usuario, introduce el valor limite positivo"));

    document.getElementById('entrada1').innerHTML = "Valor Limite → " + input1;
}
*/
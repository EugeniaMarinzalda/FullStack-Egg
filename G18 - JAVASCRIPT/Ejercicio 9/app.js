let resultado;

function ejecutar() {
    let frase = document.getElementById("frase").value;
    let separar = [];
    for (let i = 0; i < frase.length; i++) {
        separar[i]=frase.substring(i,i+1);
        
    }
    
    document.getElementById("resultado").innerHTML = `<p>La frase es:<br>${frase}<br>La frase con espacios es:<br>${separar.join(" ")}</p>`;
    document.getElementById("frase").value = " ";
}


let x = document.getElementsByClassName("validar")
for (let i = 0; i < x.length; i++) {
    x[i].addEventListener('keypress', (event) => {
        if (event.key === 'Enter') {
            event.preventDefault();
            ejecutar();
        }
    });

}

document.getElementById("boton").onclick = ejecutar;



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
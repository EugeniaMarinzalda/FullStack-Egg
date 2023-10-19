function calcular() {
    let num = document.getElementById("num").value;
    let respuesta;
    if (num != 0) {
        if (num % 2 === 0) {
            respuesta = "El numero es par";
        } else {
            respuesta = "El numero es impar";
        }
    }else{
        respuesta = "El numero no es par ni impar"
    }
    document.getElementById("resultado").innerHTML = `<p>${respuesta}</p>`;
}


let x = document.getElementById("num")
x.addEventListener('keypress', (event) => {
    if (event.key === 'Enter') {
        event.preventDefault();
        calcular();
    }
});



/*
let x = document.getElementsByClassName("validar")
for (let i = 0; i < x.length; i++) {
}    
*/
document.getElementById("boton").onclick = calcular;

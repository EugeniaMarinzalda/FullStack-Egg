
function calcular() {

    let radios = document.getElementsByName("operacion");
    let selected = Array.from(radios).find(radio => radio.checked).value;
    let num1 = Number.parseInt(document.getElementById("num1").value);
    let num2 = Number.parseInt(document.getElementById("num2").value);
    let respuesta;
    
    switch (selected) {
        case "S":
            respuesta = num1 + num2;
            break;
        case "R":
            respuesta = num1 - num2;
            break;
        case "M":
            respuesta = num1 * num2;
            break;
        case "D":
            respuesta = num1 / num2;
            break;
    }

    document.getElementById("resultado").innerHTML = `<p>El resultado es ${respuesta}</p>`;
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


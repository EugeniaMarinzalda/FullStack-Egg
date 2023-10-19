function calcular() {
    let opcion = document.getElementById("opcion").value;
    let num1 =Number.parseInt(document.getElementById("num1").value);
    let num2 =Number.parseInt(document.getElementById("num2").value);
    let respuesta;
    console.log(opcion, num1, num2);
    switch (opcion) {
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


document.getElementById("num2").addEventListener('keypress', (event) => {
    if (event.key === 'Enter') {
        event.preventDefault();
        calcular();
    }
});

document.getElementById("num1").addEventListener('keypress', (event) => {
    if (event.key === 'Enter') {
        event.preventDefault();
        document.getElementById("resultado").innerHTML = `<p>No te olvides de cargar el segundo numero</p>`;
    }
});



document.getElementById("boton").onclick = calcular;

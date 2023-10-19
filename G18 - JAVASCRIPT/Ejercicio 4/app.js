
function calcular() {
    let respuesta = document.getElementById("respuesta").value.toUpperCase();
    respuesta = (respuesta == "S" || respuesta == "N")? "Correcta" : "Incorrecta";
    
    document.getElementById("resultado").innerHTML = `<p>La opcion es ${respuesta}</p>`;
}

document.getElementById("respuesta").addEventListener('keypress', (event) => {
    if (event.key === 'Enter') {
        event.preventDefault();
        calcular();
    }
});
document.getElementById("boton").onclick = calcular;

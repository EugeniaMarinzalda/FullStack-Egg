function calcular() {
    let edad = document.getElementById("respuesta").value;
    let respuesta = (edad > 17) ? "Mayor" : "Menor";
    
    document.getElementById("resultado").innerHTML = `<p>Usted es ${respuesta}</p>`;
}

document.getElementById("respuesta").addEventListener('keypress', (event) => {
    if (event.key === 'Enter') {
        event.preventDefault();
        calcular();
    }
});
document.getElementById("boton").onclick = calcular;

function obtener() {
    let Persona = {
        nombre: document.getElementById("nombre").value,
        edad: document.getElementById("edad").value,
        sexo: document.getElementById("sexo").value,
        peso: document.getElementById("peso").value,
        altura: document.getElementById("altura").value
    };
    document.getElementById("resultado").innerHTML = `<p>La persona es:</p>
    <p>Nombre: ${Persona.nombre}</p>
    <p>Edad: ${Persona.edad}</p>
    <p>Sexo: ${Persona.sexo}</p>
    <p>Peso: ${Persona.peso}</p>
    <p>Altura: ${Persona.altura}</p>`;
}

document.getElementById("boton").onclick = obtener;

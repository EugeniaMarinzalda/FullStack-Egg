
function obtener() {
    let nombre = document.getElementsByName("nombre");
    let apellido = document.getElementsByName("apellido");
    

    document.getElementById("resultado").innerHTML = `<p>El nombre es: ${nombre[0].value}<br>El apellido es: ${apellido[0].value} </p>`;
    
   
}



document.getElementById("boton").onclick = obtener;

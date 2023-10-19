
function resaltar() {
    const texto = document.getElementById("texto");

    let palabra = texto.innerHTML.split(" ");

    for (let i = 0; i < palabra.length; i++) {
        if(palabra[i].length>8) {
            palabra[i] = "<span>"+palabra[i]+"</span>";
        }
        
    }
    
    palabra= palabra.join(" ");
    document.getElementById("texto").innerHTML = `${palabra}`;
   
}


document.getElementById("boton").onclick = resaltar;

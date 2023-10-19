let resultado;

function ejecutar() {
    let cadena = document.getElementById("palabra").value;
    let mayor = 0;
    palabras = cadena.split(" ");
    palabras.forEach(palabra => {
           if(palabra.length>mayor){
            mayor=palabra.length;
           }    
    });
    palabras.forEach(palabra => {
        if(palabra.length==mayor){
            resultado = palabra;
        }
    }); 
   

    document.getElementById("resultado").innerHTML = `<p>La palabra más larga es:<br>${resultado}</p>`;
    document.getElementById("palabra").value = " ";
}

let x = document.getElementById("palabra")

    x.addEventListener('keypress', (event) => {
        if (event.key === 'Enter') {
            event.preventDefault();
            ejecutar();
        }
    });

document.getElementById("boton").onclick = ejecutar;

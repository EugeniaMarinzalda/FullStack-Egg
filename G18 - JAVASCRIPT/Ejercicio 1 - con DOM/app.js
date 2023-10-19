/*
Escribir un algoritmo en el cual se consulte al usuario que ingrese ¿cómo está el día de
hoy? (soleado, nublado, lloviendo). A continuación, mostrar por pantalla un mensaje que
indique “El día de hoy está ...”, completando el mensaje con el dato que ingresó el usuario.
*/

function atrapar(){
   let x = document.getElementById("respuesta").value; 
   if (x==""){
        
     x="como quiere";
   }
   document.getElementById("resultado").innerHTML = `El dia de hoy esta ${x}`;
   
}

document.getElementById("respuesta").addEventListener('keypress', (event) => {
    if (event.key === 'Enter') {
        event.preventDefault();
        atrapar();
    }
});

document.getElementById("boton").onclick = atrapar;

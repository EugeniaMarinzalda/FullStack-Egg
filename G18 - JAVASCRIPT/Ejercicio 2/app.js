/*
Conocido el número en matemática PI π, pedir al usuario que ingrese el valor del radio
de una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que
para calcular el área y el perímetro se utilizan las siguientes fórmulas:
area = PI * radio2
perimetro = 2 * PI * radio

*/

function atrapar(){
   const pi = Math.PI;
   let x = document.getElementById("respuesta").value; 
   let area = pi**x;
   let perimetro = 2*pi*x;
   document.getElementById("resultado").innerHTML = `El {área es: ${area}
   El perimetro es: ${perimetro}`;
   
}

document.getElementById("respuesta").addEventListener('keypress', (event) => {
    if (event.key === 'Enter') {
        event.preventDefault();
        atrapar();
    }
});

document.getElementById("boton").onclick = atrapar;

let resultado;

function ejecutar() {
    let palabra = document.getElementById("palabra").value;
    
    let func = (palabra) => {
        return palabra.split('').reverse().join('');
    };
    
    resultado = func(palabra);
    document.getElementById("resultado").innerHTML = `<p>${resultado}</p>`;
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

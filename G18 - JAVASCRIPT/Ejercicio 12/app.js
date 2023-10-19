let resultado;

function ejecutar() {
    let argumento = document.getElementById("palabra").value;
    let func = (argumento) => `El tipo de dato es: ${typeof argumento}` ;
    resultado= func (argumento);

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

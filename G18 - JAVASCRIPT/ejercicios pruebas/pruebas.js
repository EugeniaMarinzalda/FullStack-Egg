function muestraMensaje() {
    console.log('Gracias por pinchar');
}

setTimeout(function() {
    console.log("He ejecutado la función");
}, 2000);

document.getElementById("pinchable").onclick = muestraMensaje;    

// Fetch GET
async function peticion() {

    let response = await fetch ("https://rickandmortyapi.com/api/character");
    let data = await response.json();
    return data;
}

let r = await peticion();
console.log(r);

//llevar a la consola para obtener solo nombres
fetch ("https://rickandmortyapi.com/api/character")
.then(response => response.json())
.then(data => {
    const {results} = data;
    console.log(results);
});
//para info

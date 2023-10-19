function obtener() {
    /*Creo el molde*/
    class Persona {
        nombre;
        edad;
        sexo;
        peso;
        altura;
    };
    /*Tomo los valores con DOM*/ 
    var persona = new Persona();
        persona.nombre= document.getElementById("nombre").value;
        persona.edad= document.getElementById("edad").value;
        persona.sexo= document.getElementById("sexo").value;
        persona.peso= document.getElementById("peso").value;
        persona.altura= document.getElementById("altura").value;
    
    /*Muestro las propiedades y valores */
    document.getElementById("resultado").innerHTML = `<p>La persona es:</p>
    <p>Nombre: ${persona.nombre}</p>
    <p>Edad: ${persona.edad}</p>
    <p>Sexo: ${persona.sexo}</p>
    <p>Peso: ${persona.peso}</p>
    <p>Altura: ${persona.altura}</p>` ;
};

document.getElementById("boton").onclick = obtener;

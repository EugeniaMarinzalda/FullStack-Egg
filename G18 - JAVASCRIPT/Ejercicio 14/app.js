function obtener() {
    /*Creo el molde*/
    class Libro {
        ISBN;
        Titulo;
        Autor;
        cantPaginas;
    };
    /*Tomo los valores con DOM*/ 
    var libro = new Libro();
        libro.ISBN= document.getElementById("ISBN").value;
        libro.Titulo= document.getElementById("titulo").value;
        libro.Autor= document.getElementById("autor").value;
        libro.cantPaginas= document.getElementById("paginas").value;
  
    
    /*Muestro las propiedades y valores */
    document.getElementById("resultado").innerHTML = 
    /* `<p>El libro es:</p>
    <p>ISBN: ${libro.ISBN}</p>
    <p>Titulo: ${libro.Titulo}</p>
    <p>Autor: ${libro.Autor}</p>
    <p>Cantidad de páginas: ${libro.cantPaginas}</p> */
    `${JSON.stringify(libro)}`;
};

document.getElementById("boton").onclick = obtener;

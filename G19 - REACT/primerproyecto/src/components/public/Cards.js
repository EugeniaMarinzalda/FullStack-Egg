import React, { useEffect, useState } from 'react'
import RickAndMortyService from '../../services/RickAndMorty.service';
import Card from './Card'
/* Difiere en repositorio
import React from 'react'
import { useEffect, useState } from 'react/cjs/react.development'
*/

/* export const Cards = ({personajes}) => { */
export const Cards = ({}) => {

    const [personajes, setPersonajes] = useState([]);

    useEffect(() => { //escucha activa
        RickAndMortyService.getAllCharacters()
            .then((data) => setPersonajes(data.results))
            .catch((error) => console.log(error));

    }, [personajes]) // variable a escucha constantemente por si cambia. Puede estar vacia.

    // console.log(personajes) //en console log lo manda vacio primero, respeta el ciclo de vida de los componentes en compoDidM

    //en base a la variable card list genera y devuelve cartas con esos elementos
    const cardList = personajes.map((p) => <Card personaje={p} key={p.id} />);

    return (
        <div>
            <div className="album py-5 bg-light">
                <div className="container">

                    <div className="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
                        {cardList}
                    </div>
                </div>
            </div>
        </div>
    )
}



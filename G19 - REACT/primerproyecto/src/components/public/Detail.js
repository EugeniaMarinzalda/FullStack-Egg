// Difiere - useLocation

import React from 'react'
import { Link, useParams } from 'react-router-dom'
import { useEffect, useState } from 'react';
import RickAndMortyService from '../../services/RickAndMorty.service';
import Card from './Card';

export const Detail = () => {

  const [personaje, setPersonaje] = useState();

  const {id} = useParams();

  //const { pathname } = useLocation();

  useEffect(() => {
      //console.log(pathname);
    RickAndMortyService.getCharactersById(id)
      .then((data) => setPersonaje(data))
  }, [id])

 

console.log(personaje);

  if (!personaje) {
    return <p>Cargando...</p>; // Otra alternativa mientras se cargan los datos
  }

    return (
  
  
      <div className="col" id="personaje">
        <div className="card shadow-sm">
          <div className="imagen-contenedor" >
           <img src={personaje.image} className="bd-placeholder-img card-img-top" width="100%" alt="imagen del personaje" />
          </div>
          <div className='DetallePersonaje'>
            <h4 className='green'>{personaje.species}</h4>
            <h3 className='mb-60 text-dark'>{personaje.name}</h3>
            <div className="card-body">
              <p className="card-text">
                N° de personaje: {personaje.id} <br />
                Estado: {personaje.status}<br />
                Tipo: {personaje.type}<br />
                Genero: {personaje.gender}</p>
              <div className="d-flex justify-content-between align-items-center">
  
                <small className="text-muted">9 mins</small>
              </div>
            </div>
          </div>
  
          <Link to={"/"} className="mr-3 btn brn-primary btn-lg">
            Volver
          </Link>
        </div>
      </div >
    )

  /*repo

//Por que no lo hace en css?
 const detailCard = {
   width: '100%', 
   margin: 'auto', 
   background: 'white', 
  

}

   return (
    <div className="card mb-3" style={{ 'background': 'gainsboro' }}>
      <div className="row g-0 mt-4 mb-4" style={detailCard}>
        <div className="col-md-3">
          <img src={personaje.image} className="img-fluid rounded-start imgDetalle" alt="img del personaje" />
        </div>
        <div className="col-md-8 detallePersonaje">
          <div className="card-body">
            <h5 className="card-title">{personaje.name}</h5>
            <p className="card-text"><small className=""> Specie: {personaje.species}</small></p>
            <p className="card-text"><small className=""> Status: {personaje.status}</small></p>
            <p className="card-text"><small className=""> Gender: {personaje.gender}</small></p>
            <p className="card-text"><small className=""> Created: {personaje.created}</small></p>
          </div>
          <div className="btn-group" style={{ 'marginLeft': '15px' }}>
            <button
              type="button"
              className="btn btn-sm btn-outline-secondary"
            >
              <Link to={'/'} className="nav-link px-2 text-success">Inicio</Link>
            </button>
          </div>
        </div>
      </div>
    </div>
  )*/

} 

export default Detail


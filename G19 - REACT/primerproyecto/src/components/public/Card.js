import React from 'react'
import { Link } from "react-router-dom";

// se cambio mascota por personaje


export const Card = ({ personaje }) => {
    return (

        <div className="col">
            <div className="card shadow-sm">
                <img src={personaje.image} className="bd-placeholder-img card-img-top" width="100%" alt="imagen del personaje" />
                <h4 className='green'>{personaje.species}</h4>
                <h3 className='mb-60 text-dark'>{personaje.name}</h3>
                <div className="card-body">
                    <p className="card-text">N° de personaje: {personaje.id} <br />Estado: {personaje.status}<br />Tipo: {personaje.type}<br />Genero: {personaje.gender}<br />Lugar de Nacimiento: {personaje.location.name}</p>
                    <div className="d-flex justify-content-between align-items-center">
                        <div className="btn-group">
                            <button type='button' className='btn-btn-sm btn-outline-secondary'>
                                <Link
                                     to={`/detail/${personaje.id}` }
                                    className="mr-3 btn brn-primary btn-lg"
                                >
                                    Detalle
                                </Link>
                            </button>

                        </div>
                        <small className="text-muted">9 mins</small>
                    </div>
                </div>
            </div>
        </div>

    )
}

export default Card
/*
  return (
    <div className="col">
      <div className="card shadow-sm">
        <img
          width="100%"
          src={personaje.image}
          alt="Img personajes"
        />
        <h3 className="m-2 text-center text-dark">{personaje.name}</h3>
        <div className="card-body">
          <p className="card-text">
            This is a wider card with supporting text below as a natural lead-in
            to additional content. This content is a little bit longer.
          </p>
          <div className="d-flex justify-content-between align-items-center">
            <div className="btn-group">
              <button
                type="button"
                className="btn btn-sm btn-outline-secondary"
              >
                <Link to={`/detail/${personaje.id}`} className="nav-link px-2 text-secondary">Detalle</Link>
              </button>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
*/
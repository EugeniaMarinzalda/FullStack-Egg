//ejercicio 2
import React from 'react'
import { Link } from 'react-router-dom'

export const Navbar = () => {
  return (
    <div>
      <header className="p-3 bg-dark text-white">
        <div className="container">
          <div className="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
            <a href="/" className="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
              <img src="/perezoso.ico" alt="Perezoso Icon" className="App-logo" />
              {/* <img className="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap"><use link: href="/perezoso" /></svg> */}
            </a>

            <ul className="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
              {/* <li><Link to='/' className="nav-link px-2 text-secondary">Home</Link></li> s/ repo*/}
              <li><a href="/" id="Home" className="nav-link px-2 text-secondary">Home</a></li>
              {/*<li><a href="/user-form" className="nav-link px-2 text-secondary">Formulario</a></li>
              <li><a href="#" className="nav-link px-2 text-white">Features</a></li>
              <li><a href="#" className="nav-link px-2 text-white">Pricing</a></li>
              <li><a href="#" className="nav-link px-2 text-white">FAQs</a></li>
              <li><a href="#" className="nav-link px-2 text-white">About</a></li> */}
            </ul>

            <form className="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3">
              <input id="search" type="search" className="form-control form-control-dark" placeholder="Buscar..." aria-label="Search" />
            </form>

            <div className="text-end">
              {/* <button type="button"  className="btn btn-outline-light me-2">Login</button> */}

              <Link to="/login" className="btn btn-outline-light me-2">Ingrese</Link>
              <Link to="/user-form" className="btn btn-warning">Registrese</Link>
            </div>
          </div>
        </div>
      </header>
    </div>
  )
}

export default Navbar

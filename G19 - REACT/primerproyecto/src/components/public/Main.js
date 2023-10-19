//https://rickandmortyapi.com/documentation/#info-and-pagination
//ejercicio 2

import React, { Component } from 'react'
import { Cards } from './Cards';

export default class Main extends Component {

    constructor(props) {
        //cada vez que uso constructor debo usar props(propiedades que recibira este main comp) y super
        super(props);
        //con esto montamos el componente
        this.state = {personajes : [] }; // inicia como array vacio
    }

    componentDidMount() {

      /*  RickAndMortyService.getAllCharacters()
       .then((data) => this.setState({personajes: data.results}))
       .catch((error) => console.log(error)); */

    }

    render() {
        
        return (
            <div>
                <main>

                    <section className="py-5 text-center container">
                        <div className="row py-lg-5">
                            <div className="col-lg-6 col-md-8 mx-auto">
                                <h1 className="fw-light">Hola Mundo de EGG!</h1>
                                <p className="lead text-muted">Bienvenidos a los primeros pasos con REACT</p>
                                <h2 className="lead text-muted">Te mostramos los personajes de <br></br><strong>Rick and Morty</strong></h2>
                                {/*
                                    <p>
                                    <a href="#" className="btn btn-primary my-2">Main call to action</a>
                                    <a href="#" className="btn btn-secondary my-2">Secondary action</a>
                                </p>
                                */}
                            </div>
                        </div>
                    </section>
                   {/*  <Cards personajes={this.state.personajes}/>   */}                  
                    <Cards/>                                    
                </main>
            </div>
        )
    }
}



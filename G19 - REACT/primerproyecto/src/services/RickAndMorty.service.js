//servicio que es una capa especializada en comunicarse con apis
import { API_RM } from "../constats/api.constants";


class RickAndMortyService {

    async getAllCharacters(){
        const response = await fetch(API_RM.CHARACTERS());//API_RICKMORTY.CHARACTERS() es una funcion, va con ()
        //interceptor
        return response.json();//si no lo convierto a json nos trae el response y puedo ver el status, body, etc
    }
    
    async getCharactersById(id){
        const response = await fetch(API_RM.CHARACTERS_BY_ID(id));//API_RICKMORTY.CHARACTER_BY_ID() es una funcion, va con ()
        //interceptor
        return response.json();
    }

}

export default new RickAndMortyService();//esto nos va a permitir usarla desde donde necesitemos
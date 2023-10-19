import { useState } from "react"

export const useUserForm = (initialState = {}) => {
 //es un hook que nos va a permitir manejar un formulario


    const [form, setForm] = useState(initialState);
   

    const handleChanges = ({target}) => {
        //esta funcion se va a encargar de escuchar cambios en un input y va a tomar el target
        const{ name, value } = target;

        /* console.log("target", target);
        console.log("name", name);
        console.log("value", value); */

        setForm({
                ...form,//esto hace que si el form ya tenia valor tmb los incluya y agregue los nuevos
                [name]: value,
        });

        
    } ;

    return {
            form, setForm,handleChanges,
    };

};
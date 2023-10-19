import React, { useEffect, useState } from 'react'
import { useUserForm } from '../../hooks/Custom.hook'

export const Login = () => {


  const { form, handleChanges } = useUserForm(); // obtiene los datos del formulario y se almacena en form



/*   const [areEquals, setAreEquals] = useState(true);// se va a encargar de ver si las contraseñas son iguales */

  const [passwordConfirmation, setPasswordConfirmation] = useState();//se encarga de atrapar la unica clave que vamos a mandar

  const [pass, setPass] = useState(true);

  const validPass = () => { //comprueba que la password no este indefinida
    const { password } = form;
    if (password !== undefined) {
      setPass(false)
    } else {
      setPass(true)
    }
    return pass
  }

  const handlePasswordConfirmation = (e) => {
    //la e hace refencia al input de donde se ejecuta la funcion // esta en confirmar contraseña
    setPasswordConfirmation(e.target.value);//aca vemos el valor de ese input
  }
/* 
  useEffect(() => {
    const { password } = form;//hago un destructuring de form, es decir, saco lo que me interesa de form, en este caso password, que es el name del input de contraseña
    setAreEquals(password === passwordConfirmation);
    validPass()
  }, [passwordConfirmation, pass])

 */
  const handleSubmit = (e) => {
    // se va a encargar de atrapar el envio del formulario
    e.preventDefault();
    console.log(form);

  }

  return (
    <div>
      <form className='needs-validation' noValidate>
        <div className='form'>

          <legend>Ingrese</legend>

          <div className="mb-3">
            <label htmlFor="email" className="form-label">E-mail</label>
            <input
              type="email"
              name="email"
              id="email"
              className="form-control"
              placeholder="correoelectronico@ejemplo.com"
              autoComplete="email"
              onChange={handleChanges}
            />
          </div>

          <div className="mb-3">
            <label htmlFor="clave" className="form-label">Clave</label>
            <input
              type="password"
              /* type="text" */
              name="password" //con esto se va a ir generando el json que mandamos a la api porq asi lo armamos en el hook
              id="clave"
              className="form-control"
              placeholder="Clave"
              autoComplete="off"
              onChange={handleChanges}
            />

          </div>
          


          <button
            /* disabled={!areEquals || pass} */
            type="submit"
            className="btn btn-primary"
            onClick={handleSubmit}
          >
            Ingresar
          </button>

        </div>
      </form>

    </div>
  )

}

export default Login

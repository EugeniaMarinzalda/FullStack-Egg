import './App.css';
import { Routes, Route, BrowserRouter} from 'react-router-dom';
import { Footer } from './components/public/Footer';
import { Navbar } from './components/public/Navbar';
import { React } from 'react';
import { Detail } from './components/public/Detail';
import { UserForm } from './components/public/UserForm';
import Main from './components/public/Main';
import Login from './components/public/Login';
import Ejercicio1 from './components/public/Ejercicio1';


function App() {
 
  return (

    <div>
      
      <Navbar />
      {/* <Main/> */}
      <Ejercicio1 />
      
      {/* <BrowserRouter> */}
        
        <Routes>
          <Route exact path={"/"} Component={Main} />
          <Route exact path={"/detail/:id"} Component={Detail} />
          <Route exact path={"/user-form"} Component={UserForm} />
          <Route exact path={"/login"} Component={Login} />
        </Routes> 
     {/*  </BrowserRouter> */}

      <Footer />
    </div>
  );
}

export default App;

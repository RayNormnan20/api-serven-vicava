import './App.css';

import {BrowserRouter as Router, Route, Routes} from  'react-router-dom';
import Login from './Components/Login';
import Registro from './Components/Registro';

function App() {
  return (
   <Router>
    <div className='App'>
      <h1>Serven</h1>
      <div className='contenedor-principal'>
      <Routes>
        {/* Ruta para el  Login*/}
        <Route  path='/login' element={<Login />}/>
        {/* Ruta para el  Registro*/}
        <Route  path='/registro' element={<Registro/>}/>
      </Routes>
      </div>
    </div>
   </Router>
  );
}

export default App;

import './App.css';
import './stylesheets/Home.css';
import './stylesheets/logo.css';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Login from './Components/Login';
import Registro from './Components/Registro';
import VerificationPage from './Components/VerificationPage';
import Home from './views/Home';
import Layout from './views/Layout'; // Importar Layout

function App() {
  return (
    <Router>
      <div className="App">
        <Routes>
          {/* Rutas dentro del Layout */}
          <Route path="/" element={<Layout />}>
            <Route path="/home" element={<Home />} />
         
          </Route>

          {/* Rutas fuera del Layout */}
          <Route path="/login" element={<Login />} />
          <Route path="/registro" element={<Registro />} />
          <Route path="/verification" element={<VerificationPage />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
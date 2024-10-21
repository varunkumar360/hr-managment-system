
import './App.css';
import FooterComponent from './components/FooterComponent.jsx';
import ListEmployee from "./components/ListEmployeeComponent"
import HeaderComponent from './components/HeaderComponent';
import {BrowserRouter, Routes, Route} from 'react-router-dom'
import ListEmployeeComponent from './components/ListEmployeeComponent';
import EmployeeComponent from './components/EmployeeComponent.jsx';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
       <HeaderComponent />
        <Routes>
          {/* //http://localhost:3000 */}
          <Route path='/' element = { <ListEmployee />}></Route>
          {/* // http://localhost:3000/employee */}
          <Route path='/employee' element = { <ListEmployeeComponent /> } ></Route>
          {/* // http://localhost:3000/add-employee */}
          <Route path='/add-employee' element = { <EmployeeComponent />}></Route>

          {/* // http://localhost:3000/edit-employee/1 */}
          <Route path='/edit-employee/:id' element = { <EmployeeComponent />}></Route>
        </Routes>
       <FooterComponent />
      </BrowserRouter>
    </div>
  );
}

export default App;

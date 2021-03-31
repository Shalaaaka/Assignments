import logo from './logo.svg';
import './App.css';
import {BrowserRouter,Route,Switch} from 'react-router-dom'
import Home from './components/Home'
import Project from './components/Project'
import Services from './components/Services'
import Contact from './components/Contact'
import Menu from './components/Menu'

function App() {
  return (
    <div className="App">
      <BrowserRouter>
      <Menu></Menu>
      <>
      <Switch>
        <Route exact path="/" component={Home}></Route>
        <Route exact path="/project" component={Project}></Route>
        <Route exact path="/services" component={Services}></Route>
        <Route exact path="/contact" component={Contact}></Route>
      </Switch>
      </>
      </BrowserRouter>
    </div>
  );
}

export default App;
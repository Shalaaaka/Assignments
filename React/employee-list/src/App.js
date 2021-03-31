import logo from './logo.svg';
import './App.css';
import React,{Component} from 'react';
import Employee from './Components/Employee'

class App extends Component
{
  constructor(props)
  {
    super(props);
  }
  render()
  {
    return (
      <Employee/>
    )
  }
}


export default App;

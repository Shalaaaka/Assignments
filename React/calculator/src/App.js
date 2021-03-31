import logo from './logo.svg';
import './App.css';
import Calculator from './components/calculator'

import { Component } from 'react';

class App extends Component
{
  constructor(props)
  {
    super(props);
  }
  render()
  {
    return (
      <Calculator/>
 
    );
  }
}

export default App;

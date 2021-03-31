import React, { useState } from "react";
import './App.css';
import Time from './components/time'
import DateClass from './components/Dateclass'
import ToggleButton from './components/ToggleButton'

function App() {
  const [selected, setSelected] = useState(false);
  return (
    <div className="App">
      <Time/>
      <DateClass/>
      <ToggleButton
        selected={selected}
        toggleSelected={() => {
          setSelected(!selected);
        }}
        />
    </div>
  );
}

export default App;

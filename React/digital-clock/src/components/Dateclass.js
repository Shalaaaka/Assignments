import React,{useState} from 'react'
//import {Switch} from 'antd'
import ToggleButton  from 'react-toggle-button'

const Dateclass=()=>
{
    const [toggle,setToggle]=useState(false);
    const toggler=()=>
    {
        toggle?setToggle(false):setToggle(true);
    }
     const currDate=new Date().toLocaleDateString();

    return (
        <div id="date">
            <p id="t1">Check Date</p>
            <ToggleButton  id="switch" onClick={toggler}></ToggleButton >
            {toggle ? <span className="tg">{currDate}</span> : ''}
        </div>
    )
}
export default Dateclass;
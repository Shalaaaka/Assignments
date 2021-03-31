import React from 'react'
import {NavLink} from 'react-router-dom'

const Menu=()=>
{
    return (
        <div className="navbar">
            <NavLink exact className="active_class" to="/">Home</NavLink>
            <NavLink exact className="active_class" to="/project">Project</NavLink>
            <NavLink exact className="active_class" to="/services">Services</NavLink>
            <NavLink exact className="active_class" to="/contact">Contact</NavLink>
        </div>
    )
};
export default Menu;
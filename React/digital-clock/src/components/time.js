import React, { Component } from 'react';
import {Switch} from 'antd';

class time extends Component
{
    state={
        date:new Date()
    }
    constructor()
    {
        super();
    }

    callMe()
    {
        setInterval(()=>{
            this.setState({date:new Date()});
        },1000);
    }
    currTime=new Date().toLocaleDateString();

    render()
    {
        return(
            <div id="digitalclock">
                <h1 id="title">Digital Clock</h1>
                <p id="timer">
                    {this.state.date.toLocaleTimeString()}
                    {this.callMe()}
                </p>
               
            </div>
        )
    }

}
export default time;
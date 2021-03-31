import React, { useEffect, useState } from 'react'

const Temperature =()=>
{
    const [city,setCity]=useState(null);
    const [search,setSearch]=useState("Pune")

    useEffect (()=>{
        const fetchApi=async()=>
        {
            const url=`http://api.openweathermap.org/data/2.5/weather?q=${search}&units=metric&appid=29f9225c3f3f2cf5dc03a82180aa50b4`
            const response=await fetch(url);
            const resJson = await response.json();
            setCity(resJson.main);
            
        };
        fetchApi();
    })

    return (
        <div className="mainclass">
            <div className="header">
                <h1>Weather</h1>
            </div>
            <div className="searchbar">
                <input type="search"
                onChange={(event)=>{setSearch(event.target.value)}}>
                </input>
                </div>
            {!city?(<p>No data found</p>):(
                <div>

                <div className="info">
                    <h2 className="location">
                    <i className="fas fa-street-view"></i>
                     {search}
                    </h2>
                    <h1 className="temp">
                       {city.temp}°C 
                    </h1>
                    <p>
                       Min: {city.temp_min}°C | Max: {city.temp_max}°C
                    </p>
                    <p>
                       
                    </p>
                </div>
           </div>
            )}
      </div>       
    )
}
export default Temperature;

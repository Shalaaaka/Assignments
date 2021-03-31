import logo from './logo.svg';
import './App.css';
import React,{Component} from 'react';
import Employee from './Container/Employee';
import CreateEmployee from './Components/CreateEmployee'

class App extends Component
{
  constructor(props)
  {
    super(props);

    this.state={
      name:'',
      job:'',
      employees:[]
    }
  };

  handleFormSubmit = (e) => {
    e.preventDefault();

    let employees = [...this.state.employees];

    employees.push({
      name:this.state.name,
      job:this.state.job
    });

    this.setState({
      employees,
      name:'',
      job:''
    });

  };
  handleInputChange = (e) => {
    let input = e.target;
    let name = e.target.name;
    let value = input.value;

    this.setState({
      [name]: value
    })
  };

  handleDeleteRow=(i) =>{
    let employees = [...this.state.employees]
    employees.splice(i, 1)
    this.setState({ 
      employees: employees
    });
  };

  render()
  {
    return(
      <div className="App">
        <Employee employees = {this.state.employees}
        handleDeleteRow={this.handleDeleteRow}
        />
        <CreateEmployee handleFormSubmit={ this.handleFormSubmit } 
          handleInputChange={ this.handleInputChange }
          name={this.state.name}
          job={this.state.job}/>

      </div>
    );
  }
}
export default App;

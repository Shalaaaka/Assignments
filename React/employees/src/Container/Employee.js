import React,{Component} from 'react';
import {employees} from '../data';
class Employee extends Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        const employees=this.props.employees;
        return (
            <div>
                <table id="table" className="table table-striped">
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Job</th>
                            <th>Remove</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            employees.map(emp=>{
                                return (
                                    <tr>
                                        <td>{emp.name}</td>
                                        <td>{emp.job}</td>
                                        <td>
                                            <button onClick={this.props.handleDeleteRow} type="button" className="btn">
                                                Delete
                                            </button>
                                        </td>
                                    </tr>
                                );
                            })
                        }
                    </tbody>
                </table>
            </div>
        )
    }
}
export default Employee;
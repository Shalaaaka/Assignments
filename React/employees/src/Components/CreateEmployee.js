import React,{Component} from 'react';


class CreateEmployee extends Component
{
    constructor(props)
    {
        super(props);
    }
    render()
    {
        return (
            <div className="Add-Employee">
                <h1>Add new employee</h1>
                <form onSubmit={this.props.handleFormSubmit}>
                    <div className="form-group">
                        <label className="labelclass">Name: </label> 
                        <input
                        type="text"
                        className="form-control"
                        name="name"
                        value={this.props.newName} 
                        required
                        onChange={this.props.handleInputChange}
                        placeholder="Enter name"
                        />
                    </div>
                    <div className="form-group">
                        <label className="labelclass">Job: </label>
                        <input
                        type="text"
                        className="form-control"
                        name="job"
                        value={this.props.newJob} 
                        required
                        onChange={this.props.handleInputChange} 
                        placeholder="Enter job"
                        />
                    </div>
                    <div className="form-group">
                        <button className="btn"
                        type="submit"
                        className="btn btn-default"
                        >
                            Submit
                        </button>
                    </div>
                </form>
            </div>
        )
    }
}

export default CreateEmployee;
import React, {Component} from "react";
import SingleUserRegistration from './SingleUserRegistration';
import AddUserRegistration from './AddUserRegistration';

export default class UserRegistration extends Component {

    constructor(props) {
        super(props);
        this.state = {
            contacts: [],
        };
    }

    componentDidMount() {
        fetch('http://localhost:8080/userRegistration')
            .then(response => response.json())
            .then(data => this.setState({contacts: data}))
    }

    render() {
        return (
            <div>

                <div className="row">
                    <AddUserRegistration/>
                </div>


                <div className="row">
                    {this.state.contacts.map((item) => (
                        <SingleUserRegistration key={item.id} item={item}/>
                    ))}
                </div>

            </div>
        )
    }
}

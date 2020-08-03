import React, {Component} from "react";
import SingleAddress from './SingleAddress';
import AddAddress from './AddAddress';

export default class Address extends Component {

    constructor(props) {
        super(props);
        this.state = {
            address: [],
        };
    }

    componentDidMount() {
        fetch('http://localhost:8080/address')
            .then(response => response.json())
            .then(data => this.setState({address: data}))
    }

    render() {
        return (
            <div>

                <div className="row">
                    <AddAddress/>
                </div>


                <div className="row">
                    {this.state.address.map((item) => (
                        <SingleAddress key={item.id} item={item}/>
                    ))}
                </div>

            </div>
        )
    }
}

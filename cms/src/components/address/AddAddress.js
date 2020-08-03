import React, {Component} from "react";

export default class AddAddress extends Component {

    submitAddress(event) {
        event.preventDefault();

        let address = {

            city: this.refs.city.value,
            district: this.refs.district.value,
            province: this.refs.province.value,
            houseNumber: this.refs.houseNumber.value,
            streetName: this.refs.streetName.value,
            tole: this.refs.tole.value,
            wardNumber: this.refs.wardNumber.value,


        }
        fetch("http://localhost:8080/address",
            {
                method: "POST",
                headers: {
                    "content-type": "application/json",
                },
                body: JSON.stringify(address),

            })
            .then(response => response.json());
        window.location.reload();
    }

    render() {
        return (
            <div className="row">
                <form className="col s12" onSubmit={this.submitAddress.bind(this)}>
                    <div className="row">
                        <div className="input-field col s6">
                            <input  ref="district" type="text" className="validate"/>
                            <label htmlFor="district">District</label>
                        </div>

                        <div className="row">
                            <div className="input-field col s6">
                                <input  ref="city" type="text" className="validate"/>
                                <label htmlFor="city">City</label>
                            </div>
                        </div>

                        <div className="input-field col s6">
                            <input ref="province" type="number" className="validate"/>
                            <label htmlFor="province">Province</label>
                        </div>

                        <div className="input-field col s6">
                            <input  ref="houseNumber" type="number" className="validate"/>
                            <label htmlFor="houseNumber">House Number</label>
                        </div>

                        <div className="input-field col s6">
                            <input  ref="tole" type="text" className="validate"/>
                            <label htmlFor="tole">Tole</label>
                        </div>

                        <div className="input-field col s6">
                            <input  ref="wardNumber" type="number" className="validate"/>
                            <label htmlFor="wardNumber">Ward Number </label>
                        </div>

                        <div className="input-field col s12">
                            <input  ref="streetName" type="text" className="validate"/>
                            <label htmlFor="streetName">Street Name </label>
                        </div>

                        <div className="row">
                            <button className="waves-effect waves-light btn" type="submit" name="action">Submit</button>
                        </div>

                    </div>

                </form>
            </div>

        )
    }
}
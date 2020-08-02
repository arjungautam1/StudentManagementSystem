import React, {Component} from "react";

export default class AddUserRegistration extends Component {

    submitContact(event) {
        event.preventDefault();

        let contact = {
            createdBy: this.refs.createdBy.value,
            email: this.refs.email.value,
            password: this.refs.password.value,

        }
        fetch("http://localhost:8080/userRegistration",
            {
                method: "POST",
                headers: {
                    "content-type": "application/json",
                },
                body: JSON.stringify(contact),

            })
            .then(response => response.json());
        window.location.reload();
    }

    render() {
        return (
            <div className="row">
                <form className="col s12" onSubmit={this.submitContact.bind(this)}>
                    <div className="row">
                        <div className="input-field col s6">
                            <input placeholder="Created By" ref="createdBy" type="text" className="validate"/>
                            <label htmlFor="createdBy">Created By</label>
                        </div>

                        <div className="row">
                            <div className="input-field col s6">
                                <input placeholder={"Enter email address"} ref="email" type="email"
                                       className="validate"/>
                                <label htmlFor="email">Email</label>
                            </div>
                        </div>

                        <div className="input-field col s6">
                            <input placeholder="Enter password" ref="password" type="password" className="validate"/>
                            <label htmlFor="password">password</label>
                        </div>
                    </div>


                    <div className="row">
                        <button className="waves-effect waves-light btn" type="submit" name="action">Submit</button>
                    </div>


                </form>
            </div>

        )
    }
}
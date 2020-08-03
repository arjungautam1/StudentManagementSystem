import React from 'react';
import './App.css';
import UserRegistration from "./components/userRegistration/UserRegistration";

import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link
} from "react-router-dom"

import Address from "./components/address/Address";


/*
export  default function App() {

    return (
        <div className="container-fluid">
            <nav>
                <div className="nav-wrapper center-align">
                    <a href="/" className="brand-logo">User Registration</a>
                </div>
            </nav>

            <div className="row">
                <UserRegistration/>
            </div>

            <nav>
                <div className="nav-wrapper center-align">
                    <a href="/" className="brand-logo">Address</a>
                </div>
            </nav>

            <div className="row">
                <Address />
            </div>
        </div>
    );
}*/

export default function App() {
    return (
        <Router>
            <div className="container-fluid">
                <nav>
                    <ul>
                        <li>
                            <Link to="/userReg">User Registration</Link>
                        </li>
                        <li>
                            <Link to="/address">Address</Link>
                        </li>
                    </ul>
                </nav>

                <Switch>

                    <Route path="/userReg">
                        <div className="row">
                            <UserRegistration/>
                        </div>
                    </Route>

                    <Route path="/address">
                        <div className="row">
                            <Address />
                        </div>
                    </Route>

                </Switch>
            </div>
        </Router>
    )
}

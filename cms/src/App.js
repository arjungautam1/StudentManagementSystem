import React from 'react';
import Contacts from './components/UserRegistration';
import './App.css';

function App() {
    return (
        <div className="container-fluid">
            <nav>
                <div className="nav-wrapper center-align">User Registration</div>

                <a href="/" className="brand-logo">User Registration</a>
            </nav>
            <div className="row">
                <Contacts/>
            </div>
        </div>
    );
}

export default App;
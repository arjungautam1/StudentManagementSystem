
import React from "react";

const SingleAddress=({item}) =>(

    <div className="row">
        <div className="col s12 m6">
            <div className="card blue-grey darken-1">
                <div className="card-content white-text">
                    <span className="card-title">City : {item.addressId} </span>

                </div>
                <div className="card-action">

                    <p>District : {item.district}</p>
                    <p>Province:{item.province}</p>
                    <p>City : {item.city}</p>
                    <p>House Number : {item.houseNumber}</p>
                    <p>Tole : {item.tole}</p>
                    <p>Street Name: {item.streetName}</p>
                    <p>Ward Number : {item.wardNumber}</p>

                </div>

            </div>
        </div>
    </div>

);

export default SingleAddress;
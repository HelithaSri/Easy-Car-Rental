import { ClassNames } from "@emotion/react";
import { Grid, Typography } from "@mui/material";
import React, { Component } from "react";
// import car from "../../../assets/img/cover/car_01.jpg"

class VehicleCard extends Component {
  render() {
    return (
      <div
        style={{ minWidth: "330px", height: "430.98px", }}
        // style={{ width: "412.5px", height: "567.38px" }}
        className="flex flex-col bg-stone-900 rounded-3xl shadow-md hover:shadow-2xl order-blue-500 border"
      >
        <div
          className="rounded-t-3xl bg-hero-pattern bg-cover"
          style={{ height: "204px" }}
        ></div>
        <div className="text-white flex flex-col justify-between">
          <div className="flex justify-center bg-slate-000 p-4">
            <Typography variant="h5">BMW</Typography>
          </div>
          <div
            className=" flex justify-evenly items-center bg-stone-800"
            style={{ height: "93px" }}
          >
            <div>
              <div>😉 Petrol</div>
              <div>🔴 Auto</div>
              <div>🎮 4 Persons</div>
            </div>
            <div>
              <div>😉 Petrol</div>
              <div>🔴 Auto</div>
              <div>🎮 4 Persons</div>
            </div>
          </div>
          <div
            className="flex flex-row justify-around items-center bg-yellow-000 rounded-b-3xl "
            style={{ height: "70px" }}
          >
            <div className="flex flex-col justify-center items-center font-bold">
              <Typography variant="p">Rs.2500/=</Typography>
              <Typography variant="p">Day</Typography>
            </div>
            <div className=" flex flex-col justify-center items-center font-bold">
              <Typography variant="p">Rs.2500/=</Typography>
              <Typography variant="p">Month</Typography>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default VehicleCard;

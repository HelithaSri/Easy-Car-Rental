import { Grid, Typography } from "@mui/material";
import React, { Component } from "react";
import DashboardIcon from "@mui/icons-material/Dashboard";
import DirectionsCarIcon from '@mui/icons-material/DirectionsCar';
import LoginIcon from '@mui/icons-material/Login';
import AssessmentIcon from '@mui/icons-material/Assessment';
import CalculateIcon from '@mui/icons-material/Calculate';
import CarRentalIcon from '@mui/icons-material/CarRental';
import SupervisorAccountIcon from '@mui/icons-material/SupervisorAccount';
import PeopleIcon from '@mui/icons-material/People';
import PersonOutlineOutlinedIcon from '@mui/icons-material/PersonOutlineOutlined';

class Sidebar extends Component {
  render() {
    return (
      <Grid
        container
        direction={"column"}
        className="border-r-2 border-neutral-300 min-h-screen"
      >
        <Grid
          item
          container
          className="h-12 p-4"
          direction={"row"}
          justifyContent="center"
          alignItems={"center"}
          alignContent="center"
        >
          <Typography className="text-xl font-bold text-blue-600 font-dosis">
            Esay Car Rental
          </Typography>
        </Grid>
        <hr className="border border-neutral-300" />
        <Grid item className="pl-2">
          <ul>
            <li className="flex items-center gap-2 p-2 mr-3 cursor-pointer hover:bg-yellow-200 m-1 rounded-lg">
                <DashboardIcon className="text-blue-700 text-lg" />
              <Typography variant="h6" component={"span"} className="text-sm font-semibold text-gray-700">Dashboard</Typography>
            </li>
            <li className="flex items-center gap-2 p-2 mr-3 cursor-pointer hover:bg-yellow-200 m-1 rounded-lg">
                <CarRentalIcon className="text-blue-700 text-lg" />
              <Typography variant="h6" component={"span"} className="text-sm font-semibold text-gray-700">Rental Requests</Typography>
            </li>
            <li className="flex items-center gap-2 p-2 mr-3 cursor-pointer hover:bg-yellow-200 m-1 rounded-lg">
            <DirectionsCarIcon className="text-blue-700 text-lg" />
              <Typography variant="h6" component={"span"} className="text-sm font-semibold text-gray-700">Vehicle Manage</Typography>
            </li>
            <li className="flex items-center gap-2 p-2 mr-3 cursor-pointer hover:bg-yellow-200 m-1 rounded-lg">
                <PersonOutlineOutlinedIcon className="text-blue-700 text-lg" />
              <Typography variant="h6" component={"span"} className="text-sm font-semibold text-gray-700">Driver Manage</Typography>
            </li>
            <li className="flex items-center gap-2 p-2 mr-3 cursor-pointer hover:bg-yellow-200 m-1 rounded-lg">
                <SupervisorAccountIcon className="text-blue-700 text-lg" />
              <Typography variant="h6" component={"span"} className="text-sm font-semibold text-gray-700">Employee Manage</Typography>
            </li>
            <li className="flex items-center gap-2 p-2 mr-3 cursor-pointer hover:bg-yellow-200 m-1 rounded-lg">
                <PeopleIcon className="text-blue-700 text-lg" />
              <Typography variant="h6" component={"span"} className="text-sm font-semibold text-gray-700">Customers Manage</Typography>
            </li>
            <li className="flex items-center gap-2 p-2 mr-3 cursor-pointer hover:bg-yellow-200 m-1 rounded-lg">
                <CalculateIcon className="text-blue-700 text-lg" />
              <Typography variant="h6" component={"span"} className="text-sm font-semibold text-gray-700">Calculate Income</Typography>
            </li>
            <li className="flex items-center gap-2 p-2 mr-3 cursor-pointer hover:bg-yellow-200 m-1 rounded-lg">
                <AssessmentIcon className="text-blue-700 text-lg" />
              <Typography variant="h6" component={"span"} className="text-sm font-semibold text-gray-700">Daily Summry</Typography>
            </li>
            <li className="flex items-center gap-2 p-2 mr-3 cursor-pointer hover:bg-yellow-200 m-1 rounded-lg">
                <LoginIcon className="text-blue-700 text-lg" />
              <Typography variant="h6" component={"span"} className="text-sm font-semibold text-gray-700">Logout</Typography>
            </li>
          </ul>
        </Grid>
      </Grid>
    );
  }
}
export default Sidebar;
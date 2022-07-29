import React, {Component} from 'react';
import {Grid, InputAdornment, OutlinedInput, Typography} from "@mui/material";
import Footer from "../../components/Footer";
import SideFilter from "../../components/common/SideFilter";
import VehicleCardTwo from "../../components/common/VehicleCardTwo";
import SearchIcon from '@mui/icons-material/Search';
import CommonButton from "../../components/common/Button";
import NavBarVehicle from "../../components/common/Navbar/User";


class ViewAllVehicles extends Component {
    render() {
        const {classes} = this.props
        return (
            <Grid container direction={"column"} xs={12} className={'mt-10'}>

                <Grid container item xs={12} spacing={5} className={'bg-gray-50 '}>

                    {/*<Grid item xs={12} className={'p-10'}>
                    <NavBar />
                </Grid>*/}

                    <NavBarVehicle/>

                    <Grid item xs={"auto"} className={'p-10'}>
                        <SideFilter/>
                    </Grid>

                    <Grid container direction={'row'} gap={'15px'} justifyContent={'center'} item xs
                          className={'bg-gray-100 pb-20 pr-10'}>

                        <VehicleCardTwo/>
                        <VehicleCardTwo/>
                        <VehicleCardTwo/>
                        <VehicleCardTwo/>
                        <VehicleCardTwo/>
                        <VehicleCardTwo/>
                        <VehicleCardTwo/>
                        <VehicleCardTwo/>


                    </Grid>
                </Grid>
                <Grid xs={12} item>
                    <Footer/>
                </Grid>
            </Grid>);
    }
}

export default ViewAllVehicles;
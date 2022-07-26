import {Button, FormControl, Grid, InputLabel} from "@mui/material";
import React, {Component} from "react";
import {styleSheet} from "./styles";
import {withStyles} from "@mui/styles";
import {TextValidator, ValidatorForm} from "react-material-ui-form-validator";
import MenuItem from '@mui/material/MenuItem';
import Select from '@mui/material/Select';
import AddPhotoAlternateIcon from '@mui/icons-material/AddPhotoAlternate';
import CommonButton from "../common/Button";


class AddNewVehicle extends Component {
    constructor(props) {
        super(props);
        this.state = {
            formData: {
                "registrationNumber": '',
                "brand": '',
                "color": '',
                "status": '',
                "noOfPassengers": '',
                "runningKm": '',
                "fuelType": '',
                "transmissionType": '',
                "type": {
                    "vehicleTypeId": '',
                    "ldw": '',
                    "type": '',
                },
                "rates": {
                    "rateId": '',
                    "monthlyRate": '',
                    "dailyRate": '',
                    "freeKmForaMonth": '',
                    "freeKmForaDay": '',
                    "pricePerExtraKm": '',
                }
            },
        };
    }

    handleSubmit = async () => {
        console.log("Hi handle");
        console.log(this.state.formData);
    };

    handleChange = (event) => {
        let id = event.target.name;
        switch (id) {
            case "registrationNumber":
                const registrationNumber = event.target.value;
                this.setState(Object.assign(this.state.formData, {registrationNumber: registrationNumber}));
                // this.setState({ userId });
                break;

            case "brand":
                const brand = event.target.value;
                this.setState(Object.assign(this.state.formData, {brand: brand}));
                break;

            default:
                break;
        }
    };

    render() {
        const {classes} = this.props;
        return (<Grid container direction={'row'} xs={12} className={classes.container}>
            <ValidatorForm
                onSubmit={this.handleSubmit}
                onError={(errors) => console.log(errors)}
                className={classes.validator}
            >
                <Grid item container direction={'row'} xs={12} gap={'15px'} justifyContent={'center'}
                      alignContent={'center'}
                      className={classes.container}>
                    <Grid item container direction={'column'} xs={5.5} gap={'15px'}>
                        <TextValidator
                            label="Registration Number"
                            onChange={this.handleChange}
                            name="registrationNumber"
                            value={this.state.formData.registrationNumber}
                            validators={["required"]}
                            errorMessages={["This field is required"]}
                            className="w-full"
                            style={{minWidth: '100%'}}
                        />
                        <TextValidator
                            label="Brand"
                            onChange={this.handleChange}
                            name="brand"
                            value={this.state.formData.brand}
                            validators={["required"]}
                            errorMessages={["This field is required"]}
                            className="w-full"
                            style={{minWidth: '100%'}}
                        />
                        <TextValidator
                            label="Color"
                            onChange={this.handleChange}
                            name="color"
                            value={this.state.formData.color}
                            validators={["required"]}
                            errorMessages={["This field is required"]}
                            className="w-full"
                            style={{minWidth: '100%'}}
                        />
                        <TextValidator
                            label="No of Passengers"
                            onChange={this.handleChange}
                            name="noOfPassengers"
                            value={this.state.formData.noOfPassengers}
                            validators={["required"]}
                            errorMessages={["This field is required"]}
                            type={"number"}
                            className="w-full"
                            style={{minWidth: '100%'}}
                        />
                        <TextValidator
                            label="Running Km"
                            onChange={this.handleChange}
                            name="runningKm"
                            value={this.state.formData.runningKm}
                            validators={["required"]}
                            errorMessages={["This field is required"]}
                            className="w-full"
                            style={{minWidth: '100%'}}
                        />
                    </Grid>
                    <Grid container direction={'column'} item xs={5.5} gap={'15px'}>

                        <FormControl variant="outlined" className={classes.select}>
                            <InputLabel>Fuel Type</InputLabel>
                            <Select
                                labelId="fuel"
                                id="fuelType"
                                value={this.state.formData.fuelType}
                                // onChange={handleChange}
                                label="fuel"
                            >
                                <MenuItem value="">
                                    <em>None</em>
                                </MenuItem>
                                <MenuItem value={10}>Petrol</MenuItem>
                                <MenuItem value={20}>Diesel</MenuItem>
                                <MenuItem value={20}>Electric</MenuItem>
                            </Select>
                        </FormControl>
                        <FormControl variant="outlined" className={classes.select}>
                            <InputLabel>Transmission Type </InputLabel>
                            <Select
                                labelId="transmission"
                                id="transmissionType"
                                value={this.state.formData.transmissionType}
                                // onChange={handleChange}
                                label="transmission"
                            >
                                <MenuItem value="">
                                    <em>None</em>
                                </MenuItem>
                                <MenuItem value={10}>Auto</MenuItem>
                                <MenuItem value={20}>Manual</MenuItem>
                            </Select>
                        </FormControl>
                        <FormControl variant="outlined" className={classes.select}>
                            <InputLabel>Rates </InputLabel>
                            <Select
                                labelId="rates"
                                id="rates"
                                value={this.state.formData.rates.rateId}
                                // onChange={handleChange}
                                label="rates"
                            >
                                <MenuItem value="">
                                    <em>None</em>
                                </MenuItem>
                                <MenuItem value={10}>Rate001</MenuItem>
                                <MenuItem value={20}>Rate002</MenuItem>
                                <MenuItem value={30}>Rate003</MenuItem>
                            </Select>
                        </FormControl>
                        <FormControl variant="outlined" className={classes.select}>
                            <InputLabel>Vehicle Type </InputLabel>
                            <Select
                                labelId="vehicleType"
                                id="type"
                                value={this.state.formData.type.vehicleTypeId}
                                // onChange={handleChange}
                                label="vehicleType"
                            >
                                <MenuItem value="">
                                    <em>None</em>
                                </MenuItem>
                                <MenuItem value={10}>General</MenuItem>
                                <MenuItem value={20}>Premium</MenuItem>
                                <MenuItem value={20}>Luxury</MenuItem>
                            </Select>
                        </FormControl>
                        <FormControl variant="outlined" className={classes.select}>
                            <InputLabel>Status </InputLabel>
                            <Select
                                labelId="status"
                                id="status"
                                value={this.state.formData.status}
                                // onChange={handleChange}
                                label="Status"
                            >
                                <MenuItem value="">
                                    <em>None</em>
                                </MenuItem>
                                <MenuItem value={10}>Available</MenuItem>
                                <MenuItem value={20}>Under Maintains</MenuItem>
                                <MenuItem value={30}>Need Maintains</MenuItem>
                            </Select>
                        </FormControl>
                    </Grid>
                    <Grid container direction={'row'} xs={12} justifyContent={'center'}>
                        <Button
                            component="label"
                            variant="outlined"
                            startIcon={<AddPhotoAlternateIcon className={classes.icon}/>}
                            sx={{marginRight: "1rem"}}
                            className={classes.btnUpload}
                        >
                            Upload Image
                            <input type="file" accept="image/*" hidden/>
                        </Button>


                    </Grid>
                    <CommonButton
                        size="large"
                        variant="contained"
                        label="Add"
                        type="submit"
                        className="text-white bg-blue-500 font-bold tracking-wide"
                        style={{backgroundColor: 'rgba(25, 118, 210, 0.95)', width: '100%'}}
                    />
                </Grid>
            </ValidatorForm>

        </Grid>);
    }
}

export default withStyles(styleSheet)(AddNewVehicle);
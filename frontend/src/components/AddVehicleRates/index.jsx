import {Grid} from "@mui/material";
import React, {Component} from "react";
import {styleSheet} from "./styles";
import {withStyles} from "@mui/styles";
import {TextValidator, ValidatorForm} from "react-material-ui-form-validator";
import CommonButton from "../common/Button";


class AddVehicleRates extends Component {
    constructor(props) {
        super(props);
        this.state = {
            formData: {
                "rateId": '',
                "monthlyRate": '',
                "dailyRate": '',
                "freeKmForaMonth": '',
                "freeKmForaDay": '',
                "pricePerExtraKm":'',
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
            case "rateId":
                const rateId = event.target.value;
                this.setState(Object.assign(this.state.formData, {rateId: rateId}));
                // this.setState({ userId });
                break;

            case "monthlyRate":
                const monthlyRate = event.target.value;
                this.setState(Object.assign(this.state.formData, {monthlyRate: monthlyRate}));
                break;

            case "dailyRate":
                const dailyRate = event.target.value;
                this.setState(Object.assign(this.state.formData, {dailyRate: dailyRate}));
                break;

            case "freeKmForaMonth":
                const freeKmForaMonth = event.target.value;
                this.setState(Object.assign(this.state.formData, {freeKmForaMonth: freeKmForaMonth}));
                break;

            case "freeKmForaDay":
                const freeKmForaDay = event.target.value;
                this.setState(Object.assign(this.state.formData, {freeKmForaDay: freeKmForaDay}));
                break;

            case "pricePerExtraKm":
                const pricePerExtraKm = event.target.value;
                this.setState(Object.assign(this.state.formData, {pricePerExtraKm: pricePerExtraKm}));
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
                    <Grid item container direction={'column'} xs={12} gap={'15px'}>
                        <TextValidator
                            label="Rate ID"
                            onChange={this.handleChange}
                            name="rateId"
                            value={this.state.formData.rateId}
                            validators={["required"]}
                            errorMessages={["This field is required"]}
                            className="w-full"
                            style={{minWidth: '100%'}}
                        />
                        <TextValidator
                            label="Daily Rate"
                            onChange={this.handleChange}
                            name="dailyRate"
                            value={this.state.formData.dailyRate}
                            validators={["required"]}
                            errorMessages={["This field is required"]}
                            className="w-full"
                            style={{minWidth: '100%'}}
                        />
                        <TextValidator
                            label="Free Km For a Day"
                            onChange={this.handleChange}
                            name="freeKmForaDay"
                            value={this.state.formData.freeKmForaDay}
                            validators={["required"]}
                            errorMessages={["This field is required"]}
                            className="w-full"
                            style={{minWidth: '100%'}}
                        />
                        <TextValidator
                            label="Free Km For a Month"
                            onChange={this.handleChange}
                            name="freeKmForaMonth"
                            value={this.state.formData.freeKmForaMonth}
                            validators={["required"]}
                            errorMessages={["This field is required"]}
                            className="w-full"
                            style={{minWidth: '100%'}}
                        />
                        <TextValidator
                            label="Monthly Rate"
                            onChange={this.handleChange}
                            name="monthlyRate"
                            value={this.state.formData.monthlyRate}
                            validators={["required"]}
                            errorMessages={["This field is required"]}
                            className="w-full"
                            style={{minWidth: '100%'}}
                        />
                        <TextValidator
                            label="Price Per Extra Km"
                            onChange={this.handleChange}
                            name="pricePerExtraKm"
                            value={this.state.formData.pricePerExtraKm}
                            validators={["required"]}
                            errorMessages={["This field is required"]}
                            className="w-full"
                            style={{minWidth: '100%'}}
                        />
                        <CommonButton
                            size="large"
                            variant="contained"
                            label="Add"
                            type="submit"
                            className="text-white bg-blue-500 font-bold tracking-wide"
                            style={{backgroundColor: 'rgba(25, 118, 210, 0.95)', width: '100%'}}
                        />
                    </Grid>

                </Grid>
            </ValidatorForm>

        </Grid>);
    }
}

export default withStyles(styleSheet)(AddVehicleRates);
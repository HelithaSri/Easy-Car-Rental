import { Grid, Link, Typography } from "@mui/material";
import React, { Component } from "react";
import { TextField } from "@mui/material";
import CommonButton from "../../../components/common/Button";

class Login extends Component {
  render() {
    return (
      <Grid
        container
        direction={"column"}
        alignItems="center"
        justifyContent={"center"}
        className="h-screen w-screen bg-red-200 "
      >
        <Grid
          container
          direction={"column"}
          alignItems="center"
        >
          <Grid
            item
            container
            className="min-h-96  w-96 bg-slate-50 rounded-lg p-10 drop-shadow-lg"
          >
            <Grid container item direction={"column"} gap="20px" className="">
              <Grid item>
                <Typography
                  variant="h5"
                  className="text-center uppercase font-bold"
                >
                  Login
                </Typography>
              </Grid>
              <Grid item container direction={"column"} rowGap="20px">
                <TextField
                  id="outlined-basic"
                  label="User Name"
                  variant="outlined"
                />
                <TextField
                  id="outlined-basic"
                  label="Password"
                  type={"password"}
                  variant="outlined"
                />
                <Typography variant="p" className="text-slate-500 -mt-3">Frogot password ?</Typography>
                <CommonButton
                  size="large"
                  variant="contained"
                  label="Login"
                  className="text-white bg-blue-500 font-bold tracking-wide"
                />
                <Typography variant="p">
                  You are not a member? <Link> Register Now</Link>
                </Typography>
              </Grid>
            </Grid>
          </Grid>
        </Grid>
      </Grid>
    );
  }
}
export default Login;

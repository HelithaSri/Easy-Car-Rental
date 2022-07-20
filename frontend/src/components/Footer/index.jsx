import { Grid, Typography } from "@mui/material";
import React, { Component } from "react";

class Footer extends Component {
  render() {
    return (
      <Grid
        container
        direction="column"
        justifyContent="center"
        alignItems="stretch"
        className="bg-stone-900 text-stone-300 h-44"
      >
        <Grid
          container
          direction="column"
          justifyContent="center"
          alignItems="stretch"
        >
          <Grid
            container
            item
            direction="column"
            justifyContent="center"
            className="bg-yellow-000 h-14"
          >
            <ul className="flex justify-center gap-4 font-semibold">
              <li>Home</li>
              <li>General Cars</li>
              <li>Premium Cars</li>
              <li>Luxery Cars</li>
            </ul>
          </Grid>
          <Grid
            container
            item
            direction="column"
            justifyContent="center"
            className="bg-blue-000 text-white text-center h-12 justify-end"
          >
            <Typography variant="h5">Esay Car Rental</Typography>
          </Grid>
          <Grid container
            item
            direction="column"
            justifyContent="center"
            className="bg-blue-000 h-16">

            <Typography variant="p" className="text-center">
              Copyright © 2022 | Esay Car Rental. All right reserved
            </Typography>
          </Grid>
        </Grid>
      </Grid>
    );
  }
}
export default Footer;

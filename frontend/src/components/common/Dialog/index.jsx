import React, { Component } from "react";
import PropTypes from "prop-types";
import {
  Dialog,
  DialogContent,
  DialogTitle,
  Grid,
  Typography,
} from "@mui/material";
import { styleSheet } from "./styles";
import { withStyles } from "@mui/styles";
import { maxHeight, maxWidth } from "@mui/system";

import IconButton from "@mui/material/IconButton";
import CloseIcon from "@mui/icons-material/Close";

class DialogBox extends Component {
  constructor(props) {
    super(props);
  }

  render() {
    const { title, children, openPopup } = this.props;

    const { classes } = this.props;
    return (
      <Dialog
        open={openPopup}
        maxWidth="md"
        classes={{ paper: classes.dialogWraper }}
      >
        <DialogTitle style={{ paddingRight: "0px" }}>
          <div style={{ display: "flex" }}>
            <Typography
              variant="h4"
              // textAlign={"center"}
              component="div"
              className="font-bold flex-grow"
              style={{ flexGrow: 1 }}
            >
              {title}
            </Typography>

            <IconButton>
              <CloseIcon />
            </IconButton>
          </div>
        </DialogTitle>
        <DialogContent dividers>{children}</DialogContent>
      </Dialog>
    );
  }
}
export default withStyles(styleSheet)(DialogBox);

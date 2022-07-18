import React, {Component} from 'react';
import Typography from "@mui/material/Typography";

class Hero extends Component {
    render() {
        return (
            <div className='bg-hero-pattern bg-cover' style={{backgroundColor:'red',height:'calc(100vh - 64px)'}}>
                <Typography variant={"h1"} >Car Hire - Search</Typography>
                <div>

                </div>
            </div>
        );
    }
}

export default Hero;
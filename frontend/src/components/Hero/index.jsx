import React, {Component} from 'react';
import Typography from "@mui/material/Typography";
import { styled, TextField } from '@mui/material';
import CommonButton from '../common/Button';

const CssTextField = styled(TextField)({
    '& label.Mui-focused': {
      color: '#EAB308',
    },
    '& .MuiInput-underline:after': {
      borderBottomColor: 'white',
    },
    '& .MuiOutlinedInput-root': {
      '& fieldset': {
        borderColor: '#AAAAAA',
      },
      '&:hover fieldset': {
        borderColor: 'white',
      },
      '&.Mui-focused fieldset': {
        borderColor: 'White',
      },
    },
    '& .MuiOutlinedInput-root input':{
        color:'White',
    },
    '& label':{
        color:'#AAAAAA',
    },
  });
class Hero extends Component {
    render() {
        return (
          <div
            className="flex justify-center items-center bg-hero-pattern bg-no-repeat bg-bottoms bg-cover bg-blend-overlay  bg-stone-800"
            style={{ height: "calc(100vh - 64px)" }}
          >
            <Typography variant={"h1"} className="text-white">
              Car Hire - Search
            </Typography>
            
            <div className="flex gap-6 flex-col h-fit w-96 rounded-xl bg-blue-300 p-10 bg-opacity-10  backdrop-blur-sm" style={{border: "1px solid rgba(255, 255, 255, 0.09)"}}>
              <CssTextField
                id="outlined-basic"
                label="Rent Date"
                variant="outlined"
                borderBottomColor='warning'
                className='text-white placeholder-orange-500'
              />
              <CssTextField
                id="outlined-basic"
                label="Return Date"
                variant="outlined"
              />
              <CssTextField
                id="outlined-basic"
                label="Outlined"
                variant="outlined"
              />

                <CommonButton size="large" variant="contained" label="Find" className='text-white bg-yellow-500 font-bold tracking-wide'/>

            </div>
          </div>
        );
    }
}

export default Hero;
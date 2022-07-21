import React, {Component} from 'react';
import NavBar from "../../components/NavBar";
import Hero from "../../components/Hero/withFlex";
import HeroWithGrid from '../../components/Hero/withGrid';
import ListVehicle from '../../components/ListVehicle';
import Footer from '../../components/Footer';
import LoginUser from '../Session/Login/user';
import CustomizedDialogs from '../../components/common/Dialog';
import LoginAdmin from '../Session/Login/admin';
import LoginDriver from '../Session/Login/driver';

class Home extends Component {
    render() {
        return (
            // overflowX:'hidden'
            <div style={{display:'flex', flexDirection:'column'}}>
                <NavBar/>
                <HeroWithGrid/>
                <ListVehicle/>
                <Footer/>
                {/* <LoginUser/>  */}
               
                {/* <LoginAdmin/>
                <LoginDriver/> */}
            </div>
        );
    }
}

export default Home;
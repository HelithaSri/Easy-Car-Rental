import React, {Component} from 'react';
import NavBar from "../../components/NavBar";
import Hero from "../../components/Hero/withFlex";
import HeroWithGrid from '../../components/Hero/withGrid';
import ListVehicle from '../../components/ListVehicle';

class Home extends Component {
    render() {
        return (
            <div style={{display:'flex', flexDirection:'column'}}>
                <NavBar/>
                <HeroWithGrid/>
                <ListVehicle/>
            </div>
        );
    }
}

export default Home;
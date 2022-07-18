import React, {Component} from 'react';
import NavBar from "../../components/NavBar";
import Hero from "../../components/Hero";

class Home extends Component {
    render() {
        return (
            <div style={{display:'flex', flexDirection:'column'}}>
                <NavBar/>
                <Hero/>
            </div>
        );
    }
}

export default Home;
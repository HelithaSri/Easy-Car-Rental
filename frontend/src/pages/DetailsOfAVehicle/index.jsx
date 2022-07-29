import React, {Component} from 'react';
import {Grid, Typography} from "@mui/material";
import NavBarVehicle from "../../components/common/Navbar/User";
import Footer from "../../components/Footer";
import SideRent from "../../components/SideRent";


class DetailsOfAVehicle extends Component {
    constructor(props) {
        super(props);
        this.state = {
            title: 'consectetur adipisicing elit.Lorem ipsum dolor sit amet,',
            // img:'./assets/img/cover/car_04.jpg'
            img: 'https://images.unsplash.com/photo-1583267746897-2cf415887172?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8YXV0b21vYmlsZXxlbnwwfHwwfHw%3D&w=1000&q=80g',
            price: {
                perDay: '20000.00',
                monthly: '50000.00',
                driver: '1000.00',
                ldw: '60000.00'
            }
        }
    }

    render() {
        return (
            <Grid container>
                <Grid container item xs={12}>
                    <NavBarVehicle/>
                </Grid>
                <Grid container item xs={12} gap={'10px'} justifyContent={'center'} className={'bg-gray-200 p-3'}>
                    <Grid container direction={"column"} item xs={12} md={12} lg={8}>
                        <Grid container item sm={"auto"}>

                            <Grid item xs={12} sm={12} md={12} lg={4} height={"max-content"} className={'mt-4'}>
                                <Grid height={'500px'}
                                      style={{backgroundImage: `url(${this.state.img})`}}
                                      className={' border-amber-50 border-2 bg-center bg-cover mr-2 rounded-2xl'}>
                                </Grid>
                            </Grid>

                            <Grid item xs={12} sm={12} md={12} lg={8}
                                  className={'bg-white p-5 break-words mt-4 rounded-2xl capitalize'}>
                                <Typography variant={'h5'} className={'mb-5 font-medium'}>
                                    {this.state.title}
                                </Typography>
                                <hr/>
                                <br/>
                                <Grid item container direction={'column'} gap={2} className={"font-bold px-6"}>
                                    <ul className={'list-disc list-outside flex flex-col gap-3'}>
                                        <li><Typography variant={'p'}>
                                            Per Day Charge : {this.state.price.perDay}
                                        </Typography></li>
                                        <li><Typography variant={'p'}>
                                            Monthly Charge : {this.state.price.monthly}
                                        </Typography></li>
                                        <li><Typography variant={'p'}>
                                            Driver Per Day Charge : {this.state.price.driver}
                                        </Typography></li>
                                        <li><Typography variant={'p'} component={'div'} className={'flex flex-col'}>
                                            Loss Damage Waiver(LDW) : {this.state.price.ldw} <br/>
                                            <Typography variant={'span'} className={'text-sm  text-red-500 font-thin'}>*After
                                                the
                                                vehicle is returned, a brief inspection will be done, and if the vehicle
                                                is
                                                damaged or harmed, an appropriate amount will be deducted from the Loss
                                                Damage Waiver payment and the rest will be returned.</Typography>
                                        </Typography></li>
                                    </ul>
                                </Grid>

                            </Grid>

                        </Grid>

                        <Grid container item sm={"auto"}>
                            <Grid item xs={12} sm={12} className={'bg-white p-5 break-words mt-4 rounded-2xl'}>
                                <Typography variant={'h6'}>
                                    Description
                                    <hr/>
                                </Typography>
                                <Grid item container justifyContent={'center'}>
                                    <Grid item container direction={'column'} gap={1} xs={6} className={'mt-4 divide-dashed divide-yellow-500'}>
                                        <Grid item container justifyContent={'space-between'}>
                                            <Typography variant={'p'} className={'font-medium'}>Type</Typography>
                                            <Typography variant={'p'}>Honda</Typography>
                                        </Grid>
                                        <hr/>
                                        <Grid item container justifyContent={'space-between'}>
                                            <Typography variant={'p'} className={'font-medium'}>Color</Typography>
                                            <Typography variant={'p'}>Red</Typography>
                                        </Grid>
                                        <hr/>
                                        <Grid item container justifyContent={'space-between'}>
                                            <Typography variant={'p'} className={'font-medium'}>Type</Typography>
                                            <Typography variant={'p'}>Honda</Typography>
                                        </Grid>
                                        <hr/>
                                        <Grid item container justifyContent={'space-between'}>
                                            <Typography variant={'p'} className={'font-medium'}>Color</Typography>
                                            <Typography variant={'p'}>Red</Typography>
                                        </Grid>
                                        <hr/>
                                        <Grid item container justifyContent={'space-between'}>
                                            <Typography variant={'p'} className={'font-medium'}>Type</Typography>
                                            <Typography variant={'p'}>Honda</Typography>
                                        </Grid>
                                        <hr/>
                                        <Grid item container justifyContent={'space-between'}>
                                            <Typography variant={'p'} className={'font-medium'}>Color</Typography>
                                            <Typography variant={'p'}>Red</Typography>
                                        </Grid>

                                    </Grid>
                                </Grid>
                                <Grid>
                                    <div>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, facilis
                                        fugit minima nam nostrum quas quasi repellat repellendus. Doloremque ducimus,
                                        enim et harum modi quibusdam saepe tempore temporibus ut veritatis!
                                    </div>
                                    <div>Autem delectus ducimus exercitationem fuga illo impedit libero magnam minus,
                                        necessitatibus neque nisi obcaecati optio perspiciatis provident quam quasi qui
                                        quibusdam quidem reiciendis sit tempore temporibus ut! Debitis, unde voluptates.
                                    </div>
                                    <div>Aspernatur cum enim inventore magnam mollitia, nisi nobis, officiis perferendis
                                        quia quisquam recusandae repellat vel voluptatum? Dolorum eaque, eligendi eos ex
                                        impedit incidunt officia, quidem repellendus reprehenderit sed voluptas
                                        voluptates.
                                    </div>
                                    <div>Adipisci amet commodi consequatur consequuntur cum cupiditate dolores et
                                        explicabo fugit, incidunt ipsam minima, obcaecati, quia quibusdam quidem quos
                                        rem repudiandae saepe vitae voluptatibus? Architecto cum dolores sit vel veniam.
                                    </div>
                                    <div>Culpa, cum impedit quibusdam quo reprehenderit saepe tempora temporibus unde.
                                        Accusamus animi at cum, distinctio dolore, dolorem eveniet excepturi fuga fugiat
                                        incidunt praesentium quis reprehenderit rerum tenetur veritatis voluptas
                                        voluptatibus!
                                    </div>
                                </Grid>
                            </Grid>
                        </Grid>
                    </Grid>

                    {/*<Grid item xs={12} sm={12} md={12} lg={3} className={'bg-yellow-500 mt-4 rounded-2xl p-5'}>
                        dsa
                    </Grid>*/}
                    <SideRent/>
                </Grid>
                <Footer/>
            </Grid>
        );
    }
}

export default DetailsOfAVehicle;
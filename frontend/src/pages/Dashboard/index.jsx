import { Grid } from '@mui/material'
import React, { Component } from 'react'
import Navbar from '../../components/common/Navbar/Admin'
import Sidebar from '../../components/common/Sidebar'
import Widget from '../../components/common/widgets'

class Dashboard extends Component {
  render() {
    return (
      <Grid container direction={'row'} columns='12'>
        <Grid item xs={'auto'} ><Sidebar/></Grid>
        <Grid item xs className=''>
          <Navbar/>
          <Grid container item xs={'auto'} className='flex p-5 gap-5'>
            <Widget type="user" />
            <Widget type="bookings" />
            <Widget type="Available cars" />
            <Widget type="Reserved cars" />
            <Widget type="Active Bookings" />
          </Grid>
          </Grid>
      </Grid>
    )
  }
}
export default Dashboard
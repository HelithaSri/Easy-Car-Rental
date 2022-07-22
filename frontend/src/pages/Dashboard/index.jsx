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
        <Grid item xs className='bg-red-100'>
          <Navbar/>
          <Grid item>
            <Widget/>
          </Grid>
          </Grid>
      </Grid>
    )
  }
}
export default Dashboard
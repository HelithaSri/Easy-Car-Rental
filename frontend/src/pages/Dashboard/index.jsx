import { Grid } from '@mui/material'
import React, { Component } from 'react'
import Sidebar from '../../components/common/Sidebar'

class Dashboard extends Component {
  render() {
    return (
      <Grid container direction={'row'} columns='12'>
        <Grid item xs={'auto'} ><Sidebar/></Grid>
        <Grid item xs className='bg-red-100'>cons</Grid>
      </Grid>
    )
  }
}
export default Dashboard
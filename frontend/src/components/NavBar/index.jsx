import React, {Component} from 'react';
import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import Toolbar from '@mui/material/Toolbar';
import Typography from '@mui/material/Typography';
import Button from '@mui/material/Button';
import IconButton from '@mui/material/IconButton';
import MenuIcon from '@mui/icons-material/Menu';
import {Badge} from "@mui/material";
import NotificationsIcon from '@mui/icons-material/Notifications';
import AccountCircle from '@mui/icons-material/AccountCircle';
import ShoppingCartIcon from '@mui/icons-material/ShoppingCartOutlined';
import CommonButton from "../common/Button";


class NavBar extends Component {
    render() {
        return (
          /*<div>
                <Box sx={{ flexGrow: 1 }}>
                    <AppBar position="static">
                        <Toolbar>
                            <IconButton
                                size="large"
                                edge="start"
                                color="inherit"
                                aria-label="menu"
                                sx={{ mr: 2 }}
                            >
                                <MenuIcon />
                            </IconButton>
                            <Typography variant="h6" component="div" sx={{ flexGrow: 1 }}>
                                Easy Car Rental
                            </Typography>
                            <Box sx={{ display: { xs: 'none', md: 'flex' } }}>
                                <IconButton
                                    size="large"
                                    aria-label="show 17 new notifications"
                                    color="inherit"
                                >
                                    <Badge badgeContent={17} color="error">
                                        <NotificationsIcon />
                                    </Badge>
                                </IconButton>
                                <IconButton
                                    size="large"
                                    edge="end"
                                    aria-label="account of current user"
                                    // aria-controls={menuId}
                                    aria-haspopup="true"
                                    // onClick={handleProfileMenuOpen}
                                    color="inherit"
                                >
                                    <AccountCircle />
                                </IconButton>
                            </Box>
                        </Toolbar>
                    </AppBar>
                </Box>
            </div>*/

          <AppBar color="transparent" position={"fixed"}>
            <nav className="flex justify-between items-center h-16 px-12 bg-zinc-800 bg-opacity-25 p-10 backdrop-blur-sm">
              <div>
                <Typography variant={"h5"} className="text-white font-dosis font-bold tracking-wide select-none">
                  Easy Car Rental
                </Typography>
              </div>
              <div className='flex w-1/12 justify-end gap-3'>
                {/* <IconButton
                            size="large"
                            aria-label="show 17 new notifications"
                            color="inherit"
                        >
                            <Badge badgeContent={5} color="error">
                                <ShoppingCartIcon  />
                            </Badge>
                        </IconButton>*/}
                {/*<IconButton
                            size="large"
                            edge="end"
                            aria-label="account of current user"
                            // aria-controls={menuId}
                            aria-haspopup="true"
                            // onClick={handleProfileMenuOpen}
                            color="inherit"
                        >
                            <AccountCircle />
                        </IconButton>*/}
                <CommonButton size="large" variant="outlined" label="Login" className='text-white border-white hover:bg-white hover:text-black' />
              </div>
            </nav>
          </AppBar>
        );
    }
}

export default NavBar;
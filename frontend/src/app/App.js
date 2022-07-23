import Home from "../pages/Home";
import { Route, Routes } from "react-router-dom";
import Dashboard from "../pages/Dashboard";
import NotFound from '../pages/Session/NotFound'
import LoginAdmin from "../pages/Session/Login/admin";
import LoginDriver from "../pages/Session/Login/driver";
import LoginUser from "../pages/Session/Login/user";


function App() {
  return (
    <Routes>
      <Route exact path="/" element={<Home />} />
      <Route path="dashboard" element={<Dashboard />} />
      
      <Route path="admin">
        <Route index element={<LoginAdmin />} />
        <Route path="dashboard" element={<Dashboard />} />
      </Route>

      <Route path="driver">
        <Route index element={<LoginDriver />} />
        <Route path="dashboard" element={<Dashboard />} />
      </Route>

        <Route path="*" element={<NotFound />} />
    </Routes>
  );
}

export default App;

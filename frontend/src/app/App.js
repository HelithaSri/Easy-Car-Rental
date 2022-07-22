import Home from "../pages/Home";
import { Route, Routes } from "react-router-dom";
import Dashboard from "../pages/Dashboard";
import NotFound from '../pages/Session/NotFound'


function App() {
  return (
    <Routes>
      <Route exact path="/" element={<Home />} />
      <Route path="admin" element={<Dashboard />} />
      <Route path="*" element={<NotFound />} />
    </Routes>
  );
}

export default App;

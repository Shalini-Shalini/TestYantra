import React from "react";
import { BrowserRouter as Router, Link, Route } from "react-router-dom";
import Personal from "./personal";
import Education from "./education";
import ProjectsDeveloped from "./projectsDeveloped";
import Experience from "./experience";
import Extradetails from "./extradetails";
const Routing = (
  <div>
    <Router>
      <Link to="/"></Link>
      <Route exact path="/" component={Personal}></Route>
      <Route path="/education" component={Education}></Route>
      <Route path="/experience" component={Experience}></Route>
      <Route path="/extradetails" component={Extradetails}></Route>

      <Route path="/projectdeveloped" component={ProjectsDeveloped}></Route>
    </Router>
  </div>
);
export default Routing;

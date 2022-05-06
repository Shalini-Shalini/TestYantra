//import App1 from "./appbar";
// import Personal from "./personal";
//import Education from "./education";
//import ProjectsDeveloped from "./projectsDeveloped";
//import Experience from "./experience";
//import Extradetails from "./extradetails";
import React from "react";
import Routing from "./routing";
import App1 from "./appbar";
function App() {
  return (
    <div>
      <App1 />
      {Routing}
    </div>
  );
}

export default App;

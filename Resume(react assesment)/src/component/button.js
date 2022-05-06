import React from "react";
import "bootstrap/dist/css/bootstrap.min.css";
const sstyling = {
  marginLeft: "520px",
  marginTop: "20px",
};
const style1 = {
  marginLeft: "90px",
  marginTop: "20px",
};
function Button() {
  return (
    <div>
      <button type="button" class="btn btn-danger" style={sstyling}>
        <h6>&lt;&nbsp;&nbsp;Back</h6>
      </button>
      <button type="button" class="btn btn-danger" style={style1}>
        <h6>Next&gt;&nbsp;&nbsp;</h6>
      </button>
    </div>
  );
}

export default Button;

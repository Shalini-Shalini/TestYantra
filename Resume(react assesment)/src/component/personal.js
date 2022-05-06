import React from "react";
import { Link } from "react-router-dom";
import "bootstrap/dist/css/bootstrap.min.css";
const sstyling = {
  marginLeft: "520px",
  marginTop: "20px",
};
const style1 = {
  marginLeft: "90px",
  marginTop: "20px",
};
const styling = {
  border: "1px solid black",
  padding: "30px 3px 30px 3px",
  margin: "30px",
};
const formstyle = {
  padding: "0px 30px 0px 30px",
};
const footerstyle = {
  marginLeft: "620px",
  fontSize: "16px",
};
function Personal() {
  return (
    <div style={styling}>
      <h1
        style={{
          border: "1px solid black",
          paddingLeft: 530,
          fontSize: 25,
          paddingTop: 10,
          paddingBottom: 10,
          marginBottom: 30,
        }}
      >
        Personal Details
      </h1>

      <form style={formstyle}>
        <div class="row">
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="First name"
              required
            />
          </div>
          <div class="col">
            <input type="text" class="form-control" placeholder="Last name" />
          </div>
        </div>
        <div class="row">
          <div class="col">
            <br></br>
          </div>
          <div class="col">
            <br></br>
          </div>
        </div>
        <div class="row">
          <div class="col">
            {/* <link
              rel="stylesheet"
              href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css"
            />
            <i class="fa fa-envelope-o"></i> */}
            <input type="text" class="form-control" placeholder="Email" />
          </div>
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Phone Number"
            />
          </div>
        </div>
        <div class="row">
          <div class="col">
            <br></br>
          </div>
          <div class="col">
            <br></br>
          </div>
        </div>
        <div class="row">
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Your Website"
            />
          </div>
          <div class="col">
            <input type="text" class="form-control" placeholder="GitHub" />
          </div>
        </div>
        <div class="row">
          <div class="col">
            <br></br>
          </div>
          <div class="col">
            <br></br>
          </div>
        </div>
        <div class="row">
          <div class="col">
            <input type="text" class="form-control" placeholder="Linked in" />
          </div>
          <div class="col">
            <input type="text" class="form-control" placeholder="Twitter" />
          </div>
        </div>

        <div class="row">
          <div class="col">
            <br></br>
          </div>
          <div class="col">
            <br></br>
          </div>
        </div>
        <div class="row">
          <div class="col">
            <input type="text" class="form-control" placeholder="Facebook" />
          </div>
          <div class="col">
            <input type="text" class="form-control" placeholder="Instagram" />
          </div>
        </div>
      </form>
      <div>
        <button type="button" class="btn btn-danger" style={sstyling} disabled>
          <h6>&lt;&nbsp;&nbsp;Back</h6>
        </button>
        <Link to="/education">
          <button type="button" class="btn btn-danger" style={style1}>
            <h6>Next&gt;&nbsp;&nbsp;</h6>
          </button>
        </Link>
      </div>
      <footer>
        <h4 style={footerstyle}>Page1</h4>
      </footer>
    </div>
  );
}

export default Personal;

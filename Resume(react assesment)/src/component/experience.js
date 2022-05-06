import React from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import { Link } from "react-router-dom";
const sstyling = {
  marginLeft: "520px",
  marginTop: "20px",
};
const style1 = {
  marginLeft: "90px",
  marginTop: "20px",
};
const formstyle = {
  padding: "0px 30px 0px 30px",
};
const footerstyle = {
  marginLeft: "620px",
  fontSize: "16px",
};
const styling = {
  border: "1px solid black",
  padding: "30px 3px 30px 3px",
  margin: "30px",
};
const prjstyle = {
  fontSize: "18px",
  marginLeft: "100px",
};
function Experience() {
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
        Experience Details
      </h1>
      <h1 style={prjstyle}>Experience 1</h1>
      <form style={formstyle}>
        <div class="row">
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Institute/Organisation"
              required
            />
          </div>
          <div class="col">
            <input type="text" class="form-control" placeholder="Position" />
          </div>
          <div class="col">
            <input type="text" class="form-control" placeholder="Duration" />
          </div>
        </div>
        <br></br>
        <div class="row">
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Description"
              required
            />
          </div>
        </div>
        <hr></hr>
      </form>
      <h1 style={prjstyle}>Experience 2</h1>
      <form style={formstyle}>
        <div class="row">
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Institute/Organisation"
              required
            />
          </div>
          <div class="col">
            <input type="text" class="form-control" placeholder="Position" />
          </div>
          <div class="col">
            <input type="text" class="form-control" placeholder="Duration" />
          </div>
        </div>
        <br></br>
        <div class="row">
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Description"
              required
            />
          </div>
        </div>
      </form>
      <div>
        <Link to="/projectdeveloped">
          <button type="button" class="btn btn-danger" style={sstyling}>
            <h6>&lt;&nbsp;&nbsp;Back</h6>
          </button>
        </Link>

        <Link to="/extradetails">
          <button type="button" class="btn btn-danger" style={style1}>
            <h6>Next&gt;&nbsp;&nbsp;</h6>
          </button>
        </Link>
      </div>
      <footer>
        <h4 style={footerstyle}>Page4</h4>
      </footer>
    </div>
  );
}

export default Experience;

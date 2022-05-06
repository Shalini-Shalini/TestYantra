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
const styling = {
  border: "1px solid black",
  padding: "30px 3px 30px 3px",
  margin: "30px",
};
const formstyle = {
  padding: "0px 30px 0px 30px",
};
const footerstyle = {
  marginLeft: "580px",
  fontSize: "16px",
  marginTop: "20px",
};
const prjstyle = {
  fontSize: "18px",
  marginLeft: "100px",
};
function Extradetails() {
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
        Extra Details
      </h1>
      <h1 style={prjstyle}>Skills/Languages</h1>
      <form style={formstyle}>
        <div class="row">
          <div class="col">
            <input type="text" class="form-control" placeholder="Skill 1" />
          </div>
          <div class="col">
            <input type="text" class="form-control" placeholder="Skill 2" />
          </div>
          <div class="col">
            <input type="text" class="form-control" placeholder="Skill 3" />
          </div>
        </div>
        <br></br>
        <div class="row">
          <div class="col">
            <input type="text" class="form-control" placeholder="Skill 4" />
          </div>
          <div class="col">
            <input type="text" class="form-control" placeholder="Skill 5" />
          </div>
          <div class="col">
            <input type="text" class="form-control" placeholder="Skill 6" />
          </div>
        </div>
        <hr></hr>
      </form>
      <h1 style={prjstyle}>Interests</h1>
      <form style={formstyle}>
        <div class="row">
          <div class="col">
            <input type="text" class="form-control" placeholder="Interest 1" />
          </div>
          <div class="col">
            <input type="text" class="form-control" placeholder="Interest 2" />
          </div>
          <div class="col">
            <input type="text" class="form-control" placeholder="Interest 3" />
          </div>
        </div>
        <br></br>
        <div class="row">
          <div class="col">
            <input type="text" class="form-control" placeholder="Interest 4" />
          </div>
          <div class="col">
            <input type="text" class="form-control" placeholder="Interest 5" />
          </div>
          <div class="col">
            <input type="text" class="form-control" placeholder="Interest 6" />
          </div>
        </div>
      </form>
      <div>
        <Link to="/experience">
          <button type="button" class="btn btn-danger" style={sstyling}>
            <h6>&lt;&nbsp;&nbsp;Back</h6>
          </button>
        </Link>

        <button type="button" class="btn btn-danger" style={style1} disabled>
          <h6>Next&gt;&nbsp;&nbsp;</h6>
        </button>
      </div>
      <footer style={footerstyle}>
        <button type="button" class="btn btn-primary">
          DOWNLOADRESUME
        </button>
      </footer>
    </div>
  );
}

export default Extradetails;

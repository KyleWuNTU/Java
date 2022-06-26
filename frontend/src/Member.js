import React, { Component } from 'react';
import { Container, Table } from 'reactstrap';
import MyNavbar from './MyNavbar';
import 'bootstrap/dist/css/bootstrap.css';

class Member extends Component {

  constructor(props) {
    super(props);
    this.state = { members: [] };
  }

  componentDidMount() {
    fetch('Member/test1', {
      method: "GET", headers: new Headers({ 'Content-Type': 'application/json', }) //設定Content-Type
    })
      .then(response => response.json()) /*把request json化*/
      .then(data => this.setState({ members: data })) /*接到request data後要做的事情*/
      .catch(e => { console.log(e); });
  }

  render() {
    const { members } = this.state;

    const memberList = members.map(member => {
      return <tr key={member.mid}>
        <td>{member.name}</td>
        <td>{member.gender}</td>
      </tr>
    });

    return (
      <div>
        <MyNavbar />
        <Container fluid>
          <h3>Member</h3>
          <Table className="mt-4">
            <thead>
              <tr>
                <th>Name</th>
                <th>Gender</th>
              </tr>
            </thead>
            <tbody>
              {memberList}
            </tbody>
          </Table>
        </Container>
      </div>
    );
  }

}
export default Member;
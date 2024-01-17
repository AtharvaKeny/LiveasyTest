# LiveasyTest

// Dashboard.js
import React from 'react';

const Dashboard = ({ user }) => {
  return (
    <div>
      <h2>Welcome to Dashboard</h2>
      <div>
        <h3>User Details</h3>
        <p>Name: {user.name}</p>
        <p>Email: {user.email}</p>
        <p>Phone No: {user.phone}</p>
      </div>
    </div>
  );
};

export default Dashboard;

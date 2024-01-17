// App.js
import React, { useState } from 'react';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import SignUp from './SignUp';
import Login from './Login';
import Dashboard from './Dashboard';

const App = () => {
  const [user, setUser] = useState(null);

  const handleSignUp = (data) => {
    setUser(data);
  };

  const handleLogin = (data) => {
    // Validate login (you can add more sophisticated logic here)
    return user && user.email === data.email && user.password === data.password;
  };

  return (
    <Router>
      <Switch>
        <Route path="/login">
          <Login onLogin={handleLogin} />
        </Route>
        <Route path="/dashboard">
          <Dashboard user={user} />
        </Route>
        <Route path="/">
          <SignUp onSignUp={handleSignUp} />
        </Route>
      </Switch>
    </Router>
  );
};

export default App;


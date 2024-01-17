# LiveasyTest

// Login.js
import React from 'react';
import { useForm } from 'react-hook-form';
import { useHistory } from 'react-router-dom';

const Login = ({ onLogin }) => {
  const { register, handleSubmit, errors } = useForm();
  const history = useHistory();

  const onSubmit = (data) => {
    const loginSuccess = onLogin(data);
    if (loginSuccess) {
      history.push('/dashboard');
    } else {
      alert('Invalid email or password');
    }
  };

  return (
    <div>
      <h2>Login</h2>
      <form onSubmit={handleSubmit(onSubmit)}>
        <label>Email:</label>
        <input type="email" name="email" ref={register({ required: true })} />
        {errors.email && <span>This field is required</span>}

        <label>Password:</label>
        <input type="password" name="password" ref={register({ required: true })} />
        {errors.password && <span>This field is required</span>}

        <button type="submit">Login</button>
      </form>
    </div>
  );
};

export default Login;

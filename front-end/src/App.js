import React, { useState } from 'react';
import logo from './logo.svg';
import './App.css';
import axios from 'axios';

const TEXTURL = "http://localhost:8080/test";

function App() {
  const [text, setText] = useState();

  const getText = async () => {
    if (!text){
      const textdata = await axios.get(TEXTURL);
      setText(textdata.data[textdata.data.length-1].str)
    }else{
      setText("")
    }
  }

  const sendText = async (event) => {
    // POSTs text from field to the server, and subsequently the database
    event.preventDefault();
    const data = new FormData(event.target);
    const test_string = data.get('str');

    const payload = {
      'str' : test_string
    }

     try{
        await axios.post(TEXTURL, payload);
        alert('Submitted');
     }catch(e){
        alert(e);
     }
    }

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
         <form onSubmit={ sendText }>
           <label>
             Text to send to the backend: <br/>
             <input type="text" name="str" />
           </label><br/>
           <input type="submit" value="Submit" />
         </form>
         <hr/>
        <button type="button" className="btn btn-light" onClick={ getText }>Show/Hide Backend Text</button>
        <p> {text} </p>
      </header>
    </div>
  );
}

export default App;

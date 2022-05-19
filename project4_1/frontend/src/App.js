import logo from "./logo.svg";
import "./App.css";
import React, { useState, useEffect } from "react";
import axios from "axios";

function App() {
  const [user, setUser] = useState("");

  useEffect(() => {
    setContent(user.id);
  }, [user]);

  const [content, setContent] = useState(user.id);

  useEffect(() => {
    axios.post("/api/users").then((response) => {
      if (response.data) {
        console.log(response.data);
        setUser(response.data);
      } else {
        alert("failed!!");
      }
    });
  }, []);

  function testAxios() {
    axios
      .post(
        "/api/checkEmail",
        user,
        // {
        //   email: "test@naver.com",
        //   aaa: "aaa222",
        // },
        {
          headers: {
            "Content-type": "application/json",
            Accept: "application/json",
          },
        }
      )
      .then((response) => {
        console.log(response.data);
      })
      .catch((response) => {
        console.log("Error!");
      });
  }

  return (
    <div className="App">
      <header className="App-header">
        <ul>asdasd</ul>
        <h1>{user.id}</h1>
        <h1>{user.username}</h1>
        <h1>{user.password}</h1>
        <h1>{user.email}</h1>

        <textarea
          placeholder="수정할 id 입력"
          value={content}
          onChange={(e) => setContent(e.target.value)}
        />

        <button
          onClick={() => {
            let changedUser = user;
            changedUser.id = parseInt(content);
            setUser(changedUser);
            alert(`아이디를 ${user.id}로 수정했습니다.`);
            console.log(user);
            setContent("");
          }}
        >
          button
        </button>

        <button onClick={() => testAxios()}>axiosTest</button>
      </header>
    </div>
  );
}

export default App;

import "./App.css";
import { getAllStudents } from "./client";

function App() {
  getAllStudents().then((res) =>
    res.json().then((students) => {
      console.log(students);
    })
  );
  return <h1>Hello world Spring boot and React</h1>;
}

export default App;

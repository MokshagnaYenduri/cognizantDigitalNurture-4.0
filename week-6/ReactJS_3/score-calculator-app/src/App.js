import { CalculateScore } from "./components/CalculateScore";

function App(){
  return(
    <div>
      <CalculateScore name = {"Steve"}
        school = {"DNV High School"}
        total = {284}
        goal = {3}
        />
    </div>
  )
}
export default App;
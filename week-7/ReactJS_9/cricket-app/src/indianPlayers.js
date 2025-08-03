import React from 'react';

export default function IndianPlayers() {
  const team = ["Rohit", "Virat", "Rahul", "Shubman", "Hardik"];
  const [first, , third, , fifth] = team;
  const [, second, , fourth] = team;
  const T20players = ["Rohit", "Virat", "Surya"];
  const RanjiTrophy = ["Shaw", "Pujara", "Rahane"];
  const mergedPlayers = [...T20players, ...RanjiTrophy];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        <li>First: {first}</li>
        <li>Third: {third}</li>
        <li>Fifth: {fifth}</li>
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        <li>Second: {second}</li>
        <li>Fourth: {fourth}</li>
      </ul>

      <h2>Merged Players (T20 + Ranji)</h2>
      <ul>
        {mergedPlayers.map((name, index) => (
          <li key={index}>{name}</li>
        ))}
      </ul>
    </div>
  );
}

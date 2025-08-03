import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: "Rohit", score: 80 },
    { name: "Virat", score: 65 },
    { name: "Rahul", score: 55 },
    { name: "Shubman", score: 90 },
    { name: "Hardik", score: 50 },
    { name: "Jadeja", score: 72 },
    { name: "Pant", score: 60 },
    { name: "Ashwin", score: 77 },
    { name: "Shami", score: 45 },
    { name: "Bumrah", score: 85 },
    { name: "Surya", score: 92 },
  ];

  const playersBelow70 = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((item, index) => (
          <li key={index}>Mr. {item.name} <span>{item.score}</span></li>
        ))}
      </ul>

      <h2>Players with Score Below 70</h2>
      <ul>
        {playersBelow70.map((item, index) => (
          <li key={index}>{item.name} - {item.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
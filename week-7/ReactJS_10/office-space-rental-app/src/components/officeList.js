import React from 'react';
import './OfficeList.css';

const OfficeList = () => {
  const heading = <h2>Office Space , at Affordable Range</h2>;

  const offices = [
    {
      name: 'DBS',
      rent: 50000,
      address: 'Chennai',
    }
  ];

  return (
    <div>
      {heading}
      {offices.map((office, index) => (
        <div key={index} className="office-card">
          <img src={office.image} alt="Office space" />
          <p><strong>Name:</strong> {office.name}</p>
          <p style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
            <strong>Rent: Rs. {office.rent}</strong>
          </p>
          <p><strong>Address:</strong> {office.address}</p>
        </div>
      ))}
    </div>
  );
};

export default OfficeList;
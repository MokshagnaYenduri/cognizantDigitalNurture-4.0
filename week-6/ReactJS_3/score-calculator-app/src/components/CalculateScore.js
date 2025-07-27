import './StyleSheets/myStyles.css';

const percentToDecimal = (decimal) => {
    return (decimal.toFixed(2) + '%');
}

const calcScore = (total, goal) => {
    return (percentToDecimal(total / goal)); 
}

export const CalculateScore = ({Name, School, total, goal}) => {
    return(
    <div className = "formatStyle">
        <h1><font color = "Brown">Student details: </font></h1>
        <div className='name'>
            <b><span>Name: {Name}</span></b>
        </div>

        <div className='school'>
            <b><span>School: {School}</span></b>
        </div>

        <div className='total'>
            <b><span>Total: {total}</span></b>
        </div>

        <div className='score'>
            <b><span>Score: {calcScore(total, goal)}</span></b>
        </div>
    </div>
    );
}
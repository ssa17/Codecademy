const getSleepHours = day => {
  day = day.toLowerCase();
  switch(day){
    case 'monday':
      return 8;
    case 'tuesday':
      return 8;
    case 'wednesday':
      return 8;
    case 'thursday':
      return 8;
    case 'friday':
      return 8;
    case 'saturday':
      return 8;
    case 'sunday':
      return 8;
  }
}

const getActualSleepHours = () => 
getSleepHours('monday') + getSleepHours('tuesday') + getSleepHours('wednesday') + getSleepHours('thursday') + getSleepHours('friday') + getSleepHours('saturday') + getSleepHours('sunday');

const getIdealSleepHours = () => {
  let idealHours = 8;
  return idealHours * 7;
}

const calculateSleepDebt = () => {
  let actualSleepHours = getActualSleepHours();
  let idealSleepHours = getIdealSleepHours();
  if (actualSleepHours === idealSleepHours) {
    console.log('You got the perfect amount of Sleep!');
    } else if (actualSleepHours > idealSleepHours) {
    console.log(`You got too much sleep! You overslept by ${actualSleepHours - idealSleepHours} hours`);
    } else {
    console.log(`You need to sleep more! Get ${idealSleepHours - actualSleepHours} more hours to be optimal`);
  }
}

calculateSleepDebt();


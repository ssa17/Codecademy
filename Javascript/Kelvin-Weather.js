//temperature in Kelvin
const kelvin = 0;
//temperature in Celsius
const celsius = kelvin - 273;
//temperature in Fahrenheit
let fahrenheit = (celsius * (9/5) + 32);
//code to round the Fahrenheit figure down
fahrenheit = Math.floor(fahrenheit);

console.log(`The temperature is ${fahrenheit} degrees Fahrenheit.`);

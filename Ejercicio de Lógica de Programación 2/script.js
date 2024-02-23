const degrees = document.getElementById("degrees")

const degreesCelsius = () => {

  let temperature = 0;
  while (true) {
      const input = prompt(`Enter your temperature in degrees Celsius`);
      if (!isNaN(parseInt(input))) {
          temperature = parseInt(input);
          break;
      }
      alert(`Error, ${input} is not a validate number`);
  }

  return temperature;

};

const celsiusToFahrenheit = (celsius) => {
  return (celsius * (9.0 / 5.0)) + 32;
}

const celsiusToKelvin = (celsius) => {
  return celsius + 273.15;
}

const message = (celsius, fahrenheit, kelvin) => {

  let message = `<p>${celsius} C son ${fahrenheit} F <br> ${celsius} C son ${kelvin} K</p>`;
  degrees.innerHTML = message;

}

const main = () => {
  const celsius = degreesCelsius();
  const fahrenheit = celsiusToFahrenheit(celsius);
  const kelvin = celsiusToKelvin(celsius);
  message(celsius, fahrenheit, kelvin);
}

main();
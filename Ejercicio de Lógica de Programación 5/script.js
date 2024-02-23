var intentos = 0;
var numeroSecreto = parseInt(Math.random() * 1000 + 1);
var numeroDelUsuario;

alert(
  "Bienvenido al juego del mentalista, donde deberas intentar adivinar el numero secreto"
);

while (numeroDelUsuario != numeroSecreto && intentos < 10) {
  var numeroDelUsuario = prompt(
    "Ingrese un numero entre 1 y 1000. \n Tendras 10 intentos \n Numero de intentos: " +
      intentos
  );

  intentos++;

  if (numeroDelUsuario == numeroSecreto) {
    alert(
      "Acertaste. Felicidades!! y lo hiciste en " + intentos + " intentos."
    );
  } else if (numeroDelUsuario < numeroSecreto) {
    alert("Estas cerca, el numero es mayor que " + numeroDelUsuario);
  } else {
    alert("Estas cerca, el numero es menor que " + numeroDelUsuario);
  }
}
if (intentos == 10) {
  alert(
    "Mala suerte no acertaste y tus intentos terminaron. \n El numero era " +
      numeroSecreto
  );
}

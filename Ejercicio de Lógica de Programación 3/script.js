let numeroUsuario = parseFloat(window.prompt(("Ingresa un número para calcular su factorial")));
const answer = document.getElementById('answer');

function factorial(numeroUsuario) {
    if (numeroUsuario === 0) {
        return 1;
    } else {
        return numeroUsuario * factorial(numeroUsuario - 1);
    }
}

answer.innerHTML = `<p>La factorial de ${numeroUsuario} es:</br>${factorial(numeroUsuario)}</p>`;
const solicitarNumero = () => {
    let numero = 0;
    while (true) {
        const input = prompt(`Ingresa el número limite para la serie Fibonacci`);
        if (!isNaN(parseInt(input))) {
            numero = parseInt(input);
            break;
        }
        alert(`Lo siento, ${input} no es un número valido`);
    }
    return numero;
};

const calcularFibonacci = (numero) => {
    let anterior = 0;
    let actual = 1;
    let fibonacci = 0;
    let serieFibonacci = [anterior, actual];
    
    if (numero === 0) {
        serieFibonacci.pop();
        return serieFibonacci;
    }

    for (let i = 0; i < numero - 2; i++) {
        fibonacci = anterior + actual;
        anterior = actual;
        actual = fibonacci;
        serieFibonacci.push(fibonacci);
    }

    let serie = serieFibonacci.join(', ');
    let mensaje = `<p>La serie de Fibonacci de ${numero} es <br> ${serie}</p>`
    document.getElementById('imprimirFibonacci').innerHTML = mensaje;

}

const main = () => {
    const numero = solicitarNumero();
    calcularFibonacci(numero);
}

main();
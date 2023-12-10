function generarValorSensor() {
  return Math.floor(Math.random() * 101);
}

function verificarUmbral(valor) {
    const umbral = 80;

    if (valor > umbral) {
    console.log(`¡Alerta! El valor del sensor (${valor}) ha excedido el umbral (${umbral}).`);
    }
}

const intervalo = setInterval(() => {
    const valorSensor = generarValorSensor();
    console.log(`Valor del sensor: ${valorSensor}`);
    verificarUmbral(valorSensor);
}, 1000);

setTimeout(() => {
    clearInterval(intervalo);
    console.log('Simulación detenida.');
}, 10000);

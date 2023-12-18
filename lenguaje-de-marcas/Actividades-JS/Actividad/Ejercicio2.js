// //Ejercicio 1
// const readline = require('node:readline');
// const { stdin: input, stdout: output } = require('node:process');

// const rl = readline.createInterface({ input, output });

// rl.question("Que dia es hoy? ", (answer) => {
// console.log(`Hoy es : ${answer}`);
// rl.close();
// });

//Ejercicio 2
const readline = require('node:readline');
const { stdin: input, stdout: output } = require('node:process');
const rl = readline.createInterface({ input, output });
rl.question("Que temperatura hace? ", (answer) => {
    rl.question("Selecciona 1: Si esta en Celsius \nSelecciona 2: si esta en Fahrenheit\n", (tipo) => {
        if (tipo == 1) {
        answer = (answer *9 /5 +32);
        console.log(`La temperatura en Fahrenheit es : ${answer}`)
        }else {
        answer = (answer -32 *5 /9)
        console.log(`La temperatura en Celsius es: ${answer}`)
    }
rl.close();
});
})
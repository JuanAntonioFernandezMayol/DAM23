const readline = require('node:readline');
const { stdin: input, stdout: output } = require('node:process');
const rl = readline.createInterface({ input, output });
rl.question("Como te llamas? ", (answer) => {
    console.log(`Bienvenido! : ${answer}`);
})
    rl.close();
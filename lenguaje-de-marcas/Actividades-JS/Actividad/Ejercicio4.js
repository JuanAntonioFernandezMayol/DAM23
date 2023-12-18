const fs = require('fs');
const readline = require('node:readline');

const { stdin: input, stdout: output } = require('node:process');
const rl = readline.createInterface({ input, output });

rl.question("Introduce el nombre del fichero: ", (fileName) => {
    fs.readFile(fileName, 'utf8', (err, data) => {
        if (err) {
            console.error("Error de lectura:", err);
        } else {
            console.log("Contenido del fichero:");
            console.log(data);
    }
    rl.close();
    });
});



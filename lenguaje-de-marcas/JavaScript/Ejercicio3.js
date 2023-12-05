let values = [2, 56, 3, 41, 0, 4, 100, 23];

let suma = values[0] + values[1] + values[2] + values[3] + values[4] + values[5] + values[6] + values[7];
console.log(`La suma de todo es: ${suma}`)

let media = suma / 2;
console.log(`La media de todo el array: ${media}`)

max = Math.max.apply(null, values)
console.log(`El numero maximo del array es: ${max}`)

min = Math.min.apply(null, values)
console.log(`El numero maximo del array es: ${min}`)
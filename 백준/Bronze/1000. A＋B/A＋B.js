const fs = require('fs');
const inputData = fs.readFileSync(0, 'utf8').toString().split(' ');

let A = parseInt(inputData[0]);
let B = parseInt(inputData[1]);

console.log(A+B);
/**
 * Exercise 3:
 * Write a JavaScript function which returns the n rows by n columns identity matrix.
 */

function matrix(number){
    let i, j;
    
    for(i = 0; i < number; i++){
        for(j = 0; j < number; j++){
            if (i === j) {
                console.log(' 1 ');
            } else {
                console.log(' 0 ');
            }
            console.log('------------');
        }
    }
}

matrix(4);
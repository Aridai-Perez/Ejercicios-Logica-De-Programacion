const numbers = document.getElementById("numbers");
const actionBtn = document.getElementById("actionBtn");
const numbersArray = [];
let count = 0;

actionBtn.addEventListener("click", orderNumbers)

function orderNumbers() {
    count++
        if(count < 4) {
            let number = numbers.value;
            numbersArray.push(number)
            console.log(numbersArray);
            if(numbersArray.length == 3){
                orderAndPrint(numbersArray)
            }
        }
}

function orderAndPrint (array){

    const printNumbers = document.getElementById("printNumbers")
    const previousNumbers = document.getElementById("previousNumbers")

        if ((array[0] == array[1]) && (array[1] == array[2])) {
            previousNumbers.innerHTML = "Your numbers are equals"
        } else {
            previousNumbers.innerHTML = array
            array.sort(function (a, b) {
              return a - b;
            });
            printNumbers.innerHTML = array;
            console.log(array);
        }

}
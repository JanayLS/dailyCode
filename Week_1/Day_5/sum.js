// Prompts user to enter number
let user_num = prompt("Enter some numbers: ");
// finds length of user input
let len = user_num.length
// initialize variable and sum
let new_num;
let sum = 0;
// interates through the user input, makes each digit in the user input an integer and adds it to the new_num variable.
for (let i=0; i < len; i++) {
    
    new_num = parseInt(user_num[i]);
    // sum combines each digit in the user input together
    sum = sum + new_num
}
// prints sum to console
console.log("The sum of these digits is " + sum);

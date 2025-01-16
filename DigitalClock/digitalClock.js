const hour1 = document.getElementById("hour")
const minute1 = document.getElementById("minutes");
const seconds1 = document.getElementById("seconds");
const amorpm = document.getElementById("amorpm")
// console.log(hour,minute,seconds)
const currentDate = new Date();
// console.log(currentDate);


let hours = currentDate.getHours();
let minutes = currentDate.getMinutes();
let seconds = currentDate.getSeconds();


hours = hours % 12;
hours = hours ? hours : 12; // If hour is 0, make it 12

if(hours < 12){
    amorpm.textContent = "AM";
}else{
    amorpm.textContent = "PM"
}
hour1.textContent = hours;
minute1.textContent = minutes;
seconds1.textContent = seconds
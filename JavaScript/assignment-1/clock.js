let firstName = prompt("Lütfen isminizi giriniz: ")
let greeting = document.querySelector("#myName")
greeting.innerHTML = firstName

let clock = document.querySelector("#myClock")
function currentTime()  
{
    var today = new Date(); 
    var second = today.getSeconds(); 
    var minute = today.getMinutes();
    var hours = today.getHours();
    var day = today.getDay();
    var currentDay = ""

    if( day == 0)
    {
        currentDay = "Pazar"
    }
    else if (day == 1)
    {
        currentDay = "Pazartesi"
    }
    else if (day == 2)
    {
        currentDay = "Salı"
    }
    else if(day == 3)
    {
        currentDay = "Çarşamba"
    }
    else if (day == 4)
    {
        currentDay = "Perşembe"
    }
    else if (day == 5)
    {
        currentDay = "Cuma"
    }
    else if (day == 6)
    {
        currentDay = "Cumartesi"
    }
    else
    {
        currentDay = "NaN" 
    }
    clock.innerHTML = `${hours}:${minute}:${second} ${currentDay}`
}
setInterval(currentTime, 1000);
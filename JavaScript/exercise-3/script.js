//form exercise

/*
1: Select the formm
2: Put input info in ul
3: Reset the info
4: If there is no info in the form alert the user
*/

let userForm = document.querySelector('#userForm')
userForm.addEventListener('submit', formHandler)
const alertDOM = document.querySelector('#alert')

const alertFunction = (title, message, className= "warning") => `<div class="alert alert-${className}" role="alert">
<h4 class="alert-heading">${message}!</h4>
</div>`

function formHandler(event){
    event.preventDefault()
    const USER_NAME = document.querySelector('#username')
    const SCORE = document.querySelector('#score')
    if (USER_NAME.value && SCORE.value) {
        addItem(USER_NAME.value, SCORE.value)
        //reset after add
        USER_NAME.value = ""
        SCORE.value = "" 
    }else{
        alertDOM.innerHTML = alertFunction("Warning!","Something is missing...", "danger")
    }
}

let userListDOM = document.querySelector('#userList')


const addItem = (userName, score) => {
    let liDOM = document.createElement('li')
    liDOM.innerHTML = `${userName}
    <span class="badge bg-primary rounded-pill">${score}</span>
    ` 
    liDOM.classList.add(
        'list-group-item', 'd-flex', 'justify-content-between', 'align-items-center'
        )
    userListDOM.append(liDOM)
}
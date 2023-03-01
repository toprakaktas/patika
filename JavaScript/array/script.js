//arrays

//creating an array
let domain = "kodluyoruz"
let isActive = false
let items = [1, 2, 3, isActive, domain]

console.log(items)

let emptyArr = [] //empty array

//get the element number in array
console.log(items.length)

document.querySelector('#info').innerHTML = items.length

//get the first element of array
console.log(items[0])

//get the last element of array
console.log(items[items.length-1])

//check if info in element is in the array
console.log(Array.isArray(items))
console.log("[]: ", Array.isArray([]))
console.log("1: ", Array.isArray(1))

//get the element in the middle of the array
console.log(items[Math.floor(items.length/2)])

//add element at the end of the array
items.push(19)

//add element at the beginning of the array -> unshift
items.unshift(6)

//delete element from the end of array
let lastItem = items.pop() //lastItem becomes the item that popped

//delete element from the beginning of array
let firstItem = items.shift()

//change element info
items[0] = 8
console.log(items)
items[items.length-1] = 101
console.log(items)

//nested array
let femaleUsers = ["Jane", "Mary", "Cate"]
let maleUsers = ["John", "Toprak", "Mads"]

items.unshift(femaleUsers)
items.push(maleUsers)
console.log(items)

//splice(pos, item?)
let newItems = items.splice(2,4)
console.log("newItems: ", newItems)
console.log("items:", items)

//indexof('value')
items.unshift("lorem")
items.push("ipsum")
console.log(items.indexOf("ipsum"))
console.log(items.indexOf("lorem"))

//slice(), [...ES6]
let copyItems = items //this doesn't work properly
console.log(items)
copyItems.pop()
console.log(items)
console.log(copyItems)

copyItems = items.slice()
copyItems.pop()
console.log(copyItems)
console.log(items)

let es6Items = [...items]
console.log(es6Items)

let allUsers = [...femaleUsers, ...maleUsers] //merge with es6 
console.log(allUsers)

//toString, join
console.log(allUsers.toString())
console.log(allUsers.join("---"))

//splice(index, 0, value)
allUsers.splice(allUsers.length/2, 0, "Melissa")
console.log(allUsers)
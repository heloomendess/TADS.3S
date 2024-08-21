//DECLARAÇÃO DE VARIAVEIS 
const year = 1991;
let delayInSeconds = 0.00016;
let area = (16 * 3.14);
let halfArea = area / 2;
console.log(year); // -> 1991;
console.log(typeof year); // -> number;
let a = 10; // decimal - default
let b = 0x10; // hexadecimal
let c = 0o10; // octal
let d = 0b10; // binary

console.log(a); // -> 10
console.log(b); // -> 16
console.log(c); // -> 8
console.log(d); // -> 2
let x = 9e3;
let y = 123e-5;
console.log(x); // -> 9000
console.log(y); // -> 0.00123
let z = 0x21;
console.log(z);

//FUNCTION
var globalGreeting = "Good ";
function testFunction() {
var localGreeting = "Morning ";
console.log("function:");
console.log(globalGreeting);
console.log(localGreeting);
}

testFunction();
console.log("main program:");
console.log(globalGreeting);

//OBJETO
let testObj = {};
console.log(typeof testObj); // ->
object
let testObj1 = {
nr: 600,
str: "text"
};
console.log(testObj1.nr); // -> 600
console.log(testObj1.str); // -> text
let user1 = {
name: "Calvin",
surname: "Hart",
age: 66,
email: "CalvinMHart@teleworm.us"
};

let user2 = {
    name: "Mateus",
    surname: "Pinto",
    age: 21,
    email: "MateusPinto@dayrep.com"
    };
    console.log(user1.name); // -> Calvin
    console.log(user2.name); // -> Mateus
    console.log(user1.age); // -> 66
    user1.age = 67;
    console.log(user1.age); // -> 67
    console.log(user2.phone); // -> undefined
    user2.phone = "904-399-7557";
    console.log(user2.phone); // -> 904-399-7557
    delete user2.phone;
    console.log(user2.phone); // -> undefined


//OBJETOS COM FUNÇÃO
let test = {
    nr: 10,
    b: false,
    str: "uno dos tres",
    arr: [10, 20, 30],
    obj: {
    x: 10,
    y: 20
    },
    fn: function(arg) {
    console.log(arg)
    }
    };
    test.fn(123);
    console.log(test.obj.x);
    test.obj.y = 40;
    let point = {
    x: 0,
    y: 0,
    moveHorizontally: function(distance) {
    this.x = this.x + distance;
    },
    moveVertically: function(distance) {
    this.y = this.y + distance;
    }
    }
    console.log(point.x); // -> 0
    point.moveHorizontally(30);
    console.log(point.x); // -> 30
    point.moveVertically(40);
    console.log(point.y); // -> 40
    
//VETORES
    let days = ["Sun", "Mon","Tue", "Wed","Thu","Fri", "Sat"];
    console.log(days[0]); // -> Sun
    console.log(days[2]); // -> Tue
    console.log(days[5]); // -> Fri
    days[0] = "Sunday";
    console.log(days[0]); // -> Sunday
    let emptyArray = [];
    console.log(emptyArray[0]); // -> undefined

//OPERADORES DE IGUALDADE
    console.log("1" == 1); //COMPARAÇÃO ==
    console.log("1" === 1); //COMPARAÇÃO DE VALOR E TIPO ===
    let valor = 1;
    console.log(valor == 1);
    console.log(valor === 1);
    
    let aux = "1";
    console.log(aux == 1);
    console.log(aux === 1);
    valor = "2";
    console.log(aux != 1);
    console.log(aux !== 1);
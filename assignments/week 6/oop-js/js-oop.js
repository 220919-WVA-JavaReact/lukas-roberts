window.onload = () => {
    console.log("Hello World!");
    console.log(objectLiteral.sayMyName());
    console.log(objectLiteral2.sayMyName());
    let cus1 = new Customer("Lesly", "pass");
    let cus2 = new Customer("Victoria", "pass");
    cus1.sayMyName();
    cus2.sayMyName();

    let emp = new Employee("hello", "world");
    console.log(emp.getType())
    
}

let objectLiteral = {
    name: "Kevin",
    age: 42,
    sayHello: function() {
        return "Hello";
    },
    sayMyName: function() {
        return "Hello, my name is " + this.name;
    }
}

let objectLiteral2 = {
    name: "Lukas",
    age: 42,
    sayHello: function() {
        return "Hello";
    },
    sayMyName: function() {
        return `Hello, my name is ${this.name}`;
    }
}

// Creating Objects via functions/classes

function Customer(username, password) {
    this.username = username;
    this.password = password;

    this.sayMyName = function() {
        console.log(`Hello, my name is ${this.username}`)
    }
}

function User(type) {
    this.type = type;
    function getType() {
        return this.type;
    }
    return {
        getType: getType
    }
}


class Employee {
    constructor(username, password, role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    sayMyName() {
        console.log(`Hello, my name is ${this.username}`);
    }
    
    
}
Employee.prototype = new User('Employee')
/*
    Abstraction in JS
        - no interfaces, no abstract classes
        - concept of having logic in functions to be reused
            - focusing on input/output rather than implementation

    Inheritance in JS
        -

    Encapsulation in JS
        -

    Polymorphism in JS
        -

*/

function PoorMansMap() {
    let arr = [];

    function getKeyIfExists(key) {
        for(let i = 0; i < arr.length - 1; i += 2) {
            if (arr[i] === key) {
                return i
            }
        }
        return -1;
    }

    this.get = function(key) {
        let index = getKeyIfExists(key);
        
    }

    this.put = function(key, value) {
        
    }
}


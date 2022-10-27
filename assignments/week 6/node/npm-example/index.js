"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var user_1 = require("./src/user");
function saySomething(something) {
    console.log(something);
}
saySomething("hello");
saySomething(55);
//saySomething(true); // cant do this because type is not string or number
function createAndPrintUser() {
    var me = new user_1.User(1, 'kev', 'pass');
    console.log(me);
}
createAndPrintUser();

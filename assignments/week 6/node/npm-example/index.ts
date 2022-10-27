import { User } from "./src/user";
// function saySomething(something: string | number) {
//     console.log(something);
// }

// saySomething("hello");
// saySomething(55);
//saySomething(true); // cant do this because type is not string or number

function createAndPrintUser() {
    let me = new User(1, 'kev', 'pass');
    console.log(me);
    me.username = 'Kevin';
}
createAndPrintUser();
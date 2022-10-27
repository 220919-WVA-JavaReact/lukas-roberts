export class User {
    id: number | string;

    // convention for private fields is to prepend an _ to the name
    private _username: string;

    // protected fields are only accessible wiht the class and any child class
    protected password: string;

    constructor(id: number, username: string, password: string) {
        this.id = id;
        this._username = username;
        this.password = password;
    }

    public get username() {
        return this._username;
    }

    public set username(username: string) {
        if (username) {
            this._username = username;
        }
    }
}
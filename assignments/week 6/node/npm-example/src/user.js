"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.User = void 0;
var User = /** @class */ (function () {
    function User(id, username, password) {
        this.id = id;
        this._username = username;
        this.password = password;
    }
    Object.defineProperty(User.prototype, "username", {
        get: function () {
            return this._username;
        },
        set: function (username) {
            if (username) {
                this._username = username;
            }
        },
        enumerable: false,
        configurable: true
    });
    return User;
}());
exports.User = User;

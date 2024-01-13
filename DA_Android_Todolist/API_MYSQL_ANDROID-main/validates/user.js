const { body } = require('express-validator');
const message = require('./helper/message');
const util = require('util')

var options={
    username:{
        min: 6,
        max : 80
    },
    password:{
        minLength: 8,
        minLowercase: 1,
        minUppercase: 1,
        minNumbers: 1,
        minSymbols: 1
    },
    roles:['admin','user','publisher']
}

module.exports = {
    validator: function () {
        return [
            body('username', util.format(message.size_string_message, 'username',
                options.username.min, options.username.max)).isLength(options.username),
            body('email', 'Email phải đúng định dạng').isEmail(),
            body('userPassword', 'Mật khẩu phải là mật khẩu mạnh').isStrongPassword(options.password),
            body('role', 'Role không hợp lệ').isIn(options.roles)
        ];
    },
};
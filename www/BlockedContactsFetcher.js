var exec = require('cordova/exec');

module.exports.fetchBlockedContacts = function (arg0, success, error) {
    exec(success, error, 'BlockedContactsFetcher', 'fetchBlockedContacts', [arg0]);
};
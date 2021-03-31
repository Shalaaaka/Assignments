var sum = function add(a, b) {
    if (a === void 0) { a = 2; }
    if (b === void 0) { b = 2; }
    console.log(a + b);
};
sum();
sum(4);
sum(4, 4);
sum(undefined, 8);
function userFriends(username) {
    var friends = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        friends[_i - 1] = arguments[_i];
    }
    console.log(username);
    console.log(friends);
}
var username = "shalaka";
userFriends(username, 'Ayush', 'Sagar', 'Abhilekh', 'Shriya');
function printCapitalNames() {
    var friends = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        friends[_i] = arguments[_i];
    }
    console.log(friends.map(function (i) { return i.toUpperCase(); }));
    for (var i in friends) {
        console.log(friends[i]);
    }
}
var friendslist = ['shalaka', 'Ayush', 'Sagar', 'Abhilekh', 'Shriya'];
printCapitalNames.apply(void 0, friendslist);

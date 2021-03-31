var names = ['Tom', 'Ivan', 'Jerry'];
var lengths = names.map(function (name) { return name.length; });
var data = {
    "name": names, "length": lengths
};
console.log(data);

let sum=function add(a=2,b=2)
{
    console.log(a+b);
};
sum();
sum(4);
sum(4,4);
sum(undefined,8);


function userFriends(username,...friends)
{
    console.log(username);
    console.log(friends);
}
let username="shalaka";
userFriends(username,'Ayush','Sagar','Abhilekh','Shriya');


function printCapitalNames(...friends)
{
    console.log(friends.map(i=>i.toUpperCase()));
    for (let i in friends)
    {
        console.log(friends[i]);
    }
}
let friendslist=['shalaka','Ayush','Sagar','Abhilekh','Shriya'];
printCapitalNames(...friendslist);

/*ERROR:line12 (greet out of scope or cannot find greet)
function fun(name)
{
    if (name=='shalaka')
    {
        let greet="hello shalaka";
    }
    else
    {
        let greet="hello";
    }
    console.log(greet);
}
fun("shalaka");*/

function fun(name)
{
    let greet;
    if (name=='shalaka')
    {
        greet="hello shalaka";
    }
    else
    {
        greet="hello";
    }
    console.log(greet);
}
fun("sha")

var a=10;
var b=20;
if (a==10)
{
    var a=1;
    let b=2;
    console.log(a);//1 
    console.log(b);//2
}
console.log(a);//1 - functional scope
console.log(b);//20 - blockscope
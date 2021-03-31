interface Printable
{
    fname?:String;
    lname?:String;
    radius?:number;
}
let employee:Printable=
{
    fname:"Shalaka",
    lname:"Kale"
};
let circle:Printable=
{
    radius:4
};

function printAll(employee,circle)
{
    console.log(employee.fname+" "+employee.lname);
    console.log(circle.fname);
    console.log(circle.radius);
    
}
printAll(employee,circle);
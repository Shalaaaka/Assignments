let array=["Shalaka","Sanjay","Kale","Female"];
let [fname,mname,lname,gender]=array;
console.log(array[2]);
console.log(fname);
console.log(mname);
console.log(lname);
console.log(gender);

let organization ={
    Name:"ABCD",
    Address:
    {
        City:"Pune",
        Pin:"411030"
    }
};
let {Name,Address:{City,Pin}}=organization;
console.log(Pin);
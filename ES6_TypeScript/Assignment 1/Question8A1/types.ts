class Account
{
    Id:number;
    Name:string;
    Balance:number;
    constructor()
    {
        this.Id=1;
        this.Name="xyz";
        this.Balance=1000;
    }
    getBalance()
    {
        return this.Balance;
    }

}
class CurrentAccount extends Account
{
    cash_credit:number;
    constructor(cash_credit)
    {
        super();
        this.Balance=this.Balance+cash_credit;
    }
}
//Initial data 
let a=new Account();
console.log(a);

//Updated Balance
let ca1=new CurrentAccount(1000);
console.log(ca1);

/*
class SavingAccount extends Account
{
    interest:number;
    addInterest (interest)
    {
        this.Balance=this.Balance+this.Balance*this.interest;
    }
} */
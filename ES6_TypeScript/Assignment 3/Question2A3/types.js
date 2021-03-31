var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Account = /** @class */ (function () {
    function Account() {
        this.Id = 1;
        this.Name = "xyz";
        this.Balance = 1000;
    }
    Account.prototype.getBalance = function () {
        return this.Balance;
    };
    return Account;
}());
var CurrentAccount = /** @class */ (function (_super) {
    __extends(CurrentAccount, _super);
    function CurrentAccount(cash_credit) {
        var _this = _super.call(this) || this;
        _this.Balance = _this.Balance + cash_credit;
        return _this;
    }
    return CurrentAccount;
}(Account));
//Initial data 
var a = new Account();
console.log(a);
//Updated Balance
var ca1 = new CurrentAccount(1000);
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

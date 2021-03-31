const sym = Symbol();
class SymbolsDemo {
    constructor() {
        this.previousNo = 0;
        this.currentNo = 1;
        this.previousNo = this.previousNo;
        this.currentNo = this.currentNo;
    }
    [sym]() {
        console.log("fibonacci series");
        for (let i = 1; i < 10; i++) {
            console.log(this.previousNo);
            let nextTerm = this.previousNo + this.currentNo;
            this.previousNo = this.currentNo;
            this.currentNo = nextTerm;
        }
        console.log("Next number from Fibonacci series");
        return this.previousNo;
    }
}
var obj = new SymbolsDemo;
console.log(obj[sym]());

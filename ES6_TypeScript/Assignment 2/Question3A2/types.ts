function *getNextArmstrong()
{
    yield 153;
    yield 370;
    yield 371;
    yield 407;
}
let mygen=getNextArmstrong();
console.log(mygen.next());
console.log(mygen.next());
console.log(mygen.next());
console.log(mygen.next());
console.log(mygen.next());

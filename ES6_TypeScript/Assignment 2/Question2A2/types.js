const iterable1 = [];
iterable1[Symbol.iterator] = function* () {
    yield 153;
    yield 370;
    yield 371;
    yield 407;
};
console.log([...iterable1]);
for (let list of iterable1) {
    console.log(list);
}
// Basic implementation of symbol.iterator

class Sieve {
  constructor(number){
    this.number = number;
  }

  get primes() {
    return this.getPrimes(this.createRange(), 0);
  }

  getPrimes(range, position) {
    if (position >= range.length) {
      return range;
    }
    for (let i = 0; i < range.length; i++) {
      if (range[i] % range[position] == 0 && range[i] != range[position]) {
        range.splice(i, 1);
      }
    }
    position += 1;
    return this.getPrimes(range, position)
  }

  createRange() {
    let range = [];
    let counter = 2

    while (counter <= this.number) {
      range.push(counter);
      counter += 1;
    }
    return range;
  }

}

module.exports = Sieve;

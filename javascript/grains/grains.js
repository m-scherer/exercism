var BigInt = require('./big-integer');

class Grains {
  constructor() {}

  square(boardSquare){
    return BigInt(2).pow(boardSquare - 1).toString();
  }

  total(boardSquare){
    return BigInt(2).pow(64).minus(1).toString();
  }


}

module.exports = Grains;

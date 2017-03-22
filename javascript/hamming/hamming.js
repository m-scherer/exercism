function Hamming(){};

Hamming.prototype.compute = function(strand1, strand2){
  var array1 = strand1.split("")
  var array2 = strand2.split("")
  var counter = 0

  function arrayCheck(array1, array2) {
    if (array1.length != array2.length) {
      throw 'DNA strands must be of equal length.';
    }
    return array1.length;
  }

  for (var i = 0; i < arrayCheck(array1, array2); i++) {
    if (array1[i] == array2[i]) {
      continue;
    } else {
      counter += 1;
    }
  }
  return counter;
}

module.exports = Hamming;

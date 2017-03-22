var Etl = function(){}

Etl.prototype.transform = function(input) {
  var result = {};
  var x;

  for (x in input) {
    for (var i = 0; i < input[x].length; i++) {
      result[input[x][i].toLowerCase()] = parseInt(x);
    }
  }
  return result;
}

module.exports = Etl;

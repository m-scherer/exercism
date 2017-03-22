//
// This is only a SKELETON file for the "Bob" exercise. It's been provided as a
// convenience to get you started writing code faster.
//

var Bob = function() {};

Bob.prototype.hey = function(input) {
  var trim = input.trim()
  var split = trim.split("")
  var response = ""

  if ( trim === '' ) {
    response = 'Fine. Be that way!'
  } else if ( input.toUpperCase() === input && input.match(/[A-Z]/) ) {
    response = 'Whoa, chill out!';
  } else if ( split[split.length - 1] === '?' ) {
    response = 'Sure.';
  } else {
    response = 'Whatever.';
  }
  return response;
};

module.exports = Bob;

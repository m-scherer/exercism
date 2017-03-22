var planets = {
  earth: 31557600,
  mercury: 0.2408467,
  venus: 0.61519726,
  mars: 1.8808158,
  jupiter: 11.862615,
  saturn: 29.447498,
  uranus: 84.016846,
  neptune: 164.79132
}

var SpaceAge = function(seconds){
  var self = this
  this.seconds = seconds;
  this.onEarth = function() {
    return Number( ( self.seconds / planets['earth'] ).toFixed(2) )
  }
  this.onMercury = function() { return getTrunc("mercury"); }
  this.onVenus = function() { return getTrunc("venus"); }
  this.onMars = function() { return getTrunc("mars"); }
  this.onJupiter = function() { return getTrunc("jupiter"); }
  this.onSaturn = function() { return getNumber("saturn"); }
  this.onUranus = function() { return getTrunc("uranus"); }
  this.onNeptune = function() { return getNumber("neptune"); }

  function getTrunc(planet) {
    return Math.trunc( self.onEarth() / planets[planet] * 100 ) / 100;
  }

  function getNumber(planet) {
    return Number( ( self.onEarth() / planets[planet] ).toFixed(2) );
  }

}

module.exports = SpaceAge;

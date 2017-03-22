function dnaTranscriber(){};

dnaTranscriber.prototype.toRna = function(strand) {
  dna = strand.split("")
  transcriber = {
    'C': 'G',
    'G': 'C',
    'A': 'U',
    'T': 'A'
  }
  transcribed = ""

  for (var i = 0; i < dna.length; i++) {
    transcribed = transcribed.concat(transcriber[dna[i]]);
  }
  return transcribed;
}

module.exports = dnaTranscriber;

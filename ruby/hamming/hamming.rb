require 'pry'
class Hamming

  def self.compute(strand1, strand2)
    raise_error(strand1, strand2)
    split1 = strand1.split("")
    split2 = strand2.split("")
    counter = 0

    split1.each_with_index do |v, i|
      counter += 1 if v != split2[i]
    end
    
    counter
  end

  def self.raise_error(strand1, strand2)
    raise ArgumentError.new if strand1.length != strand2.length
  end

end

module BookKeeping
  VERSION = 3
end

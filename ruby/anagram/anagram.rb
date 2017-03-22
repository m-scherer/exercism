class Anagram
  attr_reader :word

  def initialize(word)
    @word = word
  end

  def match(word_list)
    thing = word_list.map do |possible|
      possible if possible.length == word.length && anagram(possible)
    end.compact
  end

  def anagram(possible)
    word_down = word.downcase
    possible_down = possible.downcase
    matched = word.split('').map do |letter|
      return false if possible_down.count(letter) != word_down.count(letter) || word_down == possible_down
    end
    !matched.include?(false)
  end

end

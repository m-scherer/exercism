class SumOfMultiples
  attr_reader :multiple1, :multiple2, :multiple3

  def initialize(multiple1, multiple2, multiple3 = 0)
    @multiple1 = multiple1
    @multiple2 = multiple2
    @multiple3 = multiple3
  end

  def to(number)
    numbers = []
    1.upto(number-1) do |i|
      if i % multiple1 == 0 || i % multiple2 == 0 || (multiple3 != 0 && i % multiple3 == 0)
        numbers << i
      end
    end

    numbers.reduce(0) { |sum, n| sum + n }
  end

end

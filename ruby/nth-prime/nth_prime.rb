require 'Prime'

class Prime

  def self.nth(number)
    check_error(number)
    test_number = 1
    counter = 0
    while counter < number
      test_number += 1
      if Prime.prime?(test_number)
        counter += 1
      end
    end
    test_number
  end

  def check_error(number)
    if number == 0
      raise ArgumentError
    end
  end

end

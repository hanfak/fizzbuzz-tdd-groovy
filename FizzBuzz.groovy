class FizzBuzz {

    def check( Integer num ) throws NumberLessThanOneException{
      if( num < 1 ) {
        throw new NumberLessThanOneException('Input is less than 1')
      }
      if( divisible_by( num, 15) ) {
        return 'fizzbuzz'
      }
      if( divisible_by( num, 3 ) ) {
        return 'fizz'
      }
      if( divisible_by( num, 5 ) ) {
        return 'buzz'
      }
      num
    }

    def divisible_by( Integer num, Integer divisor ) {
      num % divisor == 0
    }
}

class NumberLessThanOneException extends Exception {

    NumberLessThanOneException(String message) {
        super(message)
    }
}

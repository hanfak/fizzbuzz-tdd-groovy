class FizzBuzz {

    def check( Integer num ) {
      if( divisible_by( num, 3 ) ) {
        'fizz'
      } else if( divisible_by( num, 5 ) ) {
        'buzz'
      }
    }

    def divisible_by( num, divisor ) {
      num % divisor == 0
    }
}

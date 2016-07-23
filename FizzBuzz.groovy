class FizzBuzz {

    def check( Integer num ) {
      if( divisible_by( num, 15) ) {
        return 'fizzbuzz'
      }
      if( divisible_by( num, 3 ) ) {
        return 'fizz'
      }
      if( divisible_by( num, 5 ) ) {
        return 'buzz'
      }
    }

    def divisible_by( num, divisor ) {
      num % divisor == 0
    }
}

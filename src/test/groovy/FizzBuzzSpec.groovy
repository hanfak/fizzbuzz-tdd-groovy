import spock.lang.*

class FizzBuzzSpec extends Specification {
  def fb = new FizzBuzz()

  def 'return fizz with multiple of 3'() {
      when:
      String res = fb.check(num)

      then:
      res == 'fizz'

      where:
      num | _
        3 | _
        6 | _
        9 | _
       12 | _
       27 | _
  }

  def 'return buzz with multiple of 5'() {
      when:
      String res = fb.check(num)

      then:
      res == 'buzz'

      where:
      num | _
        5 | _
       10 | _
       25 | _
      100 | _
      245 | _
     9680 | _
  }

  def 'return buzz with multiple of 15'() {
      when:
      String res = fb.check(num)

      then:
      res == 'fizzbuzz'

      where:
      num | _
       15 | _
       30 | _
      120 | _
     3015 | _
  }

  def 'does not return fizz, buzz or fizzbuzz when not 3, 5 or 15'() {
    when:
    def res = fb.check(num)

    then:
    res != 'fizz' || 'buzz' || 'fizzbuzz'

    where:
    num | _
      1 | _
     17 | _
    382 | _
  }

  def 'return number when not 3, 5 or 15'() {
    when:
    def res = fb.check(num)

    then:
    res == num

    where:
    num | _
      1 | _
     17 | _
    382 | _
  }


  def 'return exits if any number is less than 1'() {
    when:
    def res = fb.check(num)

    then:
    def exception = thrown(NumberLessThanOneException)
    exception.message == 'Input is less than 1'

    where:
    num | _
      0 | _
     -3 | _
     -5 | _
    -15 | _
  }
}

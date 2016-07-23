@Grab(group='org.spockframework', module='spock-core', version='0.7-groovy-2.0')
import spock.lang.*

class FizzBuzzSpec extends Specification {
  def fb = new FizzBuzz()

  @Unroll
  void 'return fizz with multiple of 3'() {
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

  @Unroll
  void 'return buzz with multiple of 5'() {
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

  void 'return fizzbuzz with 15'() {
      when:
      def res = fb.check(15)

      then:
      res == 'fizzbuzz'
  }

  @Unroll
  void 'return buzz with multiple of 15'() {
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

  @Unroll
  void 'return nothing when not 3 or 5'() {
    when:
    def res = fb.check(num)

    then:
    res != 'fizz' || 'buzz' || 'fizzbuzz'

    where:
    num | _
      0 | _
      1 | _
     17 | _
  }

}

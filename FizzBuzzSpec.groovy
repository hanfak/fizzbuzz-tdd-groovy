@Grab(group='org.spockframework', module='spock-core', version='0.7-groovy-2.0')
import spock.lang.*

class FizzBuzzSpec extends Specification {
  def fb = new FizzBuzz()

  void 'return fizz with 3'() {
      when:
      def res = fb.check(3)

      then:
      res == 'fizz'
  }

  void 'return nothing when not 3'() {
      when:
      def res = fb.check(1)

      then:
      res == null
  }

  @Unroll
  void 'return fizz with multiple of 3'() {
      when:
      String res = fb.check(num)

      then:
      res == 'fizz'

      where:
      num | _
        6 | _
        9 | _
       12 | _
       27 | _
       45 | _
  }

  void 'return buzz with 5'() {
      when:
      String res = fb.check(5)

      then:
      res == 'buzz'
  }

  @Unroll
  void 'return buzz with multiple of 5'() {
      when:
      String res = fb.check(num)

      then:
      res == 'buzz'

      where:
      num | _
       10 | _
       25 | _
      100 | _
      245 | _
     9680 | _
  }

}

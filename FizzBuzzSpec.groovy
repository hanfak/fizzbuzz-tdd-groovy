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

  void 'return fizz with 3'() {
      when:
      def res = fb.check(1)

      then:
      res == null
  }

  @Unroll
  void 'return fizz with multiple of <num>'() {
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
}

@Grab(group='org.spockframework', module='spock-core', version='0.7-groovy-2.0')
import spock.lang.*

class FizzBuzzSpec extends Specification {
  void 'return fizz with 3'() {
      given:
      def fb = new FizzBuzz()

      when:
      def res = fb.check(3)

      then:
      res == 'fizz'
  }
}

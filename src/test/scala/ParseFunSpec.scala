import org.scalatest.FunSpec
import api.hiraq.google.shortenurl.Parse

class ParseFunSpec extends FunSpec {
	
	describe("I want to test Parse processes") {												
		describe("I want to know final client url from given values") {
			it("Client url should be a combination between host and given shortened url") {
				Parse("test")
				
				val client = Parse.getHost + "=" + "test"
				assert(client == Parse.getClient)
			}
		}
		describe("I want to know a result from real url") {
			it("Given shorten google url, should be parsed correctly") {
				Parse("http://goo.gl/7VYxtt")
				
				val real = Parse.run
				assert(real.longUrl == "http://tulisanhiraq.net/")
			} 
		}
	}	
	
}
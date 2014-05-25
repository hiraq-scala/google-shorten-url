import org.scalatest.FunSpec
import api.hiraq.google.shortenurl.Structure

class StructureFunSpec extends FunSpec {
	
	describe("I want to test Sctructure class values") {
		they("given values should be same") {
			val structure = Structure("kind", "id", "longUrl", "status")
			assert(structure.kind == "kind")
			assert(structure.id == "id")
			assert(structure.longUrl == "longUrl")
			assert(structure.status == "status")
		}
	}
	
}
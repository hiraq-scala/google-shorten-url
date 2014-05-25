package api.hiraq.google.shortenurl

class Shorten {
	
	def start(args: String) = {
		Parse(args)
		
		try {
			val results = Parse.run
			println(results.longUrl)
		}catch{			
			case e: Exception			=> Console.println(e.getMessage())
		}
	}
	
}

object Shorten {

	def main(args: Array[String]): Unit = {
		val list = args.toList
		val api = new Shorten
		api.start(list(0))
	}

}
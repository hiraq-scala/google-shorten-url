package api.hiraq.google.shortenurl

import scala.util.parsing.json._
import scala.io.Source

sealed class Parse {
			
	def getRealUrl(url: String): Structure = {
		val content = Source.fromURL(url).mkString
		val json = JSON.parseFull(content)
		
		/*
		 * setup values
		 */
		json match {			
			case Some(e)	=> 
				val jsonMap = e.asInstanceOf[Map[String, String]]
				jsonMap match {
					case x: Map[String, String]	=> Structure(x("kind"), x("id"), x("longUrl"), x("status"))					
				}
			case None		=> throw new Exception("Unknown url")
		}
	}
	
}

object Parse {							
	
	val parse: Parse = new Parse
	private var client: String = new String
	private val host: String = "https://www.googleapis.com/urlshortener/v1/url?shortUrl"	
	
	def apply(url: String) = {
		client = url		
	}
	
	def getClient(): String = {
		getHost + "=" + client
	}
	
	def getHost(): String = {
		host
	}
	
	def run() = {
		val clientToAccess = getClient
		val results = parse.getRealUrl(clientToAccess)
		results
	}
	
}
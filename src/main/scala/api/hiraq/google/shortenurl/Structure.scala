package api.hiraq.google.shortenurl

/**
 * A json response status when user expand any goo.gl short url
 */
case class Structure(kind: String, id: String, longUrl: String, status: String)
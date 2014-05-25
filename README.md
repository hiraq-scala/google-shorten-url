google-shorten-url
==================

This is my first library using Scala programming languages.  The purpose of this library
is to learn Scala programming language but using real case, so i'm choose to try to create
a library to work with Google Shorten URL API.

Version 1.0.0 only for read & parse json response from google shorten url, and next version
maybe i will create a shortened url too.

###How to run :

I'm using <pre>sbt-pack</pre> to packaging the source code.  Just try to run this command:

<code>
	sbt-pack
</code>

<code>
	$: target/pack/bin/shorten "http://goo.gl/7VYxtt"
</code>

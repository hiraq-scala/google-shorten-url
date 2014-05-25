google-shorten-url
==================

This is my first library using Scala programming languages.  The purpose of this library
is to learn Scala programming language but using real case, so i'm choose try to create
a library to work with Google Shorten URL API.

Version 1.0.0 only for read & parse json response from google shorten url, and next version
maybe i will create a shortened url too.

###How to run :

I'm using <code>sbt-pack</code> to packaging the source pre.  Just try to run this command:

<pre>
	sbt-pack
</pre>

<pre>
	target/pack/bin/shorten "http://goo.gl/7VYxtt"
</pre>

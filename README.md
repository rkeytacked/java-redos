# java-redos
Supplement project for my talks about ReDoS via pattern matching in schema validation.

## Evil Regular Expressions

Simplest example: make pattern `a?a?a?…a?aaa…a` match the text `aaa…a`. (You can read the pattern as `(a?)^n a^n` and the text input as `a^n`.)

That's just a weird way to describe any string of _n_ to _2*n_ times the character `a` in a row.

But even weirder is how all the Regex engines behave with that, because of their poor implementation of greedy backtracking.

The test class [de.creativecouple.talks.PatternTest](https://github.com/rkeytacked/java-redos/blob/master/src/test/java/de/creativecouple/talks/PatternTest.java) demonstrates the matching of this particular pattern against `java.util.regex.Pattern` and `com.google.re2j.Pattern`.

See also
- [ReDoS - OWASP](https://www.owasp.org/index.php/Regular_expression_Denial_of_Service_-_ReDoS)
- [Regular Expression Matching Can Be Simple And Fast (but is slow in Java, Perl, PHP, Python, Ruby, ...)](https://swtch.com/~rsc/regexp/regexp1.html)

## Example schema validation

See [/src/test/resources](https://github.com/rkeytacked/java-redos/tree/master/src/test/resources) for the XML and JSON Schema examples.

The test classes [JaxbTest](https://github.com/rkeytacked/java-redos/blob/master/src/test/java/de/creativecouple/talks/JaxbTest.java), [XmlBeansTest](https://github.com/rkeytacked/java-redos/blob/master/src/test/java/de/creativecouple/talks/XmlBeansTest.java), and [JsonSchemaTest](https://github.com/rkeytacked/java-redos/blob/master/src/test/java/de/creativecouple/talks/JsonSchemaTest.java) deomnstrate the pattern matching as part of the schema validation of common mentioned libraries.

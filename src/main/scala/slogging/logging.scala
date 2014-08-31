//     Project: slibs / logging
//      Author: Johannes Kastner
// Description: Defines mixins for logging
package logging

/**
 * Defines `logger` as a lazy value initialized with an [[UnderlyingLogger]]
 * named according to the class into which this trait is mixed
 */
trait LazyLogging {

  protected lazy val logger = LoggerFactory.getLogger(getClass.getName)

}

/**
 * Defines `logger` as a value initialized with an [[UnderlyingLogger]]
 * named according to the class into which this trait is mixed
 */
trait StrictLogging {
  protected val logger : Logger = LoggerFactory.getLogger(getClass.getName)
}

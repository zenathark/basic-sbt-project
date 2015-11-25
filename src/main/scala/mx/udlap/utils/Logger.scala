package mx.udlap.utils;

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/** An object that can log its activity. This trait works as a mixin.
  *
  * This trait adds quick methods for logging activity of the object at
  * different levels. If a more complex operation is needed from the
  * logger, the provate variable, which is an instance of
  * [[org.slf4j.Logger]] can be used.
  */
trait Loggable {

  // The private logger
  val logger = LoggerFactory.getLogger(this.getClass.getName)

  /** Shows msg on the debug log at debug level
    *
    * @param msg the message to be shown
    */
  def debug(msg: String) = logger.debug(msg)

  /** Shows msg on the debug log at error level
    *
    * @param msg the message to be shown
    */
  def error(msg: String) = logger.error(msg)

  /** Shows msg on the debug log at debug level
    *
    * @param msg the message to be shown
    */
  def info(msg: String) = logger.info(msg)
}

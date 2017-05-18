package wvlet.klog

import java.util.logging.LogRecord


typealias JLogger = java.util.logging.Logger


/**
 *
 */
class Logger(private val wrapper: JLogger) {

    constructor(name:String) : this(JLogger.getLogger(name)) {

    }

    companion object {

        private val rootLogger = Logger(JLogger.getLogger(""))

        fun setDefaultFormatter() {

        }
    }

    private var parent: Logger? = null

    fun setLogLevel(level: LogLevel): Boolean {
        return wrapper.isLoggable(level.jlLevel)
    }

    fun log(level: LogLevel, message: Any) {
        if (wrapper.isLoggable(level.jlLevel)) {
            wrapper.log(LogRecord(level.jlLevel, message.toString()))
        }
    }
    fun log(level: LogLevel, message: Any, exception:Throwable) {
        val l = LogRecord(level.jlLevel, message.toString())
        l.thrown = exception
        wrapper.log(l)
    }
    fun error(message: Any) {
        log(LogLevel.ERROR, message)
    }
    fun warn(message: Any) {
        log(LogLevel.WARN, message)
    }
    fun info(message: Any) {
        log(LogLevel.INFO, message)
    }
    fun debug(message: Any) {
        log(LogLevel.DEBUG, message)
    }
    fun trace(message: Any) {
        log(LogLevel.TRACE, message)
    }

    fun error(message: Any, e:Throwable) {
        log(LogLevel.ERROR, message, e)
    }
    fun warn(message: Any, e:Throwable) {
        log(LogLevel.WARN, message, e)
    }
    fun info(message: Any, e:Throwable) {
        log(LogLevel.INFO, message, e)
    }
    fun debug(message: Any, e:Throwable) {
        log(LogLevel.DEBUG, message, e)
    }
    fun trace(message: Any, e:Throwable) {
        log(LogLevel.TRACE, message, e)
    }

    fun isEnabled(level: LogLevel): Boolean {
        return wrapper.isLoggable(level.jlLevel)
    }
}


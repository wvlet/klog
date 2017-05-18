package wvlet.klog

import java.util.logging.LogRecord


typealias JLogger = java.util.logging.Logger


/**
 *
 */
class Logger(private val wrapper: JLogger) {

    companion object {

        private val rootLogger = Logger(JLogger.getLogger(""))

        fun setDefaultFormatter() {

        }
    }


    private var parent: Logger? = null

    fun setLogLevel(level: LogLevel): Boolean {
        wrapper.isLoggable(level.jlLevel)
    }

    fun log(level: LogLevel, message: String) {
        if (wrapper.isLoggable(level.jlLevel)) {
            wrapper.log(LogRecord(level.jlLevel, message))
        }
    }

    fun isEnabled(level: LogLevel): Boolean {
        return wrapper.isLoggable(level.jlLevel)
    }
}


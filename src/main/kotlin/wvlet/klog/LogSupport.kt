package wvlet.klog


/**
 *
 */
interface LogSupport {

    val logger : Logger

    fun error(s: () -> Any) {
        if(logger.isEnabled(LogLevel.ERROR)) {
            logger.error(s.invoke())
        }
    }
    fun warn(s: () -> String) {
        if(logger.isEnabled(LogLevel.WARN)) {
            logger.warn(s.invoke())
        }
    }
    fun info(s: () -> String) {
        if(logger.isEnabled(LogLevel.INFO)) {
            logger.info(s.invoke())
        }
    }
    fun debug(s: () -> String) {
        if(logger.isEnabled(LogLevel.DEBUG)) {
            logger.debug(s.invoke())
        }
    }
    fun trace(s: () -> String) {
        if(logger.isEnabled(LogLevel.TRACE)) {
            logger.trace(s.invoke())
        }
    }

    fun error(e:Throwable, s:() -> String) {
        if(logger.isEnabled(LogLevel.ERROR)) {
            logger.error(s.invoke(), e)
        }
    }
    fun warn(e:Throwable,s:() -> String) {
        if(logger.isEnabled(LogLevel.ERROR)) {
            logger.warn(s.invoke(), e)
        }

    }
    fun info(e:Throwable, s:() -> String) {
        if(logger.isEnabled(LogLevel.INFO)) {
            logger.info(s.invoke(), e)
        }

    }
    fun debug(e:Throwable, s: () -> String) {
        if(logger.isEnabled(LogLevel.DEBUG)) {
            logger.debug(s.invoke(), e)
        }
    }
    fun trace(e:Throwable, s:() -> String) {
        if(logger.isEnabled(LogLevel.TRACE)) {
            logger.error(s.invoke(), e)
        }
    }

}

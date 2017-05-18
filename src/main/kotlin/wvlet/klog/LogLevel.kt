package wvlet.klog


typealias JLevel = java.util.logging.Level
/**
 *
 */
enum class LogLevel(val jlLevel: JLevel) {
    OFF(JLevel.OFF),
    ERROR(JLevel.SEVERE),
    WARN(JLevel.WARNING),
    INFO(JLevel.INFO),
    DEBUG(JLevel.FINE),
    TRACE(JLevel.FINER),
    ALL(JLevel.ALL);
}

package wvlet.klog

/**
 *
 */
interface LogSupport {

    fun error(s: String)
    fun warn(s: String)
    fun info(s: String)
    fun debug(s: String)
    fun trace(s: String)

    fun error(s:String, e:Throwable)
    fun warn(s:String, e:Throwable)
    fun info(s:String, e:Throwable)
    fun debug(s:String, e:Throwable)
    fun trace(s:String, e:Throwable)
}

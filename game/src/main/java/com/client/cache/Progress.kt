package com.client.cache

/** * @author DeadScape
 * @social Discord: DeadScape
 * Website: www.kyros.net
 * @since 11/03/2024 */
abstract class Progress {

    var fileName : String = ""
    var totalDone : Int = 0
    var size : Int = 0
    var link : String = ""

    abstract fun update(progress: Int, message: String)

}
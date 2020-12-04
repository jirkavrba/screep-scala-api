package dev.vrba.screeps

import netscape.javascript.JSObject

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("Game")
trait Game extends js.Object {

  @js.native
  trait Shard extends js.Object {
    val name: String = js.native
    val `type`: String = js.native
    val ptr: Boolean = js.native
  }

  @js.native
  trait Cpu extends js.Object {
    val limit: Int = js.native
    val tickLimit: Int = js.native
    val bucket: Int = js.native
    val shardLimits: Map[String, Int] = js.native
    val unlocked: Boolean = js.native
    val unlockedTime: Int = js.native

    def getHeapStatistics(): Map[String, Int] = js.native
    def getUser(): Float = js.native
    def halt(): Unit = js.native
    def setShardLimits(limits: Map[String, Int]): Int = js.native
    def unlock(): Int = js.native
    def generatePixel(): Int = js.native
  }

  @js.native
  trait Gcl extends js.Object {
    val level: Int = js.native
    val progress: Int = js.native
    val progressTotal: Int = js.native
  }

  type Gpl = Gcl

  val cpu: Cpu = js.native
  val gcl: Gcl = js.native
  val gpl: Gpl = js.native
  val shard: Shard = js.native
  val time: Int = js.native

  def getObjectById(id: String): Option[JSObject] = js.native
  def notify(message: String, groupInterval: Int = 0): Unit = js.native
}

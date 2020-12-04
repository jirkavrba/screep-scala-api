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

  @js.native
  trait FindRouteOpts extends js.Object {
    val routeCallback: Option[(String, String) => Float] = None
  }

  @js.native
  trait RouteExit extends js.Object {
    val exit: Int = js.native
    val room: String = js.native
  }

  @js.native
  trait RoomStatus extends js.Object {
    val status: String
    val timestamp: Int
  }

  @js.native
  trait MapObject extends js.Object {
    def describeExits(roomName: String): Map[String, String] = js.native

    def findExit(fromRoom: String, toRoom: String, opts: Option[FindRouteOpts] = None): Int = js.native

    def findRoute(fromRoom: String, toRoom: String, opts: Option[FindRouteOpts] = None): Either[Int, Seq[RouteExit]] = js.native

    def getRoomLinearDistance(roomName1: String, roomName2: String, continuous: Boolean = false): Int = js.native

    // TODO: Add getRoomTerrain

    def getWorldSize(): Int = js.native

    def getRoomStatus(roomName: String): RoomStatus
  }

  type Gpl = Gcl

  // TODO: Add constructionSites
  val cpu: Cpu = js.native
  // TODO: Add creeps
  // TODO: Add flags
  val gcl: Gcl = js.native
  val gpl: Gpl = js.native
  val map: MapObject = js.native
  // TODO: Add market
  // TODO: Add powerCreeps
  // TODO: Add resources
  // TODO: Add rooms
  val shard: Shard = js.native
  // TODO: Add spawns
  // TODO: Add structures
  val time: Int = js.native

  def getObjectById(id: String): Option[JSObject] = js.native

  def notify(message: String, groupInterval: Int = 0): Unit = js.native
}

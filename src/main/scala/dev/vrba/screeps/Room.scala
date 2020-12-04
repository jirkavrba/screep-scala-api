package dev.vrba.screeps

import scala.scalajs.js

@js.native
trait Room extends js.Object {
  // TODO: Add controller
  val energyAvailable: Int = js.native
  val energyCapacityAvailable: Int = js.native
  val memory: Map[String, Any] = js.native
  val name: String = js.native
  // TODO: Add storage
  // TODO: Add terminal
  val visual: RoomVisual = js.native
}

